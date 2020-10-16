package homework2.hw2_4;

import java.util.Scanner;
public class Date {
    private int year;
    private int month;
    private int day;

    public boolean set_date(){
        System.out.println("please input year, month and day:");
        Scanner sc = new Scanner(System.in);
        this.year = sc.nextInt();
        this.month = sc.nextInt();
        this.day = sc.nextInt();
        sc.close();

        if (this.year < 0|| this.month < 0|| this.day < 0) return false;
        else if (this.month > 12 || this.day > 31) return false;
        //判断日期是否合法
        return true;
    }

    public void show_date(boolean bool){
        if (bool == false) {System.out.println("The input is wrong."); return;}//判断日期是否合法
        System.out.printf("%d年，%d月,%d日\n", this.year, this.month, this.day);
    }
}
