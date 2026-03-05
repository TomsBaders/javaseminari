package main;

import java.util.ArrayList;

import model.Professor;
import model.Student;
import model.Course;
import model.Grade;

public class VeA_IS {
	public static ArrayList<Professor> profList = new ArrayList<>();
    public static ArrayList<Student> studentList = new ArrayList<>();
    public static ArrayList<Course> courseList = new ArrayList<>();
    public static ArrayList<Grade> gradeList = new ArrayList<>();
	
	public static void main(String[] args) {
		Professor p1 = new Professor("test1", "test2", "test");
		Student s1 = new Student("toms", "baders");
		Student s2 = new Student("test", "person");
		Course c1 = new Course("Math", 3, p1);
		Course c2 = new Course("Sports", 6, p1);
		Grade g1 = new Grade(6, s1, c1);
		Grade g2 = new Grade(5, s1, c2);
		Grade g3 = new Grade(8, s2, c1);
		Grade g4 = new Grade(9, s2, c2);
		
		profList.add(p1);
		studentList.add(s1);
		studentList.add(s2);
		courseList.add(c1);
		courseList.add(c2);
		gradeList.add(g1);
		gradeList.add(g2);
		gradeList.add(g3);
		gradeList.add(g4);
		
		studentList.sort((a, b) ->
	    	Double.compare(
	    		b.calculateAverage(gradeList),
	        	a.calculateAverage(gradeList)
	    	)
		);
		
		System.out.println(p1.toString());
		System.out.println(s1.toString());
		System.out.println(c1.toString());
		System.out.println(g1.toString());
	}
}
