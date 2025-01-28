package web.service;

import web.models.Car;

import java.util.List;

public interface CarService {
    public List<Car> getCarList();
    public List<Car> getCars(int count);
}
