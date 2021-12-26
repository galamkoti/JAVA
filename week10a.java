import java.util.Scanner;
public class week10a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1,num2;
        String s="abc";
        try{
            System.out.println("we r in try block");
            num1=sc.nextInt();
            num2=sc.nextInt();
            int result=num1/num2;
            System.out.println("result="+result);
        }
        catch(ArithmeticException e1)
        {
            System.out.println("Divison by zero occured:"+e1);
        }
        try{
           int num3=Integer.parseInt(s);
           System.out.println(num3);
        }
        catch(NumberFormatException e2)
        {
            System.out.println("It is a number format exception:"+e2);
        }
        sc.close();
    }
}