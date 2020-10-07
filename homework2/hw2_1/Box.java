//package homework2.hw2_1;
import java.util.Scanner;

public class Box {
    private double lenth;
    private double width;
    private double height;

    public boolean get_value(){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("please input lenth, width and height:");
        this.lenth = sc.nextDouble(); this.width = sc.nextDouble(); this.height = sc.nextDouble();
        sc.close();
        
        if (this.lenth < 0 || this.width < 0 || this.height < 0) return false;
        //判断输入是否合法
        return true;
    }

    public void volume(){
        double volume = this.width * this.lenth * this.height;
        System.out.println(volume);
    }
}
