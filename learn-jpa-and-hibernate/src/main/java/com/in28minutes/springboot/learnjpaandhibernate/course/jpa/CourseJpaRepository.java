package com.in28minutes.springboot.learnjpaandhibernate.course.jpa;

import com.in28minutes.springboot.learnjpaandhibernate.course.Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.TransactionScoped;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CourseJpaRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public void insert(Course course){
        entityManager.merge(course);
    }

    public Course select(Course course){
        return entityManager.find(Course.class, course.getId());
    }

    public void delete(Course course){
        Course course1 = entityManager.find(Course.class, course.getId());
        entityManager.remove(course1);
        //entityManager.remove(entityManager.contains(course) ? course : entityManager.merge(course));
    }
}
