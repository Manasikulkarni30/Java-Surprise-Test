/* Create a class to print the area of a square and a rectangle. The class has two functions with the 
same name but different number of parameters. The function for printing the area of rectangle has two 
parameters which are its length and breadth respectively while the other function for printing the area 
of square has one parameter which is the side of the square.*/

package JavaSurpriseTest;

public class Area {
				
		static void Rectarea(int a,int b)

		{
			System.out.println("Area of Rectangle is ="+ a*b);
		}
		
		static void Rectarea(int a)

		{
			System.out.println("Area of Square is ="+a*a);
		}
				
			public static void main(String[] args)
		{
			
				Rectarea(7,8);
				Rectarea(8);

		}
}
