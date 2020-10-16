package homework2.hw2_7;

abstract class Shape {
    public abstract double area();
}

class Circle extends Shape{
    private double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    public double area(){
        return 3.14159265 * radius * radius;
    }
}

class Rectangle extends Shape{
    private double length;
    private double width;
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    public double area(){
        return width*length;
    }
}
