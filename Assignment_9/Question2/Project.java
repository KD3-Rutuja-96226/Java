package com.sunbeam;

import java.util.Scanner;

public class Project {
	private int id;
	private String title;
	private int teamSize;
	private double projectCost;
	private String technology;
	
	public Project() {
		// TODO Auto-generated constructor stub
	}

	public Project(int id, String title, int teamSize, double projectCost, String technology) {
		super();
		this.id = id;
		this.title = title;
		this.teamSize = teamSize;
		this.projectCost = projectCost;
		this.technology = technology;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

	public double getProjectCost() {
		return projectCost;
	}

	public void setProjectCost(double projectCost) {
		this.projectCost = projectCost;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	@Override
	public String toString() {
		return "Projects [id=" + id + ", title=" + title + ", teamSize=" + teamSize + ", projectCost=" + projectCost
				+ ", technology=" + technology + "]";
	}
	
	public void acceptRecord() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id");
		this.id=sc.nextInt();
		System.out.println("Enter the Title");
		this.title=sc.nextLine();
		System.out.println("Enter the team size");
		this.teamSize=sc.nextInt();
		System.out.println("Enter the Project cost");
		this.projectCost=sc.nextDouble();
		System.out.println("Enter the technology");
		this.technology=sc.nextLine();
	}

}
