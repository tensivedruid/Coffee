package com.coffeemachine.entities;

import java.util.List;

public class Beverage {
    private final BeverageType beverageType;
    private final List<Ingredient> ingredientList;

    public Beverage(BeverageType beverageType, List<Ingredient> ingredientList) {
        this.beverageType = beverageType;
        this.ingredientList = ingredientList;
    }

    public BeverageType getBeverageType() {
        return beverageType;
    }

    public List<Ingredient> getIngredientList() {
        return ingredientList;
    }
}
