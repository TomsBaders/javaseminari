package model;

public class Course {
	String title;
	int creditPoints;
	Professor professor;
	long idCounter = 100000;
	long c_ID = idCounter;
	
	public Course() {
		idCounter++;
	}
	public Course(String newtitle, int newcreditPoints, Professor newprofessor) {
		title = newtitle;
		creditPoints = newcreditPoints;
		professor = newprofessor;
		idCounter++;
	}
	
	public long getID() {
	    return c_ID;
	}
	public String gettitle() {
	    return title;
	}
	public int getcreditPoints() {
	    return creditPoints;
	}
	public Professor getprofessor() {
		return professor;
	}
	
	public void settitle(String title) {
		if (title != null) {
			this.title = title;
		}
	}
	public void setcreditPoints(int creditPoints) {
		if (creditPoints > 0) {
			this.creditPoints = creditPoints;
		}
	}
	
	public String toString() {
		return "Course [title=" + title + ", creditPoints=" + creditPoints + ", professor=" + professor +"]";
	}
}
