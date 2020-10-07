//package homework2.hw2_2;
import java.util.Scanner;
public class Array_max {
    private long[] array = new long[10];
    private long max;
    
    public boolean get_value(){
        if (this.array == null) {System.out.println("fail to create the array.");return false;}
        //判断数组是否创建成功
        Scanner sc = new Scanner(System.in); 
        int i;
        System.out.println("please input the data:");
        for (i = 0; i < array.length; i++)
            this.array[i] = sc.nextLong();
        sc.close();
        return true;
    }
    
    public int max_volume(){
        if (this.array == null) return -1;
        this.max = this.array[0];
        int i;
        for (i = 0; i < this.array.length; i++)
            if (this.max < this.array[i])
                this.max = this.array[i];
        System.out.println(this.max);
        return 1;
    }
}
