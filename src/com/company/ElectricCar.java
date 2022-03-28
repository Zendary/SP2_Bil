package com.company;

class ElectricCar extends ACar{
    int batteryCapacity;
    int maxRange;

    public ElectricCar(String registrationNr, String make, String model, int amountOfDoors,int batteryCapacity,int maxRange) {
        super(registrationNr, make, model, amountOfDoors);
        this.batteryCapacity = batteryCapacity;
        this.maxRange = maxRange;
    }

    int getBatteryCapacityKWh(){
        return batteryCapacity;
    }
    int getMaxRangeKm(){
        return maxRange;
    }
    int getWhPrKm(){
        return (batteryCapacity/maxRange)*1000;
    }

    @Override
    public String getRegistrationNumber() {
        return super.getRegistrationNumber();
    }

    @Override
    public String getMake() {
        return super.getMake();
    }

    @Override
    public String getModel() {
        return super.getModel();
    }

    @Override
    public int getNumberOfDoors() {
        return super.getNumberOfDoors();
    }

    @Override
    public int getRegistrationFee() {
        int registrationFee;
        int kmPrWatt = 100/(getWhPrKm()/91);
        if(kmPrWatt >= 21) {
            registrationFee = 330;
        }
        else if (kmPrWatt > 15 && kmPrWatt <=20){
            registrationFee =  1050;
        }
        else if (kmPrWatt > 10 && kmPrWatt <=15) {
            registrationFee = 2340;
        }
        else if (kmPrWatt > 5 && kmPrWatt <=10) {
            registrationFee = 5500;
        }
        else{
            registrationFee = 10470;
        }
        return registrationFee;
    }

    @Override
    public String toString() {
        return "ElectricCar{with a " +
                "Registration number of: " + registrationNr + '\'' +
                ", on a: " + make + '\'' +
                  model + " series"+'\'' +
                ", it has " + amountOfDoors + " doors" +
                ", the batteries capacity is " + batteryCapacity +
                ", and the max range is " + maxRange +
                '}';
    }
}
