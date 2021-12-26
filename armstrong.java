import java.util.Scanner;

public class armstrong {
    public static void main(String[] args)
    {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter one number");
        int num=sc.nextInt();
        int k=num;
        while(k>0)
        {
            int rem=k%10;
            sum+=Math.pow(rem,3);
            k/=10;
        }
        if(sum==num)
        {
            System.out.println("the number is  an armstrong");
        }
        else
        {
            System.out.println("the number is  not an armstrong");
        }
        sc.close();
        //changed java file
    }
}
