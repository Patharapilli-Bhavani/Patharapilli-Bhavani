package bha.com;
public class Thread_Example extends Thread {
		public void run() {
			int i;
			for(i=1;i<=10;i++) {
				System.out.println(i);
			}
		}
		public Thread_Example() {
			System.out.println("It is a Constructor");
		}
		public static void main(String args[]) {
			Thread_Example obj=new Thread_Example();
			obj.run();
			obj.start();
		}
}
