package com.in28minutes.springboot.learnjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.in28minutes.springboot.learnjpaandhibernate.course.Course;

@Component
public class courseJdbcCommandLineRunner implements CommandLineRunner {
    @Autowired
    private CourseJdbcRepository repository;

    @Override
    public void run(String... args) throws Exception {
        Course course1 = new Course(1, "My cooking classe", "My man Kobe");
        Course course2 = new Course(2, "My running classe", "My man Kobe");
        Course course3 = new Course(3, "My jumping classe", "My man Kobe");
        repository.insert(course1);
        repository.insert(course2);
        repository.insert(course3);
        repository.delete(course2);

        System.out.println(repository.select(course1));
        System.out.println(repository.select(course3));
    }
}

