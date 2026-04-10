package com.app.fruits;
import java.util.*;

abstract public class Fruit{
	private String color;
	private double weight;
	private String name;
	private boolean isFresh = true;
	
	public Fruit() {
		
	}
	public Fruit(String name, double weight, String color) {
		this.name = name;
		this.weight = weight;
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isFresh() {
		return isFresh;
	}
	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}
	@Override
	public String toString() {
		return "Fruit [Name=" + name + ", weight=" + weight + ", Color=" + color + ", isFresh=" + isFresh + "]";
	}
	abstract public String taste();
}








