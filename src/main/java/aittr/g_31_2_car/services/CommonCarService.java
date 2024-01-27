package aittr.g_31_2_car.services;

import aittr.g_31_2_car.domain.Car;
import aittr.g_31_2_car.repositories.CarRepository;
import aittr.g_31_2_car.services.interfaces.CarService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommonCarService implements CarService {

    private CarRepository repository;

    public CommonCarService(CarRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Car> getAll() {
        return repository.findAll();
    }

    @Override
    public List<Car> getByYear(int year) {
        return repository.getByYear(year);
    }


    @Override
    public Car save(Car car) {
        return repository.save(car);
    }


    @Override
    public void deleteById(int id) {
        repository.deleteById(id);
    }

    @Override
    public void deleteByModel(String model) {
        repository.deleteByModel(model);
    }
}
