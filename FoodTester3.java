/*
 * 10-11-24
 * FoodTester3.java
 * Main method that will run the classes 
 * This is the class which contains Main so as to begin the program. 
 * In charge of creating instances of other classes and running their methods.
 * Does so by providing suitable parameters to generate the respective print statements.
*/
public class FoodTester3
{
	public static void main (String[] args)
	{
		Food3 food1 = new Food3 ("baked", "banana", "muffins", 12, 50 ); //Creates an instance of [food] to later run.
		food1.introOrConclusion(); //Runs a method that is used to generate the intro 3 lines.
		food1.printForSale(); // Calls the method printForSale of Food1
		Food3 food2 = new Food3 ( "baked", "yams", "fritters", 3, 100); // Creates another instance of Food.
		food2.printForSale(); // Runs Food's printing method 
		Pizza3 pizza = new Pizza3 ("anchovies", "pizzas", 8, 250); //Creates an instance of Pizza with parameters.
		pizza.printForSale(); //With those parameters already utilized it calls the respective print statement.
		DeepDishPizza3 Deep = new DeepDishPizza3("baked","tomatoes", 5, 100); //Creates an instance of DeepDishPizza with it's parameters.
		Deep.printForSale(); // Will be used to run DeepDishPizza's printing method.
		food1.introOrConclusion(); // Runs a method that is used to generate the exiting 3 lines.
	}
}
