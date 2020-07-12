package com.coffeemachine.manager;

import com.coffeemachine.entities.*;
import com.coffeemachine.exception.IngredientsNotAvailableException;
import com.google.common.collect.Lists;


public class CoffeeManager implements BeverageManager {

    public Beverage prepare() throws IngredientsNotAvailableException {
        final IngredientStore ingredientStore = IngredientStore.getInstance();
        final Ingredient milk = ingredientStore.takeIngredient(BeverageType.COFFEE, IngredientType.MILK, 30);
        final Ingredient water = ingredientStore.takeIngredient(BeverageType.COFFEE, IngredientType.WATER, 50);
        final Ingredient coffee = ingredientStore.takeIngredient(BeverageType.COFFEE, IngredientType.COFFEE_SYRUP, 10);
        final Ingredient sugar = ingredientStore.takeIngredient(BeverageType.COFFEE, IngredientType.SUGAR_SYRUP, 10);
        return new Coffee(Lists.newArrayList(milk, water, coffee, sugar));

    }
}
