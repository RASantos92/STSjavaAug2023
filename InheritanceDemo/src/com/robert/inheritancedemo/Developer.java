package com.robert.inheritancedemo;

import java.util.ArrayList;

public class Developer {
	
    //------------------ attributes (private/protected) ----------------------
    private static int devCount;
    private static double totalSalary;
    private boolean canCode = true;
    private String name;
    protected int age;
    private double salary;
    private ArrayList<String> languages;


    //------------------ constructors ----------------------
    public Developer(){
        this.languages = new ArrayList<String>();
        this.name = "no name";
        Developer.devCount++;
    }
    
    public Developer(String name) {
    	this.languages = new ArrayList<String>();
    	Developer.devCount++;
    	this.name = name;
    }
    
    public Developer(String name, int age) {
    	this.languages = new ArrayList<String>();
    	Developer.devCount++;
    	this.name = name;
    	this.age = age;
    }

    public Developer(String name, int age,double salary){
        this.languages = new ArrayList<String>();
        this.name = name;
        this.age = age;
        this.salary = salary;
        Developer.devCount++;
        Developer.totalSalary += salary;
    }
    
    //------------------ other class methods ----------------------
    public void displayStatus(){
        System.out.println("name: " + this.name);
        System.out.println("can code: " + this.canCode);
        System.out.println("age: " + this.age);
        System.out.println("salary: " + this.salary);
        System.out.println("languages: " + this.languages);
    }

    public void addLanguage(String language){
        this.languages.add(language);
    }

	public static int getDevCount() {
		return devCount;
	}

	public static void setDevCount(int devCount) {
		Developer.devCount = devCount;
	}

	public static double getTotalSalary() {
		return totalSalary;
	}

	public static void setTotalSalary(double totalSalary) {
		Developer.totalSalary = totalSalary;
	}

	public boolean isCanCode() {
		return canCode;
	}

	public void setCanCode(boolean canCode) {
		this.canCode = canCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public ArrayList<String> getLanguages() {
		return languages;
	}

	public void setLanguages(ArrayList<String> languages) {
		this.languages = languages;
	}
    
    

}
