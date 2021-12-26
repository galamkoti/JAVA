import java.util.Scanner;

public class sum_of_squares {
    public static void main(String[] args)
    {
        System.out.println("enter upto which u want squares");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum+=Math.pow(i, 2);
        }
        System.out.println("sum of squares"+sum);
        sc.close();
    }
}
