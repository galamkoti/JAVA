import java.util.Scanner;

public class week3a
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n value");
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.print("diagonal elements are");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j)
                {
                    System.out.print(a[i][i]+" ");
                    
                }
            }
        }
        System.out.println();
        sc.close();
        int b[]=new int[n*n];
        int k=0;
            for(int i=0;i<n;i++)
            {
            for(int j=0;j<n;j++)
            {
                b[k]=a[i][j];
                k++;
            }
            }
        System.out.println("single array elements are");
        for(k=0;k<(n*n);k++)
        {
            System.out.print(""+b[k]+" ");
            
        }
    }
}