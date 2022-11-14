package nyc.codingtutor.week5;

public class Classes {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.firstName = "Tom";
		student1.lastName = "Smith";
		student1.gradeLevel = 12;
		student1.phoneNumber = "345-236-7234";
		
//		student1.introduce();
		
		Student student2 = new Student("Sammy", "Davis");
//		student2.introduce();
		
		Student student3 = new Student("Tom", "Jones", "2342342345", 11);
		student3.introduce();
	}

}
