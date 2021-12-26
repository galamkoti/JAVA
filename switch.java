import java.util.*;
class vowel
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a string");
        //String a=scan.nextLine();
        char ch=scan.next().charAt(0);
        scan.close();
        System.out.println("the string is"+ch);
        switch (ch) {
            case 'a':System.out.println("it is a vowel");
                break;
            case 'e':System.out.println("it is a vowel");
                break;
            case 'i':System.out.println("it is a vowel");
                break;
            case 'o':System.out.println("it is a vowel");
                break;
            case 'u':System.out.println("it is a vowel");
                break;
            default:System.out.println("it is not a vowel");
                break;
        }
    }
    
}