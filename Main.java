import java.util.ArrayList;

// abstraction

abstract class Ingredient {
    protected String name;
    protected double quantity;

    public Ingredient(String name, double quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public abstract String getName();

    public abstract double getQuantity();

    @Override
    public String toString() {
        return quantity + " " + name;
    }
}

class SolidIngredient extends Ingredient {
    public SolidIngredient(String name, double quantity) {
        super(name, quantity);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getQuantity() {
        return quantity;
    }
}

class LiquidIngredient extends Ingredient {
    public LiquidIngredient(String name, double quantity) {
        super(name, quantity);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getQuantity() {
        return quantity;
    }
}

class Recipe {
    private String name;
    private ArrayList<Ingredient> ingredients;
    private String instructions;

    public Recipe(String name, String instructions) {
        this.name = name;
        this.instructions = instructions;
        ingredients = new ArrayList<>();
    }

    public void addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Recipe: ").append(name).append("\n");
        stringBuilder.append("Ingredients:\n");
        for (Ingredient ingredient : ingredients) {
            stringBuilder.append("- ").append(ingredient.toString()).append("\n");
        }
        stringBuilder.append("Instructions: ").append(instructions);
        return stringBuilder.toString();
    }
}

public class Main {
    public static void main(String[] args) {
        Recipe Burger = new Recipe("Burger", "Layer onions,meat,vegetable, sauce, and cheese.");

        Ingredient onion = new SolidIngredient("Onion", 500);
        Ingredient tomatoSauce = new LiquidIngredient("Tomato Sauce", 750);
        Ingredient vegetable = new LiquidIngredient("lettuce", 750);
        Ingredient cheese = new SolidIngredient("Mozzarella Cheese", 300);
        Ingredient meat = new SolidIngredient("beef", 800);

        Burger.addIngredient(onion);
        Burger.addIngredient(tomatoSauce);
        Burger.addIngredient(vegetable);
        Burger.addIngredient(cheese);
        Burger.addIngredient(meat);

        System.out.println(Burger);
    }
}
