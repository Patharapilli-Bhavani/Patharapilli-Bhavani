package bha.com;

public class Employee {
	int Id;
	String name;
	public Employee(int Id, String name) {
		System.out.println(Id +" " + name);
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
