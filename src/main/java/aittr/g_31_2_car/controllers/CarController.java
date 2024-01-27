package aittr.g_31_2_car.controllers;

import aittr.g_31_2_car.domain.Car;
import aittr.g_31_2_car.services.interfaces.CarService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/car")
public class CarController {

    private CarService service;

    public CarController(CarService service) {
        this.service = service;
    }

    @GetMapping
    public List<Car> getAll() {
        return service.getAll();
    }

    @GetMapping("/year/{year}")
    public List<Car> getByYear(@PathVariable int year) {
        return service.getByYear(year);
    }

    @PostMapping
    public Car save(@RequestBody Car car) {
        return service.save(car);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable int id) {
        service.deleteById(id);
    }

    @DeleteMapping("/del/{model}")
    public void deleteByModel(@PathVariable String model) {
        service.deleteByModel(model);
    }
}
