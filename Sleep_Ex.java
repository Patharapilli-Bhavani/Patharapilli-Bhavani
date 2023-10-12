package bha.com;

public class Sleep_Ex extends Thread {
	public void run() {
		try {
			
			for(int i=1;i<=10;i++) {
				
				Thread.sleep(10);
				System.out.println(i);
			}
		}catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
	}
	public static void main(String args[]) throws InterruptedException  {
		Sleep_Ex obj=new Sleep_Ex();
		Sleep_Ex obj1=new Sleep_Ex();
		obj.start();
		try {
			int i=0;
			if( i==1) {
				System.out.println("Daemon thread");
			}
			else {
				System.out.println("Not Daemon thread");
			}
			obj.join(1000);
		}catch(ClassCastException e) {
			System.out.println("Exception");
		}
		obj1.start();
		obj.setDaemon(false);
		obj.isDaemon();
	}
}
