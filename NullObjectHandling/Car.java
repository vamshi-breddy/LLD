package com.designPatterns.NullObjectHandling;

public class Car implements  vehicle{
    @Override
    public int getTankCapacity() {
        return 40;
    }

    @Override
    public int getSeatingCapacity() {
        return 5;
    }
}
