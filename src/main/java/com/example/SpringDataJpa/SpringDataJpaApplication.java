package com.example.SpringDataJpa;

import com.example.SpringDataJpa.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDataJpaApplication.class, args);

        Student s1 = context.getBean(Student.class);
        Student s2 = context.getBean(Student.class);
        Student s3 = context.getBean(Student.class);
        Student s4 = context.getBean(Student.class);
        Student s5 = context.getBean(Student.class);
        Student s6 = context.getBean(Student.class);


        StudentRepo repo = context.getBean(StudentRepo.class);

        s1.setId(101);
        s1.setName("Kalyan");
        s1.setMarks(87);

        s2.setId(102);
        s2.setName("Krish");
        s2.setMarks(83);

        s3.setId(103);
        s3.setName("Harsh");
        s3.setMarks(82);

        s4.setId(104);
        s4.setName("Sunny");
        s4.setMarks(84);

        s5.setId(105);
        s5.setName("Nithya");
        s5.setMarks(85);

        s6.setId(106);
        s6.setName("Satya");
        s6.setMarks(86);

        repo.save(s1);
        repo.save(s2);
        repo.save(s3);
        repo.save(s4);
        repo.save(s5);
        repo.save(s6);  // Inserting

        System.out.println(repo.findAll()); // Fetching

        s1.setMarks(88);
        repo.save(s1);  // Updating

        System.out.println(repo.findAll());

        repo.delete(s3); //Deleting
        System.out.println(repo.findAll());

        System.out.println(repo.findById(101));

        System.out.println(repo.getByMarks(88));

        System.out.println(repo.getByName("Krish"));

        repo.deleteById(106);

        System.out.println(repo.findAll());
	}

}
