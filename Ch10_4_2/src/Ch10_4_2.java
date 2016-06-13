class SumThread extends Thread{
	private long length;
	public SumThread(long length, String name){
		super(name);
		this.length = length;
	}
	public void run(){
		long temp = 0;
		for(int i =1; i <= length; i++){
			try{
				Thread.sleep((int)(Math.random() * 10));
			}
			catch(InterruptedException e){}
			temp += i;
		}
		System.out.println(Thread.currentThread()+"sum = "+temp);
	}
}
public class Ch10_4_2 {

	public static void main(String[] args) {
		System.out.println("Thread:");
		System.out.println(Thread.currentThread());
		SumThread st1 = new SumThread(150, "ThreadA");
		st1.start();
		
		new Thread("ThreadB"){
			int length = 150;
			public void run(){
				long temp = 0;
				for(int i = 1; i <= length; i++){
					try{
						Thread.sleep((int)(Math.random() * 10));
					}
					catch(InterruptedException e){}
						temp += i;
				}
				System.out.println(Thread.currentThread()+"sum = "+temp);
			}
		}.start();

	}

}
