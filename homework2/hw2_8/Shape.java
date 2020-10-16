//package homework2.hw2_8;

abstract class Shape {
    public abstract double area();
}

class Square extends Shape {
    private double side;
    public Square(double side) {
        this.side = side;
        System.out.println("the area of square:");
    }

    public double area() {
        return side * side;
    }
}

class Triangle extends Shape{
    private double side;
    private double height;
    public Triangle(double side, double height){
        this.side = side;
        this.height = height;
        System.out.println("the area of triangle:");
    }

    public double area(){
        return side*height;
    }
}
