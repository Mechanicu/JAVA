public class hw2{
    public static void main(String args[])
    {
        int i, sev = 0, j = 0;
        int target[] = new int[40];
        for (i = 0;; i++)
        {
            sev = i*7 + 2;
            if (sev <= 200)
                target[i] = sev;
            else break;
        }
        for (j = 0; j <= i; j++)
        {
            if (target[j] % 5 == 3 && target[j] % 3 == 2)
                continue;
            else target[j] = 0;
        }
        System.out.println("the target int are:");
        for (j = 0; j <= i; j++)
            if (target[j] != 0)
                System.out.println(target[j]);
    }
}