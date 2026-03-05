package model;

public class Grade {
	int value;
	Student student;
	Course course;
	long idCounter = 200000;
	long g_ID = idCounter;
	
	public Grade() {
		idCounter++;
	}
	public Grade(int newvalue, Student newstudent, Course newcourse) {
		value = newvalue;
		student = newstudent;
		course = newcourse;
		idCounter++;
	}
	
	public long getID() {
	    return g_ID;
	}
	public long getvalue() {
	    return value;
	}
	public Student getstudent() {
		return student;
	}
	public Course getcourse() {
		return course;
	}

	public void setvalue(int value) {
		if (value >= 1 && value <= 10) {
			this.value = value;
		}
	}
	
	public String toString() {
		return "Grade [value=" + value + ", student=" + student + ", course=" + course +"]";
	}
}
