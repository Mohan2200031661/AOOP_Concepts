package ThreadDemos;


class Testing extends Thread
{
	
	public void run()
	{
		System.out.println("Name of Thread is " + Thread.currentThread().getName());
	}

	public static void main(String args[])
	{
		Testing t1 = new Testing();
		Testing t2 = new Testing();
		Testing t3 = new Testing();
		t1.setName("A");
		t2.setName("B");
		t3.setName("C");
		t1.setPriority(MAX_PRIORITY);
		t2.setPriority(NORM_PRIORITY);
		t3.setPriority(MIN_PRIORITY);
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		System.out.println(t3.getPriority());
		t1.start();
		t2.start();
		t3.start();
	}
}
