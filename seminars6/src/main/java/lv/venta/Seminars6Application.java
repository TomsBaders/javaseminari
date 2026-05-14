package lv.venta;

import lv.venta.model.*;
import lv.venta.model.enums.Degree;
import lv.venta.repo.*;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Seminars6Application {

	public static void main(String[] args) {
		SpringApplication.run(Seminars6Application.class, args);
	}

	@Bean
	public CommandLineRunner testRepo(IStudentRepo studRepo, IGradeRepo gradeRepo, IProfessorRepo profRepo, ICourseRepo courRepo) {
		return new CommandLineRunner() {
			@Override
			public void run(String... args) throws Exception {
				Student stud1 = new Student("Rendijs", "Serna");
				Student stud2 = new Student("Janis", "Berzins");
				studRepo.saveAll(Arrays.asList(stud1, stud2));
				
				Professor prof1 = new Professor("Vairis", "Caune", Degree.phd);
				Professor prof2 = new Professor("Galina", "Hilcevica", Degree.phd);
				Professor prof3 = new Professor("Jelena", "Mihailova", Degree.other);
				profRepo.saveAll(Arrays.asList(prof1, prof2, prof3));
				
				Course cour1 = new Course("Algoritmu Teorija", 3, prof1);
				Course cour2 = new Course("Matematiska Analize", 6, prof2);
				Course cour3 = new Course("Paralela programmesana", 4, prof1);
				cour2.addProfessor(prof3);
				courRepo.saveAll(Arrays.asList(cour1, cour2, cour3));
				
				prof1.addCourse(cour1);
				prof1.addCourse(cour3);
				prof2.addCourse(cour2);
				prof3.addCourse(cour2);
				profRepo.save(prof1);
				profRepo.save(prof2);
				profRepo.save(prof3);
				
				Grade grade11 = new Grade (10, stud1, cour1);
				Grade grade12 = new Grade (7, stud1, cour2);
				Grade grade21 = new Grade (5, stud2, cour1);
				Grade grade22 = new Grade (4, stud2, cour2);
				gradeRepo.saveAll(Arrays.asList(grade11, grade12, grade21, grade22));
			}
		};
	}
}
