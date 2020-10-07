//import java.util.Scanner;

public class hw8 {
    public static int max(int i, int j, int k){
        i = i < j ? j : i;//获得i， j中最大的数
        return k = i < k ? k : i;//获得i，j，k中最大的数
    }
    
    // public static void main(String args[]){
    //     Scanner sc = new Scanner(System.in);
    //     int i = sc.nextInt(), j = sc.nextInt(), k = sc.nextInt();
    //     sc.close();
    //     System.out.printf("%d\n", max(i, j, k)); 
    // }
}
