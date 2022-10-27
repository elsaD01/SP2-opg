import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

FleetOfCars fleetOfCars = new FleetOfCars();


        Car Gasoline = new GasolineCar("FP8549832", "Audi", "A6", 5,50);

        Car Diesel = new DieselCar("AF81345",  "Audi", "A8",5, 50, true);

        Car Electric = new ElectricCar("DF71743" , "Tesla", "x", 5, 20, 80);

    fleetOfCars.addCar(Gasoline);
    fleetOfCars.addCar(Diesel);
    fleetOfCars.addCar(Electric);

        System.out.println(fleetOfCars.getTotalRegistrationFeeForFleet());

        System.out.println(fleetOfCars);


    }

}