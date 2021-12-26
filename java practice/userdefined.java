import java.util.Scanner;

class UserdefinedException1 extends Exception
{

}
public class userdefined {
    public static void main(String[] args) {
        int age;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter age");
        age=sc.nextInt();
        sc.close();
        try
        {
            if(age<=0 || age>=120)
            {
                throw new UserdefinedException1();
            }
            else{
                System.out.println("No exception");
            }
        }
        catch(UserdefinedException1 e)
        {
            // e.printStackTrace();
            System.out.print("age exceeded");
        }
    }
    
}
