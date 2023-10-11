package bha.com;

public class Interface_Example implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i =10;
		long l=234;
		System.out.println(i+l);
		
	}
	public static void main(String args[]) {
		Interface_Example obj=new Interface_Example();
		obj.run();
		//obj.start();
	}


	
}