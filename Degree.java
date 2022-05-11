/* Create a class 'Degree' having a function 'getDegree' that prints "I got a degree". It has two 
subclasses namely 'Undergraduate' and 'Postgraduate' each having a function with the same name 
that prints "I am an Undergraduate" and "I am a Postgraduate" respectively. Call the function by 
creating an object of each of the three classes. */

package JavaSurpriseTest;

public class Degree {
	public class Undergraduate{
		public void getDegree()
		{
			System.out.println("I am Undergraduate");
		}
	}
	public class Postgraduate{
		public void getDegree()
		{
			System.out.println("I am Postgraduate");
		}

	}
	public void getDegree()
	{
		System.out.println("I got a degree");
	}

	public static void main(String[] args) {
		Degree d=new Degree();
		d.getDegree();
		

	Degree.Undergraduate ug=d.new Undergraduate();
		ug.getDegree();

		Degree.Postgraduate pg=d.new Postgraduate();
		pg.getDegree();
	}

}
