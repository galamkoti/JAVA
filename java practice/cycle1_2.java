//sorting array numbers by frequency of occuring
import java.util.*;
class cycle1_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("Enter n value");
        n=sc.nextInt();
        int[] arr=new int[n];
        int high=-1;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]>high)
            {
                high=arr[i];
            }
        }
        sc.close();
        int array[][]=new int[2][high+1];
        for(int i=0;i<n;i++)
        {
            array[0][arr[i]]=arr[i];
            array[1][arr[i]]++;
        }
        // sort(array,high+1);
        for(int i=0;i<high+1;i++)
        {
            if(array[0][i]!=0)
            {
                System.out.print("The Value ="+array[0][i]);
                System.out.println("The frequency ="+array[1][i]);
                
            }
        }
    }
    public static void sort(int a[][],int k)
    {
        int p,q;
        for(int i=0;i<k;i++)
        {
            for(int j=0;j<(k-i-1);j++)
            {
                if(a[1][j]<a[1][j+1])
                {
                    p=a[1][j];
                    a[1][j]=a[1][j+1];
                    a[1][j+1]=p;

                    q=a[0][j];
                    a[0][j]=a[0][j+1];
                    a[0][j+1]=q;
                }
            }
        }
    }
}
