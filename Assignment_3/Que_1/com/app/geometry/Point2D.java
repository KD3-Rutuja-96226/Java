package com.app.geometry;


public class Point2D {	
	private int x;
	private int y; 
	
	public Point2D() {
		
	}
	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public String getDetails() {
		return "Coordinates : ("+x+","+y+")";
	}
	public boolean isEqual(Point2D other) {
	
		if(this.x==other.x && this.y==other.y) {
			return true;
		}
		return false;	
			
	}
	public double calculateDistance(Point2D other) {
		double res = Math.sqrt(Math.pow((other.getX()-this.getX()),2) + Math.pow((other.getY() - this.getY()),2));
		return res;
	}

	
}
