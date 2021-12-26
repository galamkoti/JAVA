import java.util.Scanner;

public class linear_search {
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of elements");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("enter"+(i+1)+"element");
            a[i]=sc.nextInt();
        }
        linear(a, n);
        sc.close();
    }
    public static void linear(int b[],int k)
    {
        int i;
        Scanner sc1=new Scanner(System.in);
        System.out.println("enter the element to search");
        int search=sc1.nextInt();
        sc1.close();
        for(i=0;i<k;i++)
        {
            if(b[i]==search)
            {
                System.out.println("element found at"+(i+1)+"position");
                break;
            }
        }
        if(i==k)
        {
            System.out.println(search+" not found");
        }
        
    }
    
}
