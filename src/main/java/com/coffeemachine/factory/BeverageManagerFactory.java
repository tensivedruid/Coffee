package com.coffeemachine.factory;

import com.coffeemachine.entities.BeverageType;
import com.coffeemachine.manager.*;

public class BeverageManagerFactory {
    public BeverageManager getBeverageManager(final BeverageType beverageType) {

        if (beverageType == BeverageType.ELAICHI_TEA) {
            return new ElaichiTeaManager();
        }
        else if (beverageType == BeverageType.HOT_MILK) {
            return new HotMilkManager();
        }
        else if (beverageType == BeverageType.HOT_WATER) {
            return new HotWaterManager();
        }
        else if (beverageType == BeverageType.GINGER_TEA) {
            return new GingerTeaManager();
        }
        else if (beverageType == BeverageType.COFFEE) {
            return new CoffeeManager();
        }
        else {
            return new TeaManager();
        }
    }
}
