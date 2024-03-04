import java.util.ArrayList;
import java.util.List;

/**
 * The Recipe class represents a cooking recipe,
 * encapsulating a recipe name and a list of ingredients required to make the recipe.
 */
public class Recipe {
    // The name of the recipe.
    private String name;

    // A list to store the ingredients needed for the recipe.
    private List<Ingredient> ingredients;

    /**
     * Constructs a new Recipe instance with a specified name.
     * Initializes the list of ingredients as an empty list.
     *
     * @param name The name of the recipe.
     */
    public Recipe(String name) {
        this.name = name;
        this.ingredients = new ArrayList<>();
    }

    /**
     * Adds an ingredient to the recipe's list of ingredients.
     *
     * @param ingredient The ingredient to be added to the recipe.
     */
    public void addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
    }

    /**
     * Returns the name of the recipe.
     *
     * @return The name of the recipe.
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the list of ingredients required for the recipe.
     *
     * @return A list of ingredients.
     */
    public List<Ingredient> getIngredients() {
        return ingredients;
    }
}
