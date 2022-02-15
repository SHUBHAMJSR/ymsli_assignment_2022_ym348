package com.model.training.persistance;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import com.model.factory.ConnectionFactory;

public class TrainingDaoImpl implements TrainingDao{

	private Connection connection=null;
	public TrainingDaoImpl() {
		connection=ConnectionFactory.getConnection();
	}
	
	@Override
	public List<TraineeMgmt> getAll() throws DataAccessException {
		
	}

	@Override
	public TraineeMgmt addProduct(TraineeMgmt trainee) {
		try {
			PreparedStatement pstmt = connection.prepareStatement
					("insert into TraineeMgmt(trainee_id,trainee_name,branch,Percentage) values(?,?,?,?);");
			pstmt.setInt(1, trainee.getTrainee_id());
			pstmt.setString(2, trainee.getTrainee_name());
			pstmt.setString(3, trainee.getBranch());
			pstmt.setDouble(4, trainee.getPercentage());
			
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return product;
	}

}
