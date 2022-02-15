package com.model.training.persistance;

public class TraineeMgmt {
	private int id;
	private int trainee_id;
	private String trainee_name;
	private Branch branch;
	private Double percentage;

	public TraineeMgmt() {

	}

	public TraineeMgmt(int trainee_id, String trainee_name, Branch branch, Double percentage) {
		this.trainee_id = trainee_id;
		this.trainee_name = trainee_name;
		this.branch = branch;
		this.percentage = percentage;
	}

	public TraineeMgmt(int id, int trainee_id, String trainee_name, Branch branch, Double percentage) {
		this.id = id;
		this.trainee_id = trainee_id;
		this.trainee_name = trainee_name;
		this.branch = branch;
		this.percentage = percentage;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTrainee_id() {
		return trainee_id;
	}

	public void setTrainee_id(int trainee_id) {
		this.trainee_id = trainee_id;
	}

	public String getTrainee_name() {
		return trainee_name;
	}

	public void setTrainee_name(String trainee_name) {
		this.trainee_name = trainee_name;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	public Double getPercentage() {
		return percentage;
	}

	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TraineeMgmt [id=");
		builder.append(id);
		builder.append(", trainee_id=");
		builder.append(trainee_id);
		builder.append(", trainee_name=");
		builder.append(trainee_name);
		builder.append(", branch=");
		builder.append(branch);
		builder.append(", percentage=");
		builder.append(percentage);
		builder.append("]");
		return builder.toString();
	}

}
