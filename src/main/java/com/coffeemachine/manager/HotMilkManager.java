package com.coffeemachine.manager;

import com.coffeemachine.entities.*;
import com.coffeemachine.exception.IngredientsNotAvailableException;
import com.google.common.collect.Lists;

public class HotMilkManager implements BeverageManager {
    @Override
    public Beverage prepare() throws IngredientsNotAvailableException {
        final IngredientStore ingredientStore = IngredientStore.getInstance();
        final Ingredient ingredient = ingredientStore.takeIngredient(BeverageType.HOT_MILK, IngredientType.MILK, 5);
        return new HotMilk(Lists.newArrayList(ingredient));
    }
}
