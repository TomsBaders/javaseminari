package model;

import java.util.ArrayList;

public class Professor {
	String name;
	String surname;
	String degree;
	long idCounter = 0;
	long p_ID = idCounter;
	
	public Professor() {
		idCounter++;
	}
	public Professor(String newname, String newsurname, String newdegree) {
		name = newname;
		surname = newsurname;
		degree = newdegree;
		idCounter++;
	}
	
	public long getID() {
	    return p_ID;
	}
	public String getname() {
	    return name;
	}
	public String getsurname() {
	    return surname;
	}
	public String getdegree() {
	    return degree;
	}
	
	public void setname(String name) {
		if (name != null) {
			this.name = name;
		}
	}
	public void setsurname(String surname) {
		if (surname != null) {
			this.surname = surname;
		}
	}
	public void setdegree(String degree) {
		if (degree != null) {
			this.degree = degree;
		}
	}
	
	public int countCourses(ArrayList<Course> courseList) {
	    int count = 0;

	    for (Course c : courseList) {
	        if (c.getprofessor().equals(this)) {
	            count++;
	        }
	    }

	    return count;
	}
	
	public String toString() {
		return "Professor [name=" + name + ", surname=" + surname + ", degree=" + degree +"]";
	}
}
