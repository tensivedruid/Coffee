package com.coffeemachine.entities;

import com.coffeemachine.exception.IngredientsNotAvailableException;

import java.util.HashMap;
import java.util.Map;

public class IngredientStore {
    private static final IngredientStore INGREDIENT_STORE = new IngredientStore();

    private final Map<IngredientType, Integer> ingredientCapacityMap;

    public IngredientStore() {
        this.ingredientCapacityMap = new HashMap<IngredientType, Integer>();
        ingredientCapacityMap.put(IngredientType.MILK, 100);
        ingredientCapacityMap.put(IngredientType.WATER, 100);
        ingredientCapacityMap.put(IngredientType.COFFEE_SYRUP, 300);
        ingredientCapacityMap.put(IngredientType.ELAICHI_SYRUP, 500);
        ingredientCapacityMap.put(IngredientType.SUGAR_SYRUP, 500);
        ingredientCapacityMap.put(IngredientType.TEA_LEAVES_SYRUP, 500);
        ingredientCapacityMap.put(IngredientType.GINGER_SYRUP, 500);
    }

    public synchronized Ingredient takeIngredient(final IngredientType ingredientType, int amount) throws IngredientsNotAvailableException {
        if (ingredientCapacityMap.get(ingredientType) < amount) {
            throw new IngredientsNotAvailableException("Ingredient "+ ingredientType.name() + " not available");
        }

        ingredientCapacityMap.put(ingredientType, ingredientCapacityMap.get(ingredientType) - amount);
        return new Ingredient(ingredientType, amount);
    }

    public void addIngredient(final IngredientType ingredientType, int amount) {
        ingredientCapacityMap.put(ingredientType, ingredientCapacityMap.get(ingredientType) + amount);
    }
    public  static IngredientStore getInstance(){
        return INGREDIENT_STORE;
    }
}
