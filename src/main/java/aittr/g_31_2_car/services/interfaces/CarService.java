package aittr.g_31_2_car.services.interfaces;

import aittr.g_31_2_car.domain.Car;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CarService {
    List<Car> getAll();
    public List<Car> getByYear(int year);
    Car save(Car car);
    void deleteById(int id);
    void deleteByModel(String model);

}
