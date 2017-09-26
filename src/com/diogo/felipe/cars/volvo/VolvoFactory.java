package com.diogo.felipe.cars.volvo;

import com.diogo.felipe.CarFactory;
import com.diogo.felipe.HatchCar;
import com.diogo.felipe.SedanCar;

public class VolvoFactory implements CarFactory {
    @Override
    public HatchCar createHatchCar() {
        return new V40();
    }

    @Override
    public SedanCar createSedanCar() {
        return new S90();
    }
}
