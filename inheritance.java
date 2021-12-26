class A
{
    int i=12;
    private int p=110;//cannot be accessed in child class
    void classA()
    {
        System.out.println("p="+p);
        System.out.println("i="+i);
        System.out.println("we are in super class");
    }
}
class B extends A
{
    int j=10;
    void showiplusj()
    {
    System.out.println("i+j="+(i+j));
    }
}
public class inheritance {
    public static void main(String[] args) {
        B b=new B();
        b.showiplusj();
        b.classA();
    }
}
