package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentService studentService){

        return args -> {
            Student abdo = new Student(
                    "Abdullah",
                    "abdullah@gmail.com",
                    LocalDate.of(2002, Month.MARCH, 23));

            Student ahmed = new Student(
                    "Ahmed",
                    "Ahmed@gmail.com",
                    LocalDate.of(1990, Month.MARCH, 23));

            studentService.addNewStudent(abdo);
            studentService.addNewStudent(ahmed);

        };
    }
}
