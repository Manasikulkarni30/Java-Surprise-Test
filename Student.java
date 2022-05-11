/*  Write a program to print the names of students by creating a Student class. 
If no name is passed while creating an object of the Student class, then the name should be "Unknown", 
otherwise the name should be equal to the String value passed while creating the object of the Student class.  */
package JavaSurpriseTest;

public class Student {
	String Studname;
	public Student (String stud) {
		Studname = stud; 
	}
	public Student() {
		Studname = "Unknown";
	}


	public static void main(String[] args) {
		Student stud = new Student ("Manasi");
		Student stud1 = new Student();
		System.out.println(stud.Studname);
		System.out.println(stud1.Studname);
	}

}
