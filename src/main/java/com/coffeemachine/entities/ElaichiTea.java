package com.coffeemachine.entities;

import java.util.List;

public class ElaichiTea extends Beverage {

    public ElaichiTea(final List<Ingredient> ingredientList){
        super(BeverageType.ELAICHI_TEA, ingredientList);
    }
}
