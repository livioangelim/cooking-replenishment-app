/**
 * Cooking Replenishment Project is created by Livio Angelim Mororo
 * as the Final Project for the course Introduction to Java Programming at Sophia.com
 * using what I have learned at Sophia with some Object-Oriented Programming (OOP) best practices
 * CookingReplenishmentApp is the main class of the Cooking Replenishment project.
 * * It initializes necessary components and starts the user interaction process.
 */

public class Main {

    public static void main(String[] args) {
        // Call a method in the Simulation class created only for testing purposes.
        Simulation.simulate();

        // Create an instance of Inventory to manage ingredients.
        Inventory inventory = new Inventory();

        // Check for low ingredients when the program is initialized.
        inventory.checkLowIngredients();

        // Create an instance of Console to handle user interactions.
        Console console = new Console();

        // Start the user interaction process through the console.
        console.start();
    }
}
