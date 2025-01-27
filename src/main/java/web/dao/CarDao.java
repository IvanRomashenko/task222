package web.dao;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDao {
    private List<Car> carList;

    {
        carList = new ArrayList<Car>();
        carList.add(new Car("Mers", "model1", 2010));
        carList.add(new Car("BMW", "model2", 2011));
        carList.add(new Car("WV", "model3", 2012));
        carList.add(new Car("Opel", "model4", 2013));
        carList.add(new Car("VAZ", "model5", 2014));
    }

    public List<Car> getCarList() {
        return carList;
    }

//    public List<Car> getCars(int count) {
//        return carList.stream().limit(count).collect(Collectors.toList());
//    }
}
