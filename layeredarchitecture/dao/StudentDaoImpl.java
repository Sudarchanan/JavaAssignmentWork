package layeredarchitecture.dao;

import java.util.ArrayList;
import java.util.List;

import layeredarchitecture.exceptions.CityNotFoundException;
import layeredarchitecture.exceptions.DataNotPresentException;
import layeredarchitecture.exceptions.StudentNotFoundException;
import layeredarchitecture.model.Student;

public class StudentDaoImpl implements StudentDao  {
	
	private static List<Student> studentList = new ArrayList<>();
	
	
	//1.add Students
	@Override
	public String addStudent(Student student)throws DataNotPresentException {
		if(student != null) {
			studentList.add(student);
			return "Student Id : " +student.getId() +" added Successfully.";
		}else {
			throw new DataNotPresentException("Unable to add as \"Invalid Input\".");
			//return "Unable to add as Invalid Input";
		}
		
	}
/*
	@Override
	public List<Student> displayStudentWithCity(List<Student> studentlist, String city) {
		List<Student> studentInCity = new ArrayList<>();
		for(Student studentItem: studentlist ) {
			//System.out.println(studentItem);
			if(studentItem != null && studentItem.getCity().equalsIgnoreCase("Chennai") ) {
				//System.out.println(studentItem);
				studentInCity.add(studentItem);
			}
		}
		return studentInCity;
	}
*/
	
	
	//3. Get Student By City
	@Override
	public List<Student> getStudentByCity(String cityName) throws CityNotFoundException {
		List<Student> getStudentfromCity = new ArrayList<>();
		boolean cityFound = false;
		for(Student student:studentList) {
			if(student != null && student.getCity().equalsIgnoreCase(cityName)) {
				//System.out.println(cityName);
				getStudentfromCity.add(student);
				cityFound = true;
			}
		} 
		if(!cityFound){
            throw new CityNotFoundException("City Not Found: " + cityName);
        }
		return getStudentfromCity;
	}
	
	
	
	
	//2. Get All Students
	@Override
	public List<Student> getAllStudent() {
		
		return studentList;
	}

	//4. Get Student By Id
	@Override
	public Student getStudentById(int studentId) throws StudentNotFoundException {
		boolean studentFound = false;
		Student studFound = null;
		for(Student student: studentList) {
			if(student != null && student.getId().equals( studentId)) {
				studentFound = true;
				studFound = student;
				break;
			}
		}
		if(!studentFound) {
			throw new StudentNotFoundException ("Student Not Found");
		}else {
			return studFound;
		}
		
	}	

}
