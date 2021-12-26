import java.util.Scanner;

public class week3c {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of  nxn matrix");
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        int d1=0,d2=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j)
                {
                d1+=a[i][i];
                }
                if(n-i-1==j)
                {
                d2+=a[i][j];
                }
            }
        }
        
        System.out.print("difference is"+Math.abs(d1-d2));
        sc.close();
    }
}
