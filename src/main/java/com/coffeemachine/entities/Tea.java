package com.coffeemachine.entities;

import java.util.List;

public class Tea extends Beverage {

    public  Tea(final List<Ingredient> ingredientList){

        super(BeverageType.TEA, ingredientList);
    }
}
