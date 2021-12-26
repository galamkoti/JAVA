class Example
{
    void display1()
    {
        Thread t=Thread.currentThread();
        synchronized(this)
        {
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
    }

    // private void sleep(int i) {
    // }
}
class T extends Thread
{
    Example e2;
    T(Example e)
    {
        this.e2=e;
    }
    public void run()
    {
        e2.display1();
    }
}
class week11b2
{
    public static void main(String[] args) 
    {
        Example e1=new Example();
        T t1=new T(e1);
        T t2=new T(e1);
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