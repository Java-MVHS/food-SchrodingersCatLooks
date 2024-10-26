/* 
 * Rajvansh Gupta
 * 10-11-24
 * Pizza.java
 * Pizza is a child class of Food and utilizes some of it's methods to achieve it's goals.
 * Has multiple different constructors to match accordingly with other classes. 
 * Works in sync with FoodTester and DeepDishPizza by utilizing their inputs. 
 * Uses those inputs to create strings which can later be printed.
*/

public class Pizza extends Food
{
	public Pizza() // Empty constructor for the purpose of being able to have 2 more.
	{
	}
	
	public Pizza(String ingredientIn)
	{
		super("baked", ingredientIn, "pizza"); // Will be used to take in the input from FoodTester
	}
	
	public Pizza(String ingredientIn, String nameIn)
	{
		super("baked", ingredientIn, nameIn); // Will be what DeepDishPizza uses when creating it's print statement.
	}
	
	



}
		
 
		
		
