import java.util.Scanner;

// Accept an array of strings and display the number of vowels and consonants occurred in 
// each string.
public class week5b {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of array elements you want");
        int n=sc.nextInt();
        String arr[]=new String[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.next();
        }
        for(int i=0;i<n;i++)
        {
            int vow=0,con=0;
            char ary[]=arr[i].toCharArray();
            for(int k=0;k<arr[i].length();k++)
            {
                if(ary[k]=='a'||ary[k]=='e'||ary[k]=='i'||ary[k]=='o'||ary[k]=='u'
                ||ary[k]=='A'||ary[k]=='E'||ary[k]=='I'||ary[k]=='O'||ary[k]=='U')
                {
                    vow++;
                }
                else
                {
                    con++;
                }
            }
            System.out.println("string is = "+arr[i]+" and vowels="+vow+"consonants="+con);
        }
        sc.close();
    }
}