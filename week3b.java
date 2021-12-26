import java.util.Scanner;

public class week3b {
    public static void main(String[] args)
    {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter how many years you want");
        int years=sc.nextInt();
        System.out.println("enter how many ids you want");
        int id=sc.nextInt();
        int a[][]=new int[years+1][id+1];
        System.out.println("enter years");
        for(int i=1;i<=years;i++)
        {
            a[i][0]=sc.nextInt();
        }
        System.out.println("enter ids");
        for(int i=1;i<=id;i++)
        {
            a[0][i]=sc.nextInt();
        }
        for(int i=1;i<=years;i++)
        {
            for(int j=1;j<=id;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<=years;i++)
        {
            for(int j=0;j<=id;j++)
            {
                System.out.print(a[i][j]+"  ");
            }
            System.out.println();
        }
        sc.close();
        int max=a[1][1];
        int b=0,p=0;
        for(int i=1;i<=years;i++)
        {
            for(int j=1;j<=id;j++)
            {
                if(a[i][j]>max)
                {
                    max=a[i][j];
                    p=i;
                    b=j;
                }
            }
        }
        System.out.println("the more demanded item is"+max);
        System.out.println("the year is"+a[p][0]);
        System.out.println("the id is"+a[0][b]);
    }
}
