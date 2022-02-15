package com.model.training.service;

import java.util.List;

import com.model.training.persistance.DataAccessException;
import com.model.training.persistance.TraineeMgmt;

public interface TrainingService {
	public List<TraineeMgmt> getAll()throws DataAccessException;
	public TraineeMgmt addProduct(TraineeMgmt trainee);
}
