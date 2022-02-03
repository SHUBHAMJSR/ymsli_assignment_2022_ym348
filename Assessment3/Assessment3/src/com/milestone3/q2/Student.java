package com.milestone3.q2;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

class Student {
	private int id;
	private String name;
	private int marks;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public Student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + marks;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (id != other.id)
			return false;
		if (marks != other.marks)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", marks=");
		builder.append(marks);
		builder.append("]");
		return builder.toString();
	}
	

	public static void main(String[] args) 
	{
		Map<Student, Integer> map=new HashMap<>();
		map.put(new Student(109, "raj", 95), 95);
		map.put(new Student(61, "keta", 78), 78);
		map.put(new Student(11, "gunika", 98), 98);
		map.put(new Student(19, "keshav", 97), 97);
		
		 //Print all records sorted as per name of the student
		
		System.out.println("--------All records sorted by name--------");
		map.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByKey(Comparator.comparing(Student::getName)))
		.forEach(s-> System.out.println(s));
		
		 //Print all records as per id of the student
		
		System.out.println("------All recods as per id---------");
		map.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByKey(Comparator.comparing(Student::getId)))
		.forEach(s-> System.out.println(s));
		
		
	}
 }
