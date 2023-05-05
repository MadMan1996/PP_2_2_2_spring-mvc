package web.services;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Component
public class CarServiceImpl implements CarService{
    private static List<Car> cars;

    static {
        cars = new ArrayList<>();
        cars.add(new Car("BMW", 6, 2.8, "Red"));
        cars.add(new Car("Lada", 10, 1.6, "Baklazhan"));
        cars.add(new Car("Honda", 3, 2.2, "Metallic"));
        cars.add(new Car("Mercedes", 3, 3.0, "Black"));
        cars.add(new Car("Audi", 6, 2.0, "White"));

    }
    @Override
    public List<Car> getCars(Integer count) {
        Integer countCars = Optional.ofNullable(count).orElse(cars.size());
        return cars.subList(0, countCars >= cars.size() ? cars.size() : countCars);
    }
}
