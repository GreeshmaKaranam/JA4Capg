package com.cg.eis.pl;
import com.cg.eis.service.service;
import com.cg.eis.bean.Employee;
import java.util.Scanner;
public class Details {
	public static void main(String[] args) {
		Employee ep =new Employee();
		service sv = new service();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Emp_id");
		int Emp_id = sc.nextInt();
		System.out.println("Enter emp_name:");
		String Emp_Name = sc.next();
		System.out.println("Enter Emp_salary");
		int Emp_Salary = sc.nextInt();
		System.out.println("Enter emp_designation:");
		String Emp_Dsg = sc.next();
		sv.disp(Emp_id, Emp_Name, Emp_Salary);
		sv.insurance_scheme(Emp_Salary);
	}

}
