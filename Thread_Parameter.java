package bha.com;

public class Thread_Parameter implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("It is a Method");
	}
	public static void main(String args[]) {
		Thread_Parameter obj=new Thread_Parameter();
		Thread obj1=new Thread(obj,"Thread_Parameter");
		obj1.run();
	}

}
