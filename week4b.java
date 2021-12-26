class Calculator
{
    static int a=0;
    Calculator()
    {
        a++;
    }
    public static int powerInt(int num1,int num2)
    {
        return ((int)Math.pow(num1,num2));
    }
    public static double powerDouble(double num1,double num2)
    {
        return Math.pow(num1,num2);
    }
}
public class week4b {
    public static void main(String[] args)
    {
        // Calculator c1=new Calculator();
        System.out.println(Calculator.powerInt(12,2));
        System.out.println(Calculator.powerDouble(3.5,2.4));
        System.out.println("no of objects created="+Calculator.a);
    }
}
