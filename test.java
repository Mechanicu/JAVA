import java.lang.Exception;
public class test{
    static void pop() throws NegativeArraySizeException{
        int[] arr = new int[-3];
    }   
    public static void main(String args[]){
        try{
            pop();
        }catch(NegativeArraySizeException e){
            System.out.println("pop()xxxxxxxxx");
        }
    }
}