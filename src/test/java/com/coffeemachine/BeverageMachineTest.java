package com.coffeemachine;

import com.coffeemachine.entities.BeverageMachine;
import com.coffeemachine.entities.BeverageType;
import com.coffeemachine.factory.BeverageManagerFactory;
import org.junit.BeforeClass;
import org.junit.Test;

public class BeverageMachineTest {
    private  static BeverageMachine beverageMachine;

    @BeforeClass
    public static void  once(){
        beverageMachine = new BeverageMachine(4, new BeverageManagerFactory());
    }

    @Test
    public void testPrepareBeverage(){
        final Thread coffee = prepareBeverage(BeverageType.COFFEE);
        final Thread hotWater = prepareBeverage(BeverageType.HOT_WATER);
        final Thread hotMilk = prepareBeverage(BeverageType.HOT_MILK);
        final Thread elaichiTea = prepareBeverage(BeverageType.ELAICHI_TEA);
        final Thread gingerTea = prepareBeverage(BeverageType.GINGER_TEA);

        coffee.start();
        hotWater.start();
        hotMilk.start();
        elaichiTea.start();
        gingerTea.start();

        try {
            coffee.join();
            hotWater.join();
            hotMilk.join();
            elaichiTea.join();
            gingerTea.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private Thread prepareBeverage(final BeverageType beverageType) {
        final Runnable runnable = () -> {
            try {
                beverageMachine.prepareBeverage(beverageType);
            } catch (final Exception ex) {
                System.out.println(ex.getMessage());
            }
        };

        return new Thread(runnable);
    }
}
