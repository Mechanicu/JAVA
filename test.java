import java.util.Scanner;
public class test{
    private long[] srn = new long[100];
    private static int srnp = 0;
    private long[] drn = new long[100];
    private static int drnp = 0;
    private long[] C = new long[100];
    public test(){
    }
    public test(long srn, long drn){
        while(srn != 0 || drn != 0){
            if (srn != 0){
                this.srn[test.srnp++] = srn % 10;
                srn = srn / 10;
            }
                if (drn != 0){
                this.drn[test.drnp++] = drn % 10;
                drn = drn / 10;
            }
        } 
    }
    public long[] get_srn_array(){
        long[] srn = new long[test.srnp];
        int i;
        for (i = 0; i < test.srnp; i++)
            srn[i] = this.srn[i];
        return srn;
    }
    public long[] get_drn_array(){
        long[] drn = new long[test.drnp];
        int i;
        for (i = 0; i < test.drnp; i++)
            drn[i] = this.drn[i];
        return drn;
    }

    public void ADD(){
        int i = 0;
        C[i] = (srn[i] + drn[i]) / 10;
        drn[i] = (srn[i] + drn[i]) % 10;
        for (i = 1; i <= test.drnp || i <= test.srnp; i++){
            C[i] = (srn[i] + drn[i] + C[i-1]) / 10;
            drn[i] = (srn[i] + drn[i] + C[i-1]) % 10;
        }
        test.drnp = i; 
    }
    public void SUB(){
        
    }

    public void print_result(){
        long[] drn = get_drn_array();
        int i;
        System.out.println("the srn_array is:");
        for(i = test.drnp - 1; i >= 0; i--)
            System.out.printf("%d",drn[i]);
        System.out.println();
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("input srn and drn:");
        test ts = new test(sc.nextLong(), sc.nextLong());
        sc.close();
        ts.ADD();
        ts.print_result();
    }
}