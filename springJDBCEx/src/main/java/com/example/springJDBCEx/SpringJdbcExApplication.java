package com.example.springJDBCEx;
import java.util.*;
import com.example.springJDBCEx.model.student;
import com.example.springJDBCEx.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringJdbcExApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJdbcExApplication.class, args);
		student s = context.getBean(student.class);
		s.setName("Harshit");
		s.setRollNo(131);
		s.setMarks(99);

		StudentService service = context.getBean(StudentService.class);
		service.addStudent(s);

		List<student> students = service.getAllStudent();
		System.out.println(students);
	}

}
