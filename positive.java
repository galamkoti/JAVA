import java.util.Scanner;



public class positive
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int no=sc.nextInt();
        if(no>0)
        {
            System.out.println("No is positive");
        }
        else if(no<0)
        {
            System.out.println("no is negative");
        }
        else
        {
            System.out.println("number is zero");
        }
        sc.close();
    }
}