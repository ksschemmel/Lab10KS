
public class Lab101 {
	private String name;
	private final int age;
	
	public Lab101(String initialname) {
		this.name = initialname;
		this.age = 0;
	}
	public Lab101(String initialname, int age) {
		this.name = initialname;
		this.age=age;
	}
	public void printLab101() {
		System.out.println(this.name + ", age "+ this.age+ "years");
	}
	public String getname() {
		return this.name;
	}
	public int getage() {
		return this.age;
		
	}

}
