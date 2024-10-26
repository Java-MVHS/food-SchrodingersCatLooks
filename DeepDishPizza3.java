/*
 * Rajvansh Gupta
 * 10/25/24
 * This code is a child class of Pizza3 which act's as it's parent class.
 * Will send parameters to Pizza3 that will be used to create the food item
 * along with that food item's description. 
 * Gets those parameters from FoodTester3. 
 * DeepDishPizza3.java
*/

public class DeepDishPizza3 extends Pizza3 // establishes it as a child class of Pizza3
{
	
	
	
	public DeepDishPizza3(String ingredientIn, String nameIn, int countIn, int costIn) //takes in the parameters sent from FoodTester3
	{
		super(ingredientIn, nameIn, countIn, costIn); // now utilizes the Super's constructor and sends those parameters there.
		
	}

	
}
		
