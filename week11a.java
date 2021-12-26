class MyThread1 extends Thread{
    public void run()
    {
        try {
                while(true)
                {
                Thread.sleep(1000);
                System.out.println("Good Morning");
                }
        } 
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
class MyThread2 extends Thread{
    
    public void run()
    {
        try {
                while(true)
                {
                Thread.sleep(2000);
                System.out.println("Hello");
                }
        } 
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
class MyThread3 extends Thread{
    
    public void run()
    {
        try {
                while(true)
                {
                Thread.sleep(3000);
                System.out.println("Welcome");
                }
        } 
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}

public class week11a {
    public static void main(String[] args) {
        MyThread1 t1=new MyThread1();
        MyThread2 t2=new MyThread2();
        MyThread3 t3=new MyThread3();
        t1.start();
        t2.start();
        t3.start();
    }
}