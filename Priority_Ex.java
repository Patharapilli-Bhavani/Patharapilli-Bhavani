package bha.com;

public class Priority_Ex extends Thread {
	public void run() {
		System.out.println("It is a Thread class Method");
	}
	public static void main(String args[]) {
		Priority_Ex obj1=new Priority_Ex();
		Priority_Ex obj2=new Priority_Ex();
		Priority_Ex obj3=new Priority_Ex();
		obj1.setPriority(MAX_PRIORITY);
		obj2.setPriority(MIN_PRIORITY);
		obj3.setPriority(NORM_PRIORITY);
		obj1.getPriority();
		obj1.start();
		obj2.getPriority();
		obj2.start();
		
		obj3.getPriority();
		obj3.start();
	}
}
