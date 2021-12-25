package week3.day1;

public class Students {

	public void getStudentInfo(int id) {
		System.out.println("Student id is "+id);
	}
	public void getStudentInfo(int id, String name) {
		System.out.println("Student id is "+id+" Student name is "+name);
	}
	public void getStudentInfo(String email, long phoneNumber) {
		System.out.println("Student email id is "+email+" Student contact number is "+phoneNumber);
	}

	public static void main(String[] args) {
		Students stud = new Students();
		stud.getStudentInfo(12345);
		stud.getStudentInfo(12345, "Sujeeth");
		stud.getStudentInfo("ram@gmail.com", 9898787800L);
	}

}
