package com.coffeemachine.manager;

import com.coffeemachine.entities.*;
import com.coffeemachine.exception.IngredientsNotAvailableException;
import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;

public class GingerTeaManager implements BeverageManager {
    @Override
    public Beverage prepare() throws IngredientsNotAvailableException {

        final IngredientStore ingredientStore = IngredientStore.getInstance();
        final Ingredient milk = ingredientStore.takeIngredient(BeverageType.GINGER_TEA, IngredientType.MILK, 10);
        final Ingredient water = ingredientStore.takeIngredient(BeverageType.GINGER_TEA, IngredientType.WATER, 50);
        final Ingredient teaLeaves = ingredientStore.takeIngredient(BeverageType.GINGER_TEA, IngredientType.TEA_LEAVES_SYRUP, 10);
        final Ingredient sugar = ingredientStore.takeIngredient(BeverageType.GINGER_TEA, IngredientType.SUGAR_SYRUP, 10);
        final Ingredient ginger = ingredientStore.takeIngredient(BeverageType.GINGER_TEA, IngredientType.GINGER_SYRUP, 5);

        return new ElaichiTea(Lists.newArrayList(milk, water, teaLeaves, sugar, ginger));
    }
}
