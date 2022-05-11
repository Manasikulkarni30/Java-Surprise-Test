/* Create a class named 'PrintNumber' to print various numbers of different datatypes by creating 
different functions with the same name 'printn' having a parameter for each datatype.*/

package JavaSurpriseTest;

public class PrintNumber {
	public static void printn(int a)
    {
       System.out.println(a);
    }
    void printn(float a)
    {
    	System.out.println(a);
    }
    static void printn(double a)
    {
    	System.out.println(a);
    }

 public static void main(String[] args)
{
    
    printn(4);
    printn(8.5);
    printn(9.654);
}
}
