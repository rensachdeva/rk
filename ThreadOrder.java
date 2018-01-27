package AdvancedJavaTest;

public class ThreadOrder extends Thread {
	String name;
	ThreadOrder(String name)
	{
		this.name=name;
	}
	public void run()
	{
		//System.out.println(Thread.currentThread().getName());
		System.out.println(this.name+ " running");
		
	}
	public static void main(String[] args) 
	{
		ThreadOrder t1=new ThreadOrder("thread1");
		ThreadOrder t2=new ThreadOrder("thread2");
		ThreadOrder t3=new ThreadOrder("thread3");
		t1.start();

		t2.start();
		try {

			t1.join();
			t2.join();
		}
		catch(Exception e)		{
			System.out.println(e);
		}
		t3.start();
	}

}