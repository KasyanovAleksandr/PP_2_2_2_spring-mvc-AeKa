package web.dao;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDaoImp implements CarDao {
    private List<Car> carsList;

    {
        carsList = new ArrayList<>();
        carsList.add(new Car("Toyota", "black", 123456L));
        carsList.add(new Car("Mazda", "green", 987654L));
        carsList.add(new Car("Kamaz", "orange", 345216L));
        carsList.add(new Car("Tesla", "white", 897098L));
        carsList.add(new Car("Aurus", "blue", 576548L));
    }

    @Override
    public List<Car> getCarsList(int count) {
        return carsList.stream().limit(count).collect(Collectors.toList());
    }
}
