package model;

import java.util.ArrayList;

public class Student {
	String name;
	String surname;
	long idCounter = 10000;
	long st_ID = idCounter;
	
	public Student() {
		idCounter++;
	}
	public Student(String newname, String newsurname) {
		name = newname;
		surname = newsurname;
		idCounter++;
	}
	
	public long getID() {
	    return st_ID;
	}
	public String getname() {
	    return name;
	}
	public String getsurname() {
	    return surname;
	}
	
	public void name(String name) {
		if (name == null) {
			this.name = name;
		}
	}
	public void setID(String surname) {
		if (surname == null) {
			this.surname = surname;
		}
	}
	
	public double calculateAverage(ArrayList<Grade> gradeList) {
	    double sum = 0;
	    int count = 0;

	    for (Grade g : gradeList) {
	        if (g.getstudent().equals(this)) {
	            sum += g.getvalue();
	            count++;
	        }
	    }

	    if (count == 0) return 0;

	    return sum / count;
	}
	public double calculateWeightedAverage(ArrayList<Grade> gradeList) {
	    double totalPoints = 0;
	    double totalCredits = 0;

	    for (Grade g : gradeList) {
	        if (g.getstudent().equals(this)) {
	            totalPoints += g.getvalue() * g.getcourse().getcreditPoints();
	            totalCredits += g.getcourse().getcreditPoints();
	        }
	    }

	    if (totalCredits == 0) return 0;

	    return totalPoints / totalCredits;
	}
	public double calculateCourseAverage(ArrayList<Grade> gradeList) {
	    double sum = 0;
	    int count = 0;

	    for (Grade g : gradeList) {
	        if (g.getcourse().equals(this)) {
	            sum += g.getvalue();
	            count++;
	        }
	    }

	    if (count == 0) return 0;

	    return sum / count;
	}
	
	public String toString() {
		return "Student [name=" + name + ", surname=" + surname +"]";
	}
}
