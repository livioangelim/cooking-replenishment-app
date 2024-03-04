import java.util.Scanner;

/**
 * The Console class is responsible for handling user interactions within the Cooking Replenishment application.
 * It provides a text-based interface for users to add ingredients and recipes to the inventory, and potentially to cook a recipe.
 */
public class Console {
    // A Scanner object is used to read user input from the standard input stream (console).
    private final Scanner scanner;

    // An Inventory object to manage the application's ingredients and recipes.
    private final Inventory inventory;

    /**
     * The constructor initializes the Console object with a new Scanner for input
     * and a new Inventory instance to manage recipes and ingredients.
     */
    public Console() {
        this.scanner = new Scanner(System.in);
        this.inventory = new Inventory();
    }

    /**
     * Starts the main interaction loop of the application, offering the user a set of actions
     * until they choose to exit. It handles user input and directs the flow based on the selected action.
     */
    public void start() {
        boolean continueRunning = true;
        while (continueRunning) {
            switch (getUserChoice()) {
                case 1:
                    // Invokes the method to handle the addition of a new ingredient to the inventory.
                    inputIngredient();
                    break;
                case 2:
                    // Invokes the method to handle the creation of a new recipe and adding it to the inventory.
                    inputNewRecipe();
                    break;
                case 3:
                    // Placeholder for the functionality of cooking a recipe. Currently, prints a message.
                    cookRecipe();
                    break;
                case 4:
                    // Prints a goodbye message and exits the main loop, thereby ending the application.
                    System.out.println("Ok, bye.");
                    continueRunning = false;
                    break;
                default:
                    // Handles unexpected input by warning the user and exiting the application.
                    System.out.println("Invalid choice. Exiting.");
                    continueRunning = false;
                    break;
            }
        }
        // Closes the scanner to prevent resource leakage.
        scanner.close();
    }

    /**
     * Displays the main menu to the user and reads their choice as an integer.
     * @return The user's choice as an integer.
     */
    private int getUserChoice() {
        System.out.println("""      
        Welcome to the Cooking Management System:
        Please select an option from the menu below:
        1. Add an ingredient to the inventory.
        2. Create a new recipe and add it to the inventory.
        3. Begin cooking a selected recipe.
        4. Exit the application.""");
        return scanner.nextInt();
    }

    /**
     * Handles the user action of adding a new ingredient to the inventory, including reading the ingredient's name and quantity.
     */
    private void inputIngredient() {
        System.out.println("Inputting an ingredient to inventory.");
        System.out.print("Enter ingredient name: ");
        scanner.nextLine(); // This line is necessary to catch the newline character left by nextInt().
        String ingredientName = scanner.nextLine();
        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();
        inventory.addIngredient(ingredientName, quantity);
    }

    /**
     * Handles the user action of creating a new recipe and adding it to the inventory,
     * including reading the recipe's name and its ingredients.
     */
    private void inputNewRecipe() {
        System.out.println("Inputting a new Recipe to inventory.");
        scanner.nextLine(); // This line is necessary to catch the newline character left by nextInt().
        System.out.print("Enter recipe name: ");
        String recipeName = scanner.nextLine();
        Recipe recipe = new Recipe(recipeName);
        System.out.print("How many ingredients? ");
        int numIngredients = scanner.nextInt();
        for (int i = 0; i < numIngredients; i++) {
            scanner.nextLine(); // This line is necessary to catch the newline character left by nextInt().
            System.out.println("Ingredient " + (i + 1) + ":");
            System.out.print("Name: ");
            String ingredientName = scanner.nextLine();
            System.out.print("Add the quantity: ");
            int quantity = scanner.nextInt();
            recipe.addIngredient(new Ingredient(ingredientName, quantity));
        }
        inventory.checkRecipe(recipe);
    }

    /**
     * Placeholder method for cooking a recipe. This method currently only prints a message but could be
     * expanded to include functionality for selecting and cooking a recipe.
     */
    private void cookRecipe() {
        System.out.println("Cooking a recipe.");
        // Implementation of recipe cooking would go here.
    }
}