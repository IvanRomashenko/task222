package web.dao;

import web.models.Car;

import java.util.List;

public interface CarDao {
    public List<Car> getCarList();
    public List<Car> getCars(int count);
}
