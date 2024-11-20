import java.awt.Color;
// Author: Chase Blodgett

public class DrawFigure{
  public static void main(String[] args){

    ShapeDrawer picture = new ShapeDrawer(1000,1000);

// Create and add a polygon in the shape of a house to the picture
    Point [] house = new Point[9];
    house[0] = new Point(0,1000);
    house[1] = new Point(0,630);
    house[2] = new Point(100,615);
    house[3] = new Point(100,515);
    house[4] = new Point(175,515);
    house[5] = new Point(175,615);
    house[6] = new Point(600,0);
    house[7] = new Point(1000,500);
    house[8] = new Point(1000,1000);
    Polygon houseShape = new Polygon(house);
    Color houseFill = new Color(102,55,0);
    Color houseStroke = new Color(0,0,0);
    picture.setStroke(houseStroke);
    picture.setFill(houseFill);
    picture.draw(houseShape);

// Create and add a polygon in the shape of a door to the picture
    Point [] door = new Point[4];
    door[0] = new Point(775,1000);
    door[1] = new Point(625,1000);
    door[2] = new Point(625,750);
    door[3] = new Point(775,750);
    Polygon doorShape = new Polygon(door);
    Color doorFill = new Color(102,102,102);
    Color doorStroke = new Color(0,0,0);
    picture.setStroke(doorStroke);
    picture.setFill(doorFill);
    picture.draw(doorShape);

// create and add a sun in the shape of a circle to the picture
    Point sunPosition = new Point(200,200);
    Circle sun = new Circle(sunPosition,75.0);
    Color sunFill = new Color(255,204,0);
    Color sunStroke = new Color(255,255,0);
    picture.setStroke(sunStroke);
    picture.setFill(sunFill);
    picture.draw(sun);

    picture.writeToFile("house.png");
  }
}
