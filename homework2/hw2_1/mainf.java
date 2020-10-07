// package homework2.hw2_1;
public class mainf {
    public static void main(String args[]){
        Box box1 = new Box();
        if (!box1.get_value()) {System.out.println("cannot calculate."); return;}
        //判断输入数据是否合法
        
        System.out.println("the volume is:");
        box1.volume();
    }
}
