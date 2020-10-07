import java.util.Scanner;
public class hw5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("please input lower and upper bound:");
        int m = sc.nextInt(), n = sc.nextInt(), i, j;
        sc.close();

        if (m <= 0 || n <= 0) {System.out.println("unaccepted number"); return;}//判断m, n是否合法

        System.out.println("target prime numbers:");
        for (i = m+1; i < n; i++)
            for (j = 2; j <= i; j++)
            {
                if (i % j == 0 && j != i) break;
                if (j == i) System.out.println(i);
            }
    }
}
