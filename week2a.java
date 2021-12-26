import java.util.Scanner;

public class week2a {
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter no of numbers you want");
    int n=sc.nextInt();
    long k[]=new long[n];
    for(int i=0;i<n;i++)
    {
        k[i]=sc.nextLong();
    }
    sc.close();
    for(int i=0;i<n;i++)
    {
        System.out.println("for element in position"+(i));
        if(k[i]>=Math.pow(2,-7) && k[i]<=Math.pow(2,7)-1)
        {
            System.out.println("the number can be fit in byte type");
        }
        if(k[i]>=Math.pow(2,-15) && k[i]<=Math.pow(2,15)-1)
        {
            System.out.println("the number can be fit in short type");
        }
        if(k[i]>=Math.pow(2,-31) && k[i]<=Math.pow(2,31)-1)
        {
            System.out.println("the number can be fit in int type");
        }
        if(k[i]>=Math.pow(2,-63) && k[i]<=Math.pow(2,63)-1)
        {
            System.out.println("the number can be fit in long type");
        }
        System.out.println();
    }
    }
}
