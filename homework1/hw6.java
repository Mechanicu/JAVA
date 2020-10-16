package homework1;
//import java.util.Scanner;
public class hw6{
    
    public static void reverse(long target)
    {
        long[] ass;
        ass = new long[10000];
        int i, a, j, sign;

        if (target < 0) sign = -1;
        else sign = 1;
        //判断是否为负数

        if (target == 0) {System.out.println(target); return;}//当target为0时

        for (i = 0, a = 10; target != 0; i++)
        {
            ass[i] = target % a;
            target /= a;
        }
        
        if (sign < 0)
            for (j = 1; j < i; j++)    
                ass[j] = -ass[j];
        System.out.println("the new int is：");
        for (j = 0; j < i; j++)    
            System.out.print(ass[j]);
        //输出逆序整数
    }


    // public static void main(String[] args){
    //     Scanner sc = new Scanner (System.in);
    //     long target = sc.nextLong();
    //     sc.close();
    //     reverse(target);
    //     System.out.println(); 
    // }
}
