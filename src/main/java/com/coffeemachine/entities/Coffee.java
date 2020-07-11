package com.coffeemachine.entities;

import java.util.List;

public class Coffee extends Beverage {

    public Coffee(final List<Ingredient> ingredientList) {
        super(BeverageType.COFFEE, ingredientList);
    }
}
