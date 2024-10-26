/* 
 * Rajvansh Gupta
 * 10-11-24
 * Pizza3 is a child class of Food3 that acts as a parent class. 
 * It takes in values from both FoodTester3 and DeepDishPizza.
 * Uses the inputs it gets from FoodTester3 to create a pizza food item.
 * Will be used by DeepDishPizza3 in order to create a DeepDishPizza's profit and description.
 * Pizza3.java
*/
public class Pizza3 extends Food3 // establishes it as a child class of Food3.
{

	public Pizza3(String ingredientIn, String nameIn, int countIn, int costIn) // recieves parameters from both child class and FoodTester3
	{
		super("baked", ingredientIn, nameIn, countIn, costIn ); // Those parameters are then used to create a description of the food item while utilizing the super class.
	}
	

}

 
		
		
