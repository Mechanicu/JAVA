package homework2.hw2_7;

public class mainf {
    public static void main(String args[]){
        Circle circle1 = new Circle(1.6666666);
        Rectangle rectangle1 = new Rectangle(6.666666, 9.99999);
        System.out.printf("the area of circle: %.3f\n", circle1.area());
        System.out.printf("the area of rectangle: %.3f\n", rectangle1.area());
    }
}
