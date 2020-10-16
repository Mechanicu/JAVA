package homework1;
import java.util.Scanner;
public class hw10 {
    public static void main(String args[]){
        double i, j = 1, x, ass = 1, sign = 1, ass2 = 0, X = 1, result = 1;
        Scanner sc = new Scanner(System.in);
        x = sc.nextDouble();//建议输入不超过+30/-30
        sc.close();

        int n = 100;
        for (i = 2; i <= n; i += 2)//n取100时可以保证基本的精确度，同时不易算炸
        {
            sign *= -1;
            for (; j <= i; j++)
            {    
                ass *= j;
                X *= x;
            }
            ass2 = sign*(X/ass);
            result += ass2;
        }//对幂级数进行近似计算

        System.out.printf("%.8f\n", result);
    }
}
