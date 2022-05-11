/*  Write a program to print the names of students by creating a Student class. 
If no name is passed while creating an object of the Student class, then the name should be "Unknown", 
otherwise the name should be equal to the String value passed while creating the object of the Student class.  */
package JavaSurpriseTest;

public class Program1 {
	String Studname;
	public Program1 (String stud) {
		Studname = stud; 
	}
	public Program1() {
		Studname = "Unknown";
	}


	public static void main(String[] args) {
		Program1 stud = new Program1 ("Manasi");
		Program1 stud1 = new Program1();
		System.out.println(stud.Studname);
		System.out.println(stud1.Studname);
	}

}
