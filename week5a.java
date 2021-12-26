import java.util.Arrays;
import java.util.Scanner;
// ) Accept a String and a number „n‟ from user. Divide the given string into substrings each of 
// size „n‟ and sort them lexicographically.
public class week5a
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1="hellogoodmorning";
        System.out.println("enter n value");
        int n=sc.nextInt();
        if(s1.length()%n!=0)
        {
            System.out.println("String cannot be divided");
        }
        else
        {
            int i=0;
            int size=s1.length()/n;
            String s[]=new String[size];
            for(int j=0;j<size;j++)
            {
                s[j]=s1.substring(i,i+n);
                i=i+n;
            }
            Arrays.sort(s);
            for(int j=0;j<size;j++)
            {
                System.out.println(s[j]);
            }
        }
        sc.close();
    }
}