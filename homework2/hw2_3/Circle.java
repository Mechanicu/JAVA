package homework2.hw2_3;

import java.util.Scanner;
public class Circle {
    private double radius;

    public boolean get_value(){
        System.out.println("please imput the radius:");;
        Scanner sc = new Scanner(System.in);
        this.radius = sc.nextDouble();
        sc.close();
        
        if(this.radius < 0) return false;//判断输入是否合法
        return true;
    }

    public void volume(boolean bool){
        if (bool == false) {System.out.println("The radius is wrong.");return;}
        //判断输入是否合法
        double p = 3.14159265;
        System.out.println("the volume is:"+p*this.radius*this.radius*this.radius*4/3);
    }
    
}
