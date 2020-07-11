package com.coffeemachine.manager;

import com.coffeemachine.entities.*;
import com.coffeemachine.exception.IngredientsNotAvailableException;
import com.google.common.collect.Lists;

public class HotWaterManager implements BeverageManager {
    @Override
    public Beverage prepare() throws IngredientsNotAvailableException {
        IngredientStore ingredientStore = IngredientStore.getInstance();
        Ingredient ingredient = ingredientStore.takeIngredient(IngredientType.WATER, 10);
        return new HotWater(Lists.newArrayList(ingredient));
    }
}
