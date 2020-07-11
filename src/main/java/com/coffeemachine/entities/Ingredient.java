package com.coffeemachine.entities;

public class Ingredient {
    private final IngredientType ingredientType;
    private final int quantity;

    public Ingredient(IngredientType ingredientType, int quantity) {
        this.ingredientType = ingredientType;
        this.quantity = quantity;
    }

    public IngredientType getIngredientType() {
        return ingredientType;
    }

    public int getQuantity() {
        return quantity;
    }
}
