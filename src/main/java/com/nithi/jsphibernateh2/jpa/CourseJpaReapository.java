package com.nithi.jsphibernateh2.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nithi.jsphibernateh2.course.Course;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CourseJpaReapository {
	
	@Autowired
	EntityManager entityManager;
	
	
	public void insert(Course course) {
		
		entityManager.merge(course);
		
	}

	public void deleteById(long id) {
		
		 Course course = entityManager.find(Course.class, id);
		 entityManager.remove(course);
	}
	
	public Course selectById(long id) {
		
		return entityManager.find(Course.class, id);
		
	}


}
