package homework1;
public class hw4 {
    public static void main(String args[])
    {
        int x, y, z;//x, y, z应均为正数

        System.out.println("print x, y, z:");
        
        for (x = 1; x < 10; x++)
            for (y = 1; y < 10; y++)
                for (z = 0; z < 10; z++)
                    if (110*x + 100*y + 12*z == 532)
                        System.out.println(x+" "+y+" "+z);
    }
}
