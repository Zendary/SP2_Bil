package com.company;

abstract class AFuelCar extends ACar{
    int kmPrLitre;
    public AFuelCar(String registrationNr, String make, String model, int amountOfDoors, int kmPrLitre) {
        super(registrationNr,make,model,amountOfDoors);
        this.kmPrLitre = kmPrLitre; //initialiseret i konstruktøren
    }
    //should return "Gasoline" or "Diesel"
abstract String getFuelType();

    int kmPrLitre(){
        return 0; //Should return kilometers per liter driven
    }


}
