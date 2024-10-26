/* 
 * Rajvansh Gupta
 * 10-25-24
 * Creates a class that will later be utilized by child classes.
 * Purpose is to create a foundational strucutre using parameters and inputs to display foot item.
 * Will also display that food item with certain charasteristics.
 * Food3.java 
*/
public class Food3
{
	protected String str; // creates a string to store print output lines
	protected double totalCost; // creates a variable to store total cost paid by the customers.
		
	public Food3 ()
	{
		str = new String(""); // creates a garbage value for the string
	}
	
	public Food3 (String prepMethod, String ingredient, String name, int count, int cost )
	{	
		double totalCost = (cost * count)/100; 
		str = String.format("At the sale: %s %s with %s" +
		" will be sold for %d cents each. With %d"+
		" %s, $%.2f can be made.", name, prepMethod, ingredient, cost, count, name, totalCost); // has all the 
		//inputs that will be taken in, then it uses those inputs to create a print statement that can work
		// work for the other food items created by it's child classes.
	}
	 

	public void printForSale()
	{
		System.out.println(str); // method that will print the outputs 
	}
	
		public void introOrConclusion()
	{
		System.out.println("\n\n\n"); // concluding and introducing method to have 3 empty lines
	}
	
}

