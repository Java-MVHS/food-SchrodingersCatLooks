/* Rajvansh Gupta
 * 10/25/24
 * DeepDishPizza.java
 * This class is a Child class of Pizza thus being the Grandchild of Food
 * It's purpose is to create a new food item for which it provides the info.
 * Utilizes Pizza's and Food's methods to achieve that goal. 
*/

public class DeepDishPizza extends Pizza 
{	
	public DeepDishPizza(String ingredientIn) // Takes in an input from FoodTester
	{
		super(ingredientIn, "deep dish pizza"); // Couples that input with another String which it sends
		// to it's Parent class Pizza
	}
	
}
