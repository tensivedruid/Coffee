package com.coffeemachine.entities;

import java.util.List;

public class GingerTea extends Beverage {
    public GingerTea(final List<Ingredient> ingredientList){
        super(BeverageType.GINGER_TEA, ingredientList);
    }
}
