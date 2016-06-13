class SumClass{
	private long length;
	public SumClass(long length){
		this.length = length;
	}
	public long sum(){
		long temp = 0; 
		for(int i = 0; i <= length; i++){
			try{
				Thread.sleep((int)(Math.random() * 10));
			}
			catch(InterruptedException e){}
			temp += i;
			
		}
		return temp;
	}
}
class SumThread extends SumClass implements Runnable{
	public SumThread(long length){
		super(length);
	}
	public void run(){
		System.out.println(Thread.currentThread()+"sum = "+sum());
	}
}
public class Ch10_4_1 {

	public static void main(String[] args) {
		System.out.println("Thread:");
		System.out.println(Thread.currentThread());
		SumThread st1 = new SumThread(150);
		Thread t1 = new Thread(st1, "ThreadA");
		SumThread st2 = new SumThread(150);
		Thread t2 = new Thread(st2, "ThreadB");
		
		t1.start();
		t2.start();

	}

}
