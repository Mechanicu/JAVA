package homework2.hw2_2;
public class mainf {
    public static void main(String args[]){
        Array_max arrmax = new Array_max();
        if (!arrmax.get_value()){System.out.println("Fail to create the array."); return;} ;
        //判断是否创建成功
        System.out.println("the max data is:");
        arrmax.max_volume();
    }
}
