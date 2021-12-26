import java.util.Scanner;

public class week2c {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n value");
        int n=sc.nextInt();
        int a[]=new int[n];
        int high=-1;
        System.out.println("enter the array elments");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(a[i]>high)
            {
                high=a[i];
            }
        }
        int arr[][]=new int[2][high+1];
        for(int j=0;j<n;j++)
        {
            arr[1][a[j]]++;
            arr[0][a[j]]=a[j];
        }
        sorting(arr, high+1);
        sc.close();
        for(int i=0;i<high+1;i++)
        {
            if(arr[0][i]!=0)
            {
                System.out.print("value"+arr[0][i]+"    ");
                System.out.print("frequency"+arr[1][i]);
                System.out.println();
            }
        }
    }
    public static void sorting(int a[][],int max)
    {
        for(int i=0;i<max;i++)
        {
            for(int j=0;j<(max-i-1);j++)
            {
                if(a[1][j]<a[1][j+1])
                {
                    //swapping frequency
                    int m=a[1][j+1];
                    a[1][j+1]=a[1][j];
                    a[1][j]=m;
                    
                    //swapping numbers
                    int k=a[0][j+1];
                    a[0][j+1]=a[0][j];
                    a[0][j]=k;
                }
            }
        }
    }
}
