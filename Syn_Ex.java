package bha.com;

public class Syn_Ex extends Thread{
	public synchronized void run() {
		for(int i=0;i<10;i++) {
		System.out.println("A");
		System.out.println("Ab");
		System.out.println("Abc");
		System.out.println("Abcd");
		System.out.println("Abcde");
	
		
			// TODO Auto-generated method stub
			System.out.println("Abcdef");
			System.out.println("Abcdefg");
			System.out.println("Abcdefgh");
			System.out.println("Abcdefghi");
			System.out.println("Abcdefghij");
			System.out.println("Abcdefghijk");
		}
		
	}
public static void main(String args[]) {
	Syn_Ex obj=new Syn_Ex();
	obj.start();
	
}
}	
