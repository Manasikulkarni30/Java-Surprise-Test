/*   Suppose you have a Piggie Bank with an initial amount of $50 and you have to add some more amount to it.
 Create a class 'AddAmount' with a data member named 'amount' with an initial value of $50. Now make two constructors of this class as follows:
1 - without any parameter - no amount will be added to the Piggie Bank
2 - having a parameter which is the amount that will be added to the Piggie Bank
Create an object of the 'AddAmount' class and display the final amount in the Piggie Bank.  */

package JavaSurpriseTest;

public class AddAmount {
	
	private int amount = 50;
    public AddAmount()
    {

    }

    public AddAmount(int x)
    {
        amount = x + amount;
    }

    public void displayAmount()
    {
        System.out.println(amount);
    }
    
    public static void main(String[] args)
    {
        AddAmount x = new AddAmount();
        AddAmount y = new AddAmount(50);
        System.out.println("The amount in the piggie bank is (Without parameter) : ");
        x.displayAmount();
        System.out.println("The amount in the piggie bank is (With parameter) : ");
        y.displayAmount();
    }
}


