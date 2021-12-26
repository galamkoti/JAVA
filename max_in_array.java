import java.util.Scanner;

public class max_in_array {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int max,min,n=5;
        int a[]=new int[n];
        System.out.println("enter"+n+"elements");
        for(int i=0;i<n;i++)
        {
            System.out.println("enter"+(i+1)+"element");
            a[i]=sc.nextInt();
        }
        max=maximum(a,n);
        System.out.println("the highest element is"+max);
        min=minimum(a,n);
        System.out.println("the lowest element is"+min);
        sc.close();
    }
    public static int maximum(int b[],int k)
    {
        int high=b[0];
        for(int i=0;i<k;i++)
        {
        if(b[i]>high)
        {
            high=b[i];
        }
        }
        return high;
    }
    public static int minimum(int b[],int k)
    {
        int low=b[0];
        for(int i=0;i<k;i++)
        {
            if(b[i]<low)
            {
                low=b[i];
            }
        }
        return low;
    }
}
