/*
 * The Inventory class manages the collection of recipes and the stock of ingredients for the Cooking Replenishment project.
 * It provides functionality to add new recipes, add ingredients to stock, use ingredients from stock, and check for low ingredient levels.
 */
import java.util.HashMap;
import java.util.Map;

public class Inventory {
    // A map to store recipes, with the recipe name as the key and the Recipe object as the value.
    private final Map<String, Recipe> recipes;

    // A map to store ingredients, with the ingredient name as the key and the quantity as the value.
    private final Map<String, Integer> ingredients;

    /*
     * Constructor for the Inventory class.
     * Initializes the recipes and ingredients maps.
     */
    public Inventory() {
        this.recipes = new HashMap<>();
        this.ingredients = new HashMap<>();
    }

    /*
     * Adds an ingredient to the inventory or updates its quantity if it already exists.
     * @param name The name of the ingredient to add.
     * @param quantity The quantity of the ingredient to add.
     */
    public void addIngredient(String name, int quantity) {
        ingredients.put(name, ingredients.getOrDefault(name, 0) + quantity);
        System.out.println("Added " + quantity + " of " + name + " to the inventory.");
    }

    /*
     * Checks if a recipe already exists in the inventory. If not, the recipe is added.
     * @param recipe The recipe to check and possibly add to the inventory.
     */
    public void checkRecipe(Recipe recipe) {
        if (!recipes.containsKey(recipe.getName())) {
            recipes.put(recipe.getName(), recipe);
        } else {
            System.out.println("Recipe already exists in the inventory.");
        }
    }

    /*
     * Uses a specified quantity of an ingredient from the inventory. Warns if running out of that ingredient.
     * @param name The name of the ingredient to use.
     * @param quantity The quantity of the ingredient to use.
     */
    public void useIngredient(String name, int quantity) {
        if (ingredients.containsKey(name)) {
            int newQuantity = ingredients.get(name) - quantity;
            if (newQuantity < 0) {
                System.out.println("Warning: Running out of " + name);
            } else {
                ingredients.put(name, newQuantity);
            }
        } else {
            System.out.println("Ingredient not found: " + name);
        }
    }

    /*
     * Checks for ingredients that are low in stock and prints a warning message for each.
     * Assumes a threshold of 5 units to determine if an ingredient is considered low.
     */
    public void checkLowIngredients() {
        for (Map.Entry<String, Integer> entry : ingredients.entrySet()) {
            if (entry.getValue() < 5) { // Assuming 5 as the low level threshold
                System.out.println("Low on " + entry.getKey() + ". Please replenish.");
            }
        }
    }
}