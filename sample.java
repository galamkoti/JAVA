class Mythread4 extends Thread
{
	public void run()
	{
		try{
			while(true)
			{
				Thread.sleep(1000);
				System.out.println("Good");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
class Mythread5 extends Thread
{
	public void run()
	{
		try{
			while(true)
			{
				Thread.sleep(2000);
				System.out.println("Hello");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
class Mythread6 extends Thread
{
	public void run()
	{
		try{
			while(true)
			{
				Thread.sleep(3000);
				System.out.println("Welcome");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
 class sample
{
	public static void main(String[] args) 
	{
		Mythread4 t1=new Mythread4();
		Mythread5 t2=new Mythread5();
		Mythread6 t3=new Mythread6();
		t1.start();
		t2.start();
		t3.start();
	}
}