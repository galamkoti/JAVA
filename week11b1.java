class Example1
{
    synchronized void display()
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
class T1 extends Thread
{
    Example1 e2;
    T1(Example1 e)
    {
        this.e2=e;
    }
    public void run()
    {
        e2.display();
    }
}
class week11b1
{
    public static void main(String[] args) 
    {
        Example1 e1=new Example1();
        T1 t1=new T1(e1);
        T1 t2=new T1(e1);
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