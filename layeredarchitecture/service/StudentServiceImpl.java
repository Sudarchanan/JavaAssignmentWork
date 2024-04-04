package layeredarchitecture.service;

import layeredarchitecture.dao.StudentDaoImpl;
import layeredarchitecture.exceptions.CityNotFoundException;
import layeredarchitecture.exceptions.DataNotPresentException;
import layeredarchitecture.exceptions.StudentNotFoundException;

import java.util.List;

import layeredarchitecture.dao.StudentDao;
import layeredarchitecture.model.Student;

public class StudentServiceImpl implements StudentService  {
	
	
	//1.add Students
	@Override
	public String addStudent(Student student)throws DataNotPresentException {
		StudentDao studentDao = new StudentDaoImpl();
		String message = studentDao.addStudent(student);
		return message;
	}
	
	//3. Get Student By City

	@Override
	public List<Student> getStudentByCity(String cityName)throws CityNotFoundException {
		StudentDao studentDao = new StudentDaoImpl();
		return studentDao.getStudentByCity(cityName);
	}
	
	
	//2. Get All Students
	@Override
	public List<Student> getAllStudent() {
		StudentDao studentDao = new StudentDaoImpl();
		return studentDao.getAllStudent();
	}

	@Override
	public Student getStudentById(int studentId)throws StudentNotFoundException {
		StudentDao studentDao = new StudentDaoImpl();
		return studentDao.getStudentById(studentId);
	}

/*
	@Override
	public List<Student> displayStudentWithCity(List<Student> student, String city) {
		StudentDao studentDao = new StudentDaoImpl();
		List<Student> allStudents = studentDao.displayStudentWithCity(student, city);
		return allStudents ;
	}
*/
	

}
