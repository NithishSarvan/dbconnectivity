package com.nithi.jsphibernateh2.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nithi.jsphibernateh2.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

//	@Autowired
//	CourseJdbcRepository repository;
//	
//	@Autowired
//	CourseJpaReapository repository;
	
	@Autowired
	CourseSpringDataJpaRepository repository;

	@Override
	public void run(String... args) throws Exception {
		
		/*
		 * repository.insert( new Course(1, "Core Java jpa", "Nithish"));
		 * repository.insert( new Course(2, "Spring-boot-3 jpa", "Nithish"));
		 * repository.insert( new Course(3, "Full-stack jpa", "Nithish"));
		 */
		
		/*
		 * System.out.println(repository.selectById(1));
		 * System.out.println(repository.selectById(3));
		 */
		
		
		  repository.save( new Course(1, "Core Java spring jpa", "Nithish"));
		  repository.save( new Course(2, "Spring-boot-3 spring jpa", "Nithish"));
		  repository.save( new Course(3, "Full-stack  spring jpa", "Nithish"));
		 
		
		repository.deleteById(2l);
		
		System.out.println(repository.findById(1l));
		System.out.println(repository.findById(3l));
		
		System.out.println(repository.findAll());
		System.out.println(repository.count());
		
		System.out.println("------------  author ------------");
		
		System.out.println(repository.findByAuthor("Nithish"));
		System.out.println(repository.findByAuthor(""));
		
		System.out.println("------------  name ------------");
		
		System.out.println(repository.findByName("Spring-boot-3 spring jpa"));
		System.out.println(repository.findByName("Full-stack  spring jpa"));
		System.out.println(repository.findByName(""));
		
	}

}
