package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import web.dao.CarDao;
import web.models.Car;

import java.util.List;

@Service
public class CarServiceImp implements CarServise {
private final CarDao carDao;

    @Autowired // для себя пометил конструктор.
    public CarServiceImp(CarDao carDao) {
        this.carDao = carDao;
    }


    @Override
    public List<Car> getCars(int count) {
        return carDao.getCarsList(count);
    }
}
