import java.util.*;

class character
{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the hours");
        int hrs=sc.nextInt();
        System.out.println("enter the minutes");
        int min=sc.nextInt();
        System.out.println("enter the seconds");
        int sec=sc.nextInt();
        System.out.println("enter AM or PM");
        String s=sc.next();
        if(s.equals("AM"))
        {
            System.out.println(hrs+":"+min+":"+sec+"AM");
        }
        else if(s.equals("PM"))
        {
            System.out.println((hrs+12)+":"+min+":"+sec+"PM");
        }
        sc.close();
    }
}