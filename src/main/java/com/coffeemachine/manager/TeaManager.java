package com.coffeemachine.manager;

import com.coffeemachine.entities.*;
import com.coffeemachine.exception.IngredientsNotAvailableException;
import com.google.common.collect.Lists;

public class TeaManager implements BeverageManager{

    public Beverage prepare() throws IngredientsNotAvailableException {
        final IngredientStore ingredientStore = IngredientStore.getInstance();
        final Ingredient milk = ingredientStore.takeIngredient(IngredientType.MILK, 10);
        final Ingredient water = ingredientStore.takeIngredient(IngredientType.WATER, 50);
        final Ingredient teaLeaves = ingredientStore.takeIngredient(IngredientType.TEA_LEAVES_SYRUP, 10);
        final Ingredient sugar = ingredientStore.takeIngredient(IngredientType.SUGAR_SYRUP, 10);
        return new Tea(Lists.newArrayList(milk, water, teaLeaves, sugar));
    }
}
