public class Circle extends GeometricObject
{
    private double radius;
    public Circle(){}
    //makes a circle with a radius
    public Circle(double radius){
        this.radius = radius;
    }
    //makes a circle with radius, color, and filled
    public Circle(double radius,String color, boolean filled){
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    //gives radius of circle
    public double getRadius(){
        return radius;
    }

    //change the radius
    public void setRadius(double radius){
        this.radius = radius;
    }

    //gives the area
    @Override 
    public double getArea(){
        return radius * radius * Math.PI;
    }

    //\gives the diameter
    public double getDiameter(){
        return 2 * radius;
    }

    //gives the perimeter
    @Override 
    public double getPerimeter(){
        return 2 * radius * Math.PI;
    }

    //gives info about the circle
    @Override 
    public String toString(){
        return super.toString() + "\nDate created: " + getDateCreated() +"\nRadius: " + radius;
    }

    //compares areas
    @Override
    public int compareTo(GeometricObject test){
        return (int) (getArea() - test.getArea());
    }

    //compares radius
    @Override
    public boolean equals(Object obj){
        try{
            Circle tester = (Circle) obj;
            return tester.getRadius() == getRadius();
        }
        catch (Exception cat){
            return false;
        }
    }
}