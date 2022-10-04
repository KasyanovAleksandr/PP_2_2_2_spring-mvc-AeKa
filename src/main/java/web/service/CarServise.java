package web.service;

import web.models.Car;

import java.util.List;

public interface CarServise {
    List<Car> getCars(int count);
}
