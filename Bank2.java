public class Bank2
{
class Sbi implements Bank
{
    public void minimumBalance()
    {
        System.out.println("the minimum balance of SBI is 2000 rupees");
    }
    public void interestRate()
    {
        System.out.println("the interest rate of SBI is 7 percent");
    }
    public void Bankname()
    {
        System.out.println("the bank name is SBI");
    }
}
class AndhraBank implements Bank
{
    public void minimumBalance()
    {
        System.out.println("the minimum balance of AndhraBAnk is 5000 rupees");
    }
    public void interestRate()
    {
        System.out.println("the interest rate of SBI is 5 percent");
    }
    public void Bankname()
    {
        System.out.println("the bank name is AndhraBank");
    }
}
public static void main(String[] args) {
    // Bank2[] b2=new Bank2[2];8074108684;
    Sbi a=new Sbi();
    AndhraBank b=new AndhraBank();
    a.minimumBalance();
    a.Bankname();
    a.interestRate();
    b.minimumBalance();
    b.Bankname();
    b.interestRate();
}
}