package homework2.hw2_6;

public class Student{
    private String num;
    private String name;
    public Student(){}
    
    public Student(String num, String name){
        this.num = num;
        this.name = name;
    }

    public void show(){
        System.out.printf("the num of the student: %s\n", num);
        System.out.printf("the name of the student: %s\n", name);
    }
    public String get_name(){
        return this.name;
    }
    public String get_num(){
        return this.num;
    }
}

class Student1 extends Student{
    private String age;
    private String addr;
    Student monitor;
    public Student1(String num_stu, String name_stu, String age, String addr, String num_mon, String name_mon){
        super(num_stu, name_stu);
        this.age = age;
        this.addr = addr;
        monitor = new Student(num_mon, name_mon);
    }

    public void show(){
        System.out.printf("the num of the student: %s\n", get_num());
        System.out.printf("the name of the student: %s\n", get_name());
        System.out.printf("the age of the student: %s\n", this.age);
        System.out.printf("the address of the student: %s\n", this.addr); 
        System.out.printf("monitor name: %s\n", monitor.get_name());
        System.out.printf("monitor name: %s\n", monitor.get_num());
    }
}
