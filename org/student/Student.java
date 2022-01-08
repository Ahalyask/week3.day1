package org.student;

import org.department.Department;

public class Student extends Department{

	public static void main(String[] args) {
		Student st = new Student();
		st.collegeName();
		st.collegeCode();
		st.collegeRank();
		st.deptName();
		st.studentId();
		st.studentName();
		st.studentDept();

	}
	
	public void studentName() {
		System.out.println("from Student - studentName()");
	}
	
	public void studentDept() {
		System.out.println("from Student - studentDept()");
	}
	public void studentId() {
		System.out.println("from Student - studentId()");
	}

}
