package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDao;
import web.service.CarService;

@Controller
@RequestMapping(value = "/get")
public class CarController {

    private CarDao carDao;
    private CarService carService;

    @Autowired
    public CarController(CarDao carDao, CarService carService) {
        this.carDao = carDao;
        this.carService = carService;
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
        model.addAttribute("carList", carService.getCars(count));
        return "getCars";
    }
}
