import java.util.Scanner;

public class palindrome {
    public static void main(String[] args)
    {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number to find whether it is palindrome");
        int num=sc.nextInt();
        int k=num;
        while (k>0)
        {
            int rem=k%10;
            sum=sum*10+rem;
            k=k/10;
        }
        if(sum==num)
        {
            System.out.println("it is palindrome");
        }
        else
        {
            System.out.println("it is not a palindrome");
        }
        sc.close();
    }
}
