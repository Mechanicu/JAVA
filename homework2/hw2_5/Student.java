//package homework2.hw2_5;

import java.util.Scanner;
public class Student {
    private String num;
    private String name;
    private int sex;
    Scanner sc = new Scanner(System.in);
    
    public void set_value(){
        System.out.println("please input the number:");
        this.num = sc.next();
        System.out.println("please input the name:");
        this.name = sc.next();
        System.out.println("please input the sex(1 is male, 0 is female):");
        this.sex = sc.nextInt();
    }

    public void display(){
        System.out.printf("the num of the student: %d\n",this.num);
        System.out.printf("the name of the student: %s\n",this.name);
        if (this.sex == 1)System.out.println("the sex of the student: male");
        else System.out.println("the sex of the student: female");
    }

    public String get_num(){
        return this.num;
    }
    public String get_name(){
        return this.name;
    }
    public int get_sex(){
        return this.sex;
    }
}

class Student1 extends Student{
    private String age;
    private String addr;

    public void set_value_1(){
        set_value();
        System.out.println("please input the age:");
        this.age = sc.next();
        System.out.println("please input the address:");
        this.addr = sc.next();
    }

    public void display_1(){
        System.out.printf("the number of the student1: %s\n", get_num());
        System.out.printf("the name of the student1: %s\n", get_name());
        if (get_sex() == 1)System.out.printf("the student1 is male.\n");
        else System.out.printf("the student1 is famale\n");
        System.out.printf("the age of the student1 is: %s\n", this.age);
        System.out.printf("the address of the student1: %s\n", this.addr);
    }
}
