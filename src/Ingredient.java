/*
 * The Ingredient class represents an individual ingredient, encapsulating both its name and quantity.
 * This class is designed to be used within recipes to specify the components and their respective amounts.
 */
public class Ingredient {
    // Private fields to hold the ingredient's name and quantity.
    private String name; // The name of the ingredient.
    private int quantity; // The quantity of the ingredient, using an integer to represent units (could be grams, milliliters, etc.).

    /*
     * Constructor to initialize an Ingredient object with a specified name and quantity.
     * @param name The name of the ingredient.
     * @param quantity The quantity of the ingredient.
     */
    public Ingredient(String name, int quantity) {
        this.name = name; // Set the ingredient's name.
        this.quantity = quantity; // Set the ingredient's quantity.
    }

    // Getter method to retrieve the ingredient's name.
    public String getName() {
        return name;
    }

    // Getter method to retrieve the ingredient's quantity.
    public int getQuantity() {
        return quantity;
    }

    /*
     * Setter method to update the ingredient's quantity.
     * This allows for adjusting the quantity of an ingredient if needed.
     * @param quantity The new quantity to set for the ingredient.
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity; // Update the ingredient's quantity.
    }
}
