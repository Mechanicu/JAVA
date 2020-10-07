import java.util.Scanner;
public class hw3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("please input the days:");
        int day = sc.nextInt();
        sc.close();
        if (day <= 0) {System.out.println("unaccepted number"); return;}//判断天数是否合法
        
        int i, num = 1;
        for (i = 1; i < day; i++)
            num = 2*(num + 1);
        
        System.out.println("the number of peach is:");
        System.out.println(num);//输出原始桃子数
    }
}
