package com.company;

public class Main {
    public static void main(String[] args) {
        FleetOfCars fleetOfCars = new FleetOfCars();
	DieselCar dieselCar1= new DieselCar("AH42069","Audi","R8",4,20,false);
    ElectricCar electricCar1 = new ElectricCar("GZ42069","Tesla","X",4,5,4);
    GasolineCar gasolineCar1 = new GasolineCar("KO42069","Fiat","Punto",4,8);

    fleetOfCars.addCar(dieselCar1);
    fleetOfCars.addCar(electricCar1);
    fleetOfCars.addCar(gasolineCar1);

    for (Car f: fleetOfCars.getFleet()){
        System.out.println(f);
    }
        System.out.println("Total registration fee = "+ fleetOfCars.getTotalRegistrationFeeForFleet());
    }
}
