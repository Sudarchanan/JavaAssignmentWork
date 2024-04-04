package EmployeePojo;

public class MainApp {

	public static void main(String[] args) {
		
		//Creating Object of Employee Class
		Employee emp = new Employee();
		
		//  Employees details
		emp.setId(1);
		emp.setName("Sudarchanan");
		emp.setCity("Chennai");
		
		//Calling addEmployee from AddEmployee to 
		// Employee Objects to Employee List
		AddEmployee.addEmployee(emp); 
		AddEmployee.addEmployee(new Employee(2,"Varun","Madurai"));
		AddEmployee.addEmployee(new Employee(3,"Sanjeevi","Cuddalore"));
		
		//Get Employee object by Employee Id
		System.out.println(AddEmployee.getEmployee(2));
		

	}

}
