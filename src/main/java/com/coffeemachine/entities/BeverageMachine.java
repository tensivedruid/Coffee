package com.coffeemachine.entities;

import com.coffeemachine.exception.IngredientsNotAvailableException;
import com.coffeemachine.exception.OutletNotAvailableException;
import com.coffeemachine.factory.BeverageManagerFactory;
import com.coffeemachine.manager.BeverageManager;

import java.util.concurrent.atomic.AtomicInteger;

public class BeverageMachine {
    private AtomicInteger freeOutlets;
    private final BeverageManagerFactory beverageManagerFactory;

    public BeverageMachine(final int outlets,
                           final BeverageManagerFactory beverageManagerFactory) {
        this.freeOutlets = new AtomicInteger(outlets);
        this.beverageManagerFactory = beverageManagerFactory;
    }

    public Beverage prepareBeverage(final BeverageType beverageType) throws IngredientsNotAvailableException, OutletNotAvailableException {
        if (freeOutlets.get() == 0) {
            throw new OutletNotAvailableException( beverageType.name() + " cannot be prepared as no outlets is free");
        }

        System.out.println(" Preparing " + beverageType.name());
        freeOutlets.decrementAndGet();

        final BeverageManager beverageManager = beverageManagerFactory.getBeverageManager(beverageType);

        final Beverage beverage = beverageManager.prepare();
        System.out.println(" Prepared " + beverageType.name());
        freeOutlets.incrementAndGet();
        return beverage;

    }
}
