package bha.com;

public class Thread_Ex extends Thread {
		public  void run() {
			System.out.println("Java ");
		}
		public Thread_Ex(int i, int j) {
			System.out.println(i);
			//System.out.println(j);
		}
		public static void main(String args[]) {
			Thread_Ex obj= new Thread_Ex(10 , 20);
			obj.start();
			
		}
}
