import java.util.Scanner;

public class week2b {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n value");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        sc.close();
        for(int i=0;i<n;i++)
        {
            if(primeNum(a[i])==true && a[i]%2!=0)
            {
                System.out.println(a[i]+" Satisfied");
            }
            else{
                System.out.println(a[i]+" Not found");
            }
        }
    }
    public static boolean primeNum(int k)
    {
        int count=0;
        for(int i=1;i<=k;i++)
        {
            if(k%i==0)
            {
               count+=1;
            }
        }
        if(count==2)
        {
            return true;
        }
        else{
            return false;
        }
    }
}
