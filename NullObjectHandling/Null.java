package com.designPatterns.NullObjectHandling;

public class Null implements vehicle{
    @Override
    public int getTankCapacity() {
        return 0;
    }

    @Override
    public int getSeatingCapacity() {
        return 0;
    }
}
