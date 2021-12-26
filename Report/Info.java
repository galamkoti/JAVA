package Report;
import pack1.*;
import pack2.*;
class Sports1 implements Sports
{
    public void displayInfo()
    {
        System.out.println("this is the Sports Information");
    }
}
public class Info {
    public static void main(String[] args) {
    Student1 s=new Student1();
    Sports1 s1=new Sports1();
    System.out.println("Roll no="+s.rollNo);
    System.out.println("Name is="+s.Name);
    s1.displayInfo();
    }
}
