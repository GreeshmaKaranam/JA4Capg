package com.cg.eis.exception;
class EmployeeException extends Exception {
	EmployeeException(String str) {
		super(str);
	}
}
public class CheckSalary {
	public void SalaryCheck(int salary) throws EmployeeException {
		if(salary < 3000) {
			EmployeeException ee = new EmployeeException("Invalid Salary");
			throw(ee);
		}
		else {
			System.out.println("Good Salary");
		}
	}
	
	public static void main(String[] args) {
		CheckSalary cs = new CheckSalary();
		try {
			cs.SalaryCheck(3500);
		}
		catch(EmployeeException e) {
			System.out.println("Exception Occured: "+e);
		}
	}

}
