package homework1;
import java.util.Scanner;
public class hw1{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        long target = sc.nextLong();
        sc.close(); 
        long[] ass;
        ass = new long[10000];
        int i, a, sum = 0, j, sign;

        if (target == 0) 
        {
            sum = 0;
            System.out.println(sum);
            System.out.println(sum);
            System.out.println(target);
            return;
        }//当target为0时
        
        if (target < 0) sign = -1;
        else sign = 1;
        //判断是否为负数

        for (i = 0, a = 10; target != 0; i++)
        {
            ass[i] = target % a;
            target /= a;
            sum += ass[i];
        }

        System.out.println("the sum of the digits is:");
        if (sign < 0) System.out.println(-sum);
        else System.out.println(sum);
        System.out.println();
        //输出各位数和
        
        System.out.println("the digit:");
        if (sign < 0)
            for (j = 0; j < i; j++)
                System.out.println(-ass[j]);
        else 
            for (j = 0; j < i; j++)
                System.out.println(ass[j]);
        //输出各位数
        
        if (sign < 0)
        for (j = 1; j < i; j++)    
            ass[j] = -ass[j];
        System.out.println("the new int is：");
        for (j = 0; j < i; j++)    
            System.out.print(ass[j]);
        //输出逆序整数
    }
}
