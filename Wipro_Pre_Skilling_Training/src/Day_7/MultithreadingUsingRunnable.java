package Day_7;


class Th1 implements Runnable
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


class Th2 implements Runnable
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


public class MultithreadingUsingRunnable 
{
	public static void main(String[] args) 
	{
		Thread t1 = new Thread(new Th1()) ;
		Thread t2 = new Thread(new Th2()) ;
		Thread t3 = new Thread(()->{
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
			}}, "what we can give heare");
		
		t1.start();
		t2.start();
		t3.start();

		
	}

}
