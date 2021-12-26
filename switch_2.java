//import java.util.*;
class vowels
{
    public static void main(String[] args)
    {
        System.out.println("the first arg is"+args[0]);
        char ch=args[0].charAt(0);
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


