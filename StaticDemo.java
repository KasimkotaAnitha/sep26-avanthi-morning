

class Student {
	int id;
	String name;
	static String college = "Awanthi";
	
	static {
		System.out.println("Welcome Static");
		System.out.println("Vzm");
	}
	
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		System.out.println("hello");
	}



	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", college=" + college + "]";
	}
	
}
public class StaticDemo {

	public static void main(String[] args) {
	
		int a;
		
		Student s1= new Student(123,"Abdul");
		Student s2= new Student(123,"Abdul");
		
		
		Student.college="Avanthi";
		
		System.out.println(s1);
		System.out.println(s2);
		
		
		
		
		
		
	}

	
}
