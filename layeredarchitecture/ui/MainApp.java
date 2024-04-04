package layeredarchitecture.ui;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import layeredarchitecture.exceptions.CityNotFoundException;
import layeredarchitecture.exceptions.DataNotPresentException;
import layeredarchitecture.exceptions.StudentNotFoundException;
import layeredarchitecture.model.Student;
import layeredarchitecture.service.StudentService;
import layeredarchitecture.service.StudentServiceImpl;

public class MainApp {

	public static void main(String[] args) {

		Student stud = new Student();
		
		stud.setId(1);
		stud.setName("MS Dhoni");
		stud.setCity("Ranchi");
		Student stud1 = new Student(2,"SKY","Lucknow");
		Student stud2 = new Student(3,"R Ashwin","Chennai");
		Student stud3 = new Student(4,"Ishan Kishan","Patna");
		Student stud4 = new Student(5,"Virat Kohli","New Delhi");
		Student stud5 = new Student(6,"Rohit Sharma","New Delhi");
		Student stud6 = new Student(7,"Irfan Pathan","Chennai");
		Student stud7 = new Student(8,"Hardik","Gujurat");
		Student stud8 = new Student(9,"M Ashwin","Chennai");
		Student stud9 = new Student(10,"Ambaani","Mumbai");
		Student stud10 = new Student(11,"Chahal","Chennai");
		Student stud11 = new Student(12,"Bumrah","Mumbai");
		Student stud12 = new Student(13,"Siraj","Ahmedabad");
		Student studNull = null;
		
		//Creating Object of StudentServiceImpl
		StudentService studentService = new StudentServiceImpl();
		//Adding Objects to List
		List<Student> studentList = Arrays.asList(stud1,stud2,stud3,stud4,stud5,stud6,
									stud7,stud8,stud9,stud10,stud11,stud12,studNull);
		//1. AddStudent 
		for(Student student: studentList) {
			try{
				System.out.println(studentService.addStudent(student));
			}catch(DataNotPresentException e) {
				System.out.println(e);
			}
		}
		
		//2. Get All Students
		List<Student> allStudentsList = studentService.getAllStudent();
		System.out.println(allStudentsList);
		
		
		//3. Get Student By City
		try {
			System.out.println(studentService.getStudentByCity("Chennai"));
		}catch(CityNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		
		//4. Get Student By Id
		try {
		System.out.println(studentService.getStudentById(3));
		}catch(StudentNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		//5. Sort By Name
		Collections.sort(allStudentsList, Comparator.comparing(Student :: getName) );
		System.out.println(allStudentsList);
		
		//6. Sort By Name
		Collections.sort(allStudentsList, Comparator.comparing(Student :: getCity) );
		System.out.println(allStudentsList);
		
	}

}
