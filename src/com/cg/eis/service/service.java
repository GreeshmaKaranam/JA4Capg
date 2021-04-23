package com.cg.eis.service;
import com.cg.eis.bean.Employee;
interface EmployeeService {
    public void employee_detail();
	public void insurance_scheme(int x);
	public void disp(int x, String y,int s);
}
public class service implements EmployeeService{
	public void employee_detail() {
		int emp_id;
		String emp_name;
		int emp_salary;
	  }
	public void insurance_scheme(int salary) {
		if(salary<= 30000 ) 
			System.out.println("Only health Insurance");
		if(salary>30000 && salary <= 50000) 
			System.out.println("Both health and Education Insurance");
		if(salary > 50000)
			System.out.println("Health, Education and Life Insurance");
	}
	public void disp(int id, String name, int salary) {
		System.out.println("emp_id: " +id);
		System.out.println("emp_Name: "+name);
		System.out.println("emp_salary: "+salary);
	}
	
	public static void main(String[] args) { 
		service sv = new service();
	}
}
