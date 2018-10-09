package com.apap.tutorial4.service;

import java.util.List;
import com.apap.tutorial4.model.CarModel;

/**
 * 
 * CarService
 *
 */
public interface CarService {
	void addCar(CarModel car);
	void deleteCar(long carId);
	CarModel findCarById(long id);
	void carUpdate(CarModel car, Long id);
	List<CarModel> sortDrHarga(Long dealerId);
}
