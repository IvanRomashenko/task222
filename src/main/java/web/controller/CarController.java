package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDao;

@Controller
@RequestMapping(value = "/get")
public class CarController {

    private CarDao carDao;

    @Autowired
    public CarController(CarDao carDao) {
        this.carDao = carDao;
    }

    @GetMapping("/allCars")
    public String allCars(Model model) {
        model.addAttribute("carList", carDao.getCarList());
        return "allCars";
    }

    @GetMapping("/carsForCount")
    public String getCars(@RequestParam(
            value = "count",
            required = false,
            defaultValue = "5") int count, Model model) {
        model.addAttribute("carList", carDao.getCars(count));
        return "getCars";
    }
}
