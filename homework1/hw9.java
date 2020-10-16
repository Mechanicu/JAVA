package homework1;
import java.util.Scanner;
public class hw9 {
   
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double op1 = sc.nextDouble(), op2 = sc.nextDouble();
        String op = sc.next();
        sc.close();

        if (op.equals("+")) System.out.println(op1+op2);
        else if (op.equals("-")) System.out.println(op1-op2);
        else if (op.equals("*")) System.out.println(op1*op2);
        else if (op.equals("/")) System.out.println(op1/op2);
        //根据运算符判断运算方式
    }
}
