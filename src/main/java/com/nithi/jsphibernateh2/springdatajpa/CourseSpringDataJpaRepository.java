package com.nithi.jsphibernateh2.springdatajpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nithi.jsphibernateh2.course.Course;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {
	
	List<Course> findByAuthor(String author);
	List<Course> findByName(String namee);

}
