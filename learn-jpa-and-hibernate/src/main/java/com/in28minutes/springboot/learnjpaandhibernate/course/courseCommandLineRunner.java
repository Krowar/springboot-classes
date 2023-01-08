package com.in28minutes.springboot.learnjpaandhibernate.course;

import com.in28minutes.springboot.learnjpaandhibernate.course.jdbc.CourseJdbcRepository;
import com.in28minutes.springboot.learnjpaandhibernate.course.jpa.CourseJpaRepository;
import com.in28minutes.springboot.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import com.in28minutes.springboot.learnjpaandhibernate.course.Course;

@Component
public class courseCommandLineRunner implements CommandLineRunner {
//    @Autowired
//    private CourseJdbcRepository repository;
//    @Autowired
//    private CourseJpaRepository repository;

    @Autowired
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        Course course1 = new Course(1, "My cooking class", "My man Kobe");
        Course course2 = new Course(2, "My running class", "My man Kobe");
        Course course3 = new Course(3, "My jumping class", "My man Kobe");
        repository.save(course1);
        repository.save(course2);
        repository.save(course3);
        repository.delete(course2);

        System.out.println(repository.findById(course1.getId()));
        //System.out.println(repository.findOne(course3));
        //System.out.println(repository.findAll());
        System.out.println(repository.findByAuthor("My man Kobe"));
        System.out.println(repository.findByName("My cooking class"));

    }
}

