/*
 * Simulation Class has been created to test the usability of this programming
 * without linking it to an external database
 *
 * Here we create a public method Simulation
 * with a constructor to allow adding ingredients and recipes
 * and then using them.
 *
 */

public class Simulation {

    public static void simulate(){

        Inventory inventory = new Inventory();
        // Example: Adding some ingredients to the inventory for demonstration
        inventory.addIngredient("Flour", 2);  // Assuming these methods exist and work as expected
        inventory.addIngredient("Sugar", 10);
        inventory.addIngredient("Eggs", 4);

        Recipe pancakeRecipe = new Recipe("Pancake");
        pancakeRecipe.addIngredient(new Ingredient("Flour", 200));
        pancakeRecipe.addIngredient(new Ingredient("Sugar", 50));
        pancakeRecipe.addIngredient(new Ingredient("Eggs", 2));

        for (Ingredient ingredient : pancakeRecipe.getIngredients()) {
            inventory.useIngredient(ingredient.getName(), ingredient.getQuantity());
        }
    }
}
