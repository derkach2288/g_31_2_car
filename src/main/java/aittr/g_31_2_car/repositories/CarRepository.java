package aittr.g_31_2_car.repositories;

import aittr.g_31_2_car.domain.Car;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CarRepository extends JpaRepository<Car, Integer> {
    @Transactional
    void deleteByModel(String model);

    @Query(value = "SELECT * FROM car WHERE year = :year", nativeQuery = true)
    List<Car> getByYear(@Param("year") int year);


//    @Modifying
//    @Query(value = "INSERT INTO car (brand, model, year) VALUES (:#{#car.brand}, :#{#car.model}, :#{#car.year})", nativeQuery = true)
//    Car save(@Param("car") Car car);



}
