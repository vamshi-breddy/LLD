package com.designPatterns.NullObjectHandling;

public class Main {
    public static void main(String[] args) {
        vehicle vehicle1 = VehicleFactory.getVehicleObject("honda");
        printVehicleDetails(vehicle1);
    }

    private static void printVehicleDetails(vehicle vehicle1) {
        System.out.println("seating capacity "+vehicle1.getSeatingCapacity());
        System.out.println("tank capacity" + vehicle1.getTankCapacity());
    }
}
