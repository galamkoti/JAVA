class Bank_database
{
    int account_balance;
    Bank_database(int acc_bal)
    {
        account_balance=acc_bal;
    }
    void deposit(int amount_dep)
    {
        System.out.println("Amount before depositing="+account_balance);
        account_balance+=amount_dep;
        System.out.println("Amount After depositing="+account_balance);
    }
    void withDraw(int withdrawAmount)
    {
        System.out.println("Amount before withdrawing="+account_balance);
        account_balance-=withdrawAmount;
        System.out.println("Amount After withdrawing="+account_balance);
    }
    int returnbalance()
    {
        return account_balance;
    }
public static void main(String[] args) {
    Bank_database b1=new Bank_database(10000);
    b1.deposit(2000);
    b1.withDraw(3000);
    System.out.println("Final Account balance="+b1.returnbalance());
}
}