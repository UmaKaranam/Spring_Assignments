package com.cg.beans;

public class ProductV1 {
	private int Id;
	private String Name;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	@Override
	public String toString() {
		return "ProductV1 [Id=" + Id + ", Name=" + Name + "]";
	}
	public ProductV1(int id, String name) {
		super();
		Id = id;
		Name = name;
	}
	

}
