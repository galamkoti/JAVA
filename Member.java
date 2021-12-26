import java.util.*;
public class Member {
    String Name;
    int Age;
    long phoneNumber;
    String Address;
    int salary;
    void printSalary(Member b1)
    {
        System.out.println("salary="+b1.salary);
    }
}
class Employee extends Member
{
    String spl;
    Employee( String Name,int Age,long phoneNumber,String Address,int salary,String specialization)
    {
        this.Name=Name;
        this.Age=Age;
        this.phoneNumber=phoneNumber;
        this.Address=Address;
        this.salary=salary;
        spl=specialization;
    }
    void printdetails()
    {
        System.out.println("Name is="+this.Name);
        System.out.println("Age is="+this.Age);
        System.out.println("phone number is="+this.phoneNumber);
        System.out.println("Address is="+this.Address);
        System.out.println("Salary is="+this.salary);
        System.out.println("Specialization is="+spl);
    }
}
    class Manager extends Member
    {
        String dep;
        Manager( String Name,int Age,long phoneNumber,String Address,int salary,String department)
        {
            this.Name=Name;
            this.Age=Age;
            this.phoneNumber=phoneNumber;
            this.Address=Address;
            this.salary=salary;
            dep=department;
        }
        void printdetails2()
        {
            System.out.println("Name is="+this.Name);
            System.out.println("Age is="+this.Age);
            System.out.println("phone number is="+this.phoneNumber);
            System.out.println("Address is="+this.Address);
            System.out.println("Salary is="+this.salary);
            System.out.println("Department is="+dep);
        }
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    Employee e1=new Employee("sunny",20,988635678,"mumbai",200000,"hardworking");
    e1.printdetails();
    Manager m1=new Manager("mia",25,98765432,"usa",1000000,"sins");
    m1.printdetails2();
    e1.printSalary(e1);
    m1.printSalary(m1);
    System.out.println("enter the number of objects you want");
    int n=sc.nextInt();
    Employee e[]=new Employee[n];
    for(int i=0;i<n;i++)
    {
        e[i]=new Employee("sunny",20,988635678,"mumbai",200000,"hardworking");
        e[i].printSalary(e[i]);
    }
    sc.close();
}
}