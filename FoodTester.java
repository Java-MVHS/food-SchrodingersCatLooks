/* Rajvansh Gupta
* 10/25/24
* This program serves as the main class in order to execute the remaining classes.
* It utilizes creating instances of the other classes while calling their construcotrs. 
* Then it also calls inherited methods within those classes in order to achieve the respective output.
* The other classes that it creates instances of are Food, Pizza and DeepDishPizza
*FoodTester.java
*/

public class FoodTester
{
	public static void main(String[] args) // main method that runs first
	{ 
		
		Food food1 = new Food ("baked", "bananas", "muffins"); // creates an instance of the class food
		food1.printForSale(); // after having running the constructor with the parameters this calls it's method
		Food food2 = new Food ("fried", "yam", "fritters"); // creates another instance of food 
		food2.printForSale(); // runs the output with different parameters respectively as on the previous line
		Pizza pizza = new Pizza ("pepperoni"); // Creates an instance of Pizza with a parameter to run the constructor
		pizza.printForSale(); // runs the inherited print method in Pizza
		DeepDishPizza Deep1 = new DeepDishPizza ("chocolate"); // creates an instance of DeepDishPizza with a parameter
		Deep1.printForSale(); // runs the output statement of DeepDishPizza
	}
}
