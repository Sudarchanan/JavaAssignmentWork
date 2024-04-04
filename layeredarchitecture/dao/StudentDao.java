package layeredarchitecture.dao;



import java.util.List;

import layeredarchitecture.exceptions.CityNotFoundException;
import layeredarchitecture.exceptions.DataNotPresentException;
import layeredarchitecture.exceptions.StudentNotFoundException;
import layeredarchitecture.model.Student;

public interface StudentDao {
	
	//1.add Students
	public String addStudent(Student student)throws DataNotPresentException;
	
	
	//3. Get Student By City
	public List<Student> getStudentByCity(String cityName)throws CityNotFoundException ;
	

	//2. Get All Students
	public List<Student> getAllStudent() ;
	
	//4. Get Student By Id
	public Student getStudentById(int studentId) throws StudentNotFoundException;
	
	/*public List<Student> displayStudentWithCity(List<Student> student,String city);*/
	


}
