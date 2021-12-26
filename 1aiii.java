import java.util.*;
class fib
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the n value");
        int n=scan.nextInt();
        for(int i=0;i<=n;i++)
        {
            System.out.println(fibonacii(i));
        }
        scan.close();
    }
public static int fibonacii(int k)
{
    if(k==0)
        return 0;
    else if(k==1)
        return 1; 
    else
        return fibonacii(k-1)+fibonacii(k-2);
}
}