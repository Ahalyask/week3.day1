package week3.day1;

public class Students {

	public static void main(String[] args) {
		Students st = new Students();
		st.getStudentInfo(111);
		st.getStudentInfo(111, "Ahalya");
		st.getStudentInfo("ahala@gamil.com", 4312345324l);

	}
	
	public void getStudentInfo(int id) {
		System.out.println("Student id is "+ id);
	}
	public void getStudentInfo(int id, String name) {
		System.out.println("Student id is "+id+ " and Name is "+name);
	}
	
	public void getStudentInfo(String email, Long ph) {
		System.out.println("Student email id is "+email+" and Phone number is "+ph);
	}

}
