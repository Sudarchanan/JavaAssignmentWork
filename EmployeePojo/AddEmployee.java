package EmployeePojo;

import java.util.ArrayList;
import java.util.List;

public class AddEmployee {

	private static List<Employee> list = new ArrayList<Employee>();
	
	public static Void addEmployee(Employee emp) {
		list.add(emp);
		return null;
	}
	
	public static Employee getEmployee(int id) {
		for (Employee emp: list) {
			if(emp != null && emp.getId() == id) {
				return emp;
			}
		}
		return null;	
	}

}
