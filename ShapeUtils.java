import java.lang.Math;
// Author: Chase Blodgett

public class ShapeUtils{
/** This function takes in two points with x,y coordinates and returns
* the distance between the two points(as a double);
*/
  public static double distance(Point p1, Point p2){
    return Math.sqrt(Math.pow((p1.getX() - p2.getX()),2) + Math.pow((p1.getY() - p2.getY()),2));
  }
/** This function finds the center point of a polygon
* returns a point object with x,y coordinates
*/
  public static Point getCenter(Polygon poly){
    double xValues = 0;
    double yValues = 0;
    for(int i = 0; i < poly.getNumPoints(); i++){
      xValues = xValues + poly.getPoint(i).getX();
      yValues = yValues + poly.getPoint(i).getY();
    }
    Point center = new Point(xValues / poly.getNumPoints(), yValues / poly.getNumPoints());
    return center;
  }
/** This function finds the perimeter of a polygon.
* Adds each side of the polygon together to find the perimeter
*/
  public static double getPerimeter(Polygon poly){
    double perimeter = 0;
    for(int i = 1; i <= poly.getNumPoints() ;i++){
      if(i == 1){
        perimeter = perimeter + distance(poly.getPoint(0), poly.getPoint(i));
      }
      else if(i > 1 && i < poly.getNumPoints()){
        perimeter = perimeter + distance(poly.getPoint(i-1),poly.getPoint(i));
      }
      else{
        perimeter = perimeter + distance(poly.getPoint(i-1), poly.getPoint(0));
      }
    }
    return perimeter;
  }
/** This function finds the perimeter of a circle using the formula P = 2*PI*radius
* Takes in a circle object and returns the perimeter as a double
*/
  public static double getPerimeter(Circle c){
    return (2 * c.getRadius() * Math.PI);
  }
/** This function finds the area of circle using the formula A = PI * r^2
* Takes in an object of Circle class and returns the area as a double
*/
  public static double getArea(Circle c){
    return (Math.PI * Math.pow(c.getRadius(),2));
  }
/** This function checks for overlap between two circles of the circle class
* Checks if the distance between the center points is less than the two radii added together
* Returns true if there is overlap between the two circles (distance between is less than radii added together)
* returns false if there is no overlape between the circles (distance between is greater than radii added together)
*/
  public static boolean isThereOverlap(Circle c1, Circle c2){
    if(distance(c1.getCenter(),c2.getCenter()) < (c1.getRadius() + c2.getRadius())){
      return true;
    }
    else{
      return false;
    }
  }
/** This function takes a circle and returns a point that is above- and left-of all points
on the circle.
*/
  public static Point getTopLeft(Circle c){
    Point topLeft = new Point(c.getCenter().getX() - c.getRadius(), c.getCenter().getY() - c.getRadius());
    return topLeft;
  }
/** This function takes a circle and returns a point that is below- and right-of
all points on the circle
*/
  public static Point getBottomRight(Circle c){
    Point topRight = new Point(c.getCenter().getX() + c.getRadius(), c.getCenter().getY() + c.getRadius());
    return topRight;
  }
}
