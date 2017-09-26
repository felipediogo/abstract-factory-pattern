package com.diogo.felipe.cars.bmw;

import com.diogo.felipe.CarFactory;
import com.diogo.felipe.HatchCar;
import com.diogo.felipe.SedanCar;

public class BmwFactory implements CarFactory {
    @Override
    public HatchCar createHatchCar() {
        return new M135i();
    }

    @Override
    public SedanCar createSedanCar() {
        return new M550d();
    }
}
