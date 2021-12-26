import java.util.Random;
import java.util.Scanner;
class week8a
{
    public static void main(String[] args) {
        Random ran=new Random();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number");
        int first=sc.nextInt();
        System.out.println("enter the second number");
        int last=sc.nextInt();
        for(int i=0;i<10;i++)
        {
        int n=first+ran.nextInt(last+1-first);//INCLUDING FIRST AND LAST
        //int n=first+ran.nextInt(last-first); //INCLUDING FIRST BUT NOT LAST
        System.out.println("the random number="+n);
        }
        sc.close();
    }
}