import java.util.Scanner;
public class cycle1_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter n value");
        n=sc.nextInt();
        int[][] arr=new int[n][n];
        int sum1=0,sum2=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
                if(i==j)
                {
                    sum1+=arr[i][j];
                }
                if(i==n-j-1)
                {
                    sum2+=arr[i][j];
                }
            }
        }
        sc.close();
        System.out.print(Math.abs(sum1-sum2));
    }   
}
