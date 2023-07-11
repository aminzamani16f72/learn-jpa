package com.example.learnjpahibenate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class CourseCommandLineRunner implements CommandLineRunner {
    @Autowired
    CourseSpringDataJpaRepository courseJpaRepository;
    @Override
    public void run(String... args) throws Exception {
        courseJpaRepository.save(new Course(1,"history","amin"));
        courseJpaRepository.save(new Course(2,"history","amin"));
    }
}
