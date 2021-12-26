class Example2
{
    synchronized static void display()
    {
        Thread t=Thread.currentThread();
        for(int i=0;i<5;i++)
        {
            try{
                    Thread.sleep(1000);
                    System.out.println(t.getName()+" "+i);
                }
                 catch (Exception e) {
                     System.out.println(e);
            }
        }
    }

    // private void sleep(int i) {
    // }
}
class T2 extends Thread
{
    public void run()
    {
        Example2.display();
    }
}
class week11b3
{
    public static void main(String[] args) 
    {
        T2 t1=new T2();
        T2 t2=new T2();
        t1.start();
        // try
        // {
        //     t1.join();
        // }
        // catch(Exception e)
        // {
        //     System.out.println(e);   
        // }
        t2.start();
    }
}