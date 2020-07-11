package com.coffeemachine.manager;

import com.coffeemachine.entities.Beverage;
import com.coffeemachine.exception.IngredientsNotAvailableException;

public interface BeverageManager {

    Beverage prepare() throws IngredientsNotAvailableException;
}
