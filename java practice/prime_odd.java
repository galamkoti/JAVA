import java.util.*;
public class prime_odd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("Enter n value");
        n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        sc.close();
        for(int i=0;i<n;i++)
        {
            if(primeNum(arr[i])==true && arr[i]%2!=0)
            {
                System.out.println(arr[i]+"Satisfied");
            }
            else{
                System.out.println(arr[i]+"Not Satisfied");
            }
        }

    }
    public static boolean primeNum(int k)
    {
        int count=0;
        for(int i=2;i<=k; i++)
        {
            if(k%i==0)
            {
                count+=1;
            }
        }
        if(count==1)
            {
                return true;
            }
            else
            {
                return false;
            }
    }
}
