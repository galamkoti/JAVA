import java.util.*;
public class cycle1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("enter n value");
        n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        int[] a = new int[n * n];
        int k = 0,sum=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[k] = arr[i][j];
                System.out.print(a[k]+" ");
                k+=1;
                if(i==j)
                {
                    sum+=arr[i][j];
                }
            }
        }
        System.out.println("sum="+sum);

    }
}
