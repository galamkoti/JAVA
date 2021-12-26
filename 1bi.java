import java.util.Scanner;
class concat{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number");
        String a=sc.nextLine();
        System.out.println("enter the second number");
        String b=sc.nextLine();
        sc.close();
        System.out.println(a+" and "+b);
    }
}
