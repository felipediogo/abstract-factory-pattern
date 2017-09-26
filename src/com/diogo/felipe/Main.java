package com.diogo.felipe;

import com.diogo.felipe.cars.bmw.BmwFactory;
import com.diogo.felipe.cars.volvo.VolvoFactory;

public class Main {

    public static void main(String[] args) {
        CarFactory carFactory = new BmwFactory();
        SedanCar sedan = carFactory.createSedanCar();
        sedan.showSedanInfo();
        HatchCar hatch = carFactory.createHatchCar();
        hatch.showHatchInfo();

        carFactory = new VolvoFactory();
        sedan = carFactory.createSedanCar();
        sedan.showSedanInfo();
        hatch = carFactory.createHatchCar();
        hatch.showHatchInfo();
    }
}
