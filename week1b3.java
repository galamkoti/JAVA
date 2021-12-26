public class week1b3 {
    public static void main(String[] args)
    {
        int n=Integer.parseInt(args[0]);
        for(int i=0;i<=n;i++)
        {
            System.out.println(fibonacii(i));
        }
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
