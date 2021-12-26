import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
class Employee1
{
    int id;
    String branch,place;
    Employee1(int id,String branch,String place)
    {
        this.id=id;
        this.branch=branch;
        this.place=place;
    }
}
public class week8c {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<Integer,Employee1> h1=new HashMap<>();
        Employee1 e1=new Employee1(101, "BusinessAffairs", "WaterLoo");
        Employee1 e2=new Employee1(102, "Management", "Tornoto");
        Employee1 e3=new Employee1(103, "Web development", "Vancoure");
        h1.put(1, e1);
        h1.put(2, e2);
        h1.put(3, e3);
        for (Map.Entry<Integer,Employee1> m:h1.entrySet()) {
            Employee1 e4=m.getValue();
            System.out.println(m.getKey()+" employee");
            System.out.println(e4.id+" "+e4.branch+" "+e4.place);
        }
        try
        {
        System.out.println("enter the key to get value");
        int search=sc.nextInt();
        Employee1 k1=h1.get(search);
        System.out.println(k1.id+" "+k1.branch+" "+k1.place);
        }
        catch(NullPointerException p)
        {
            System.out.println("Plaese enter valid key");
        }
        sc.close();
    }
}