package com.coffeemachine.manager;

import com.coffeemachine.entities.*;
import com.coffeemachine.exception.IngredientsNotAvailableException;

import java.util.ArrayList;
import java.util.List;

public class ElaichiTeaManager extends TeaManager{

    @Override
    public Beverage prepare() throws IngredientsNotAvailableException {
        Beverage beverage = super.prepare();
        final IngredientStore ingredientStore = IngredientStore.getInstance();
        final Ingredient elaichi = ingredientStore.takeIngredient(IngredientType.ELAICHI_SYRUP, 5);
        final List<Ingredient> ingredientList = new ArrayList<>(beverage.getIngredientList());
        ingredientList.add(elaichi);
        return  new ElaichiTea(ingredientList);
    }
}
