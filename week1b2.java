public class week1b2 {
    public static void main(String[] args)
    {
        
        if(args[3].equals("AM"))
        {
            System.out.println(args[0]+":"+args[1]+":"+args[2]+args[3]);
        }
        else if(args[3].equals("PM"))
        {
            System.out.println((Integer.parseInt(args[0])+12)+":"+args[1]+":"+args[2]+args[3]);
        }
    }
}
