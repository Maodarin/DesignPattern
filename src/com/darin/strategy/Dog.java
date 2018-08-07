package com.darin.strategy;

public class Dog implements Comparable<Dog> {
	private int id;
	private int height;
	private int weight;
	private java.util.Comparator<Dog> comparator = new WeightComparator();
	public Dog(int id,int height) {
		this.id = id;
		this.height = height;
	}
	public Dog(int id,int height,int weight) {
		this.id = id;
		this.height = height;
		this.weight = weight;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	@Override
	public int compareTo(Dog o) {
		/*if(this.height>o.height)
			return 1;
		else if(this.height == o.height) {
			return 0;
		}else {
			return -1;
		}*/
		return this.comparator.compare(this, o);
	}

}
