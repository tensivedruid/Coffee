package com.coffeemachine.entities;

import java.util.List;

public class HotWater extends Beverage {
    public HotWater(final List<Ingredient> ingredientList){
        super(BeverageType.HOT_WATER, ingredientList);

    }
}
