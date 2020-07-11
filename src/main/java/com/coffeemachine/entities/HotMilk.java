package com.coffeemachine.entities;

import java.util.List;

public class HotMilk extends Beverage {
    public HotMilk(final List<Ingredient> ingredientList){
        super(BeverageType.HOT_MILK,ingredientList);
    }
}
