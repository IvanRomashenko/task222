package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.CarDao;
import web.models.Car;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarService {

    private CarDao carDao;

    @Autowired
    public CarService(CarDao carDao) {
        this.carDao = carDao;
    }

    public List<Car> getCars(int count) {
        return carDao.getCarList().stream().limit(count).collect(Collectors.toList());
    }
}
