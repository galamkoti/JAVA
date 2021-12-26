class UserdefinedException extends Exception
{
     String s;
    UserdefinedException(String str)
    {
        s=str;
    }
    public String toString()
    {
        return ("exception occured"+s);
    }
}
class week10b
{
    public static void main(String[] args) {
        int balance=1000,withdraw=2000;
        try{
            if(balance<withdraw)
            {
                throw new UserdefinedException("You are out of Balance");
            }
            else
            {
                System.out.println("You can proceed to with draw");
            }
        }
        catch(UserdefinedException e)
        {
            System.out.println("we r in catch block");
            System.out.println(e);
        }
    }
}
