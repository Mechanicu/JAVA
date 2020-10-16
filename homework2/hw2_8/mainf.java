//package homework2.hw2_8;

public class mainf {
    public static void main(String args[]){
        Square square1 = new Square(9.9999999);
        System.out.printf("%.6f\n",square1.area());
        Triangle triangle1 = new Triangle(6.66666, 3.3333333);
        System.out.printf("%.6f\n",triangle1.area());
    }
}
