package com.designPatterns.NullObjectHandling;

public class Bike implements vehicle{
    @Override
    public int getTankCapacity() {
        return 20;
    }

    @Override
    public int getSeatingCapacity() {
        return 1;
    }
}
