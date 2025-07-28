package Day_7;


class Mul1 extends Thread
{
	public void run() 
	{
		for(int i=1;i<=10;i++) 
		{
			System.out.println(Thread.currentThread().getName());
			try 
			{
				Thread.sleep(500);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}


class Mul2 extends Thread
{
	public void run() 
	{
		for(int i=1;i<=10;i++) 
		{
			System.out.println(Thread.currentThread().getName());
			try 
			{
				Thread.sleep(500);
			}
			catch(InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}
}


public class MultithreadingUsingThread 
{
	public static void main(String[] args) 
	{
		Mul1 m1=new Mul1();
		Mul2 m2=new Mul2();

		m1.start();
		m2.start();
		
	}

}
