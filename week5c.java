import java.util.Arrays;
import java.util.Scanner;
// program to check the two strings are anagrams or not
public class week5c {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first string");
        String s1=sc.next();
        System.out.println("enter the Second string");
        String s2=sc.next();
        char c1[]=s1.toCharArray();
        char c2[]=s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        String str1=String.valueOf(c1);
        String str2=String.valueOf(c2);
        System.out.println("string 1"+str1);
        System.out.println("string 2"+str2);
        if(str1.equals(str2))
        {
            System.out.println("the strings are Anagrams");
        }
        else
        {
            System.out.println("the strings are not Anagrams");
        }
        sc.close();
    }
}
