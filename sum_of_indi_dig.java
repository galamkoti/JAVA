import java.util.Scanner;

public class sum_of_indi_dig {
     public static void main(String[] args)
     {
         int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number to find sum");
        int digit=sc.nextInt();
        int k=digit;
        while (k>0)
        {
            int rem=k%10;
            sum+=rem;
            k=k/10;
        }
        System.out.println("the sum of digits is"+sum);
        sc.close();
     }
}
