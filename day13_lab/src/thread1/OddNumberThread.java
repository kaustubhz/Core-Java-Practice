package thread1;

public class OddNumberThread extends Thread {

	private int min,max;
	public OddNumberThread(int min,int max,String name) {
		super(name);
		this.min=min;
		this.max=max;
	}

	@Override
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+" started");
		for(int i=min;i<=max;i++)
		{
			if(i%2!=0)
				{
				System.out.println(i+" is odd");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}
				}
		}
		System.out.println(Thread.currentThread().getName()+" finished");
	}
	

}
