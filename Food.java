/* Rajvansh Gupta
* 10/25/24
* Food.java
* This program creates a food SuperSuperclass that models the printing of food.
* It'll be used for the other classes in order to simplify printing of different food items
* It utilizes constructors and methods in sync in order to achieve that goal.
*/

public class Food
{
	protected String str; // Will use that variable to store the output.
	
	public Food ()
	{
		str = new String(""); // assigns a garbage value to string
	}
	
	public Food (String prepMethod, String ingredient, String name)
	{	
		str = "At the sale: " + name + " " + prepMethod + " with " + ingredient; // Utilizes the inputs and already knowns to create a string
	}

	public void printForSale()
	{
		System.out.println(str); // creates a method with the capabilities to print the created string 
	}
	public void introOrConclusion()
	{
		System.out.println("\n\n\n"); // concluding and introducing method to have 3 empty lines
	}
}
