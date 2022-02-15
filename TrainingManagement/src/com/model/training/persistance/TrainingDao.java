package com.model.training.persistance;

import java.util.List;

public interface TrainingDao {
	public List<TraineeMgmt> getAll()throws DataAccessException;
	public TraineeMgmt addProduct(TraineeMgmt trainee);
}
