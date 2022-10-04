package com.designPatterns.NullObjectHandling;

public class VehicleFactory {

    static vehicle getVehicleObject(String typeOfVehicle){
        if("Car".equals(typeOfVehicle)){
            return new Car();
        }
        else if ("Bike".equals(typeOfVehicle)){
            return new Bike();
        }
        return new Null();
    }
}
