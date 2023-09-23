package com.gl.department.driver;
import com.gl.department.inheritance.*;

public class Driver {
	public static void main(String args[]) {
	AdminDepartment adminObj = new AdminDepartment();
	HrDepartment hrObj = new HrDepartment();
	TechDepartment techObj = new TechDepartment();
	
	System.out.println("Welcome to "+adminObj.departmentName());
	System.out.println(adminObj.getTodaysWork());
	System.out.println(adminObj.getWorkDeadline());
	System.out.println(adminObj.isTodayAHoliday());
	System.out.println();
	
	
	System.out.println("Welcome to "+hrObj.departmentName());
	System.out.println(hrObj.doActivity());
	System.out.println(hrObj.getTodaysWork());
	System.out.println(hrObj.getWorkDeadline());
	System.out.println(hrObj.isTodayAHoliday());
	System.out.println();
	
	
	
	System.out.println("Welcome to "+techObj.departmentName());
	System.out.println(techObj.getTodaysWork());
	System.out.println(techObj.getWorkDeadline());
	System.out.println(techObj.getTechStackInformation());
	System.out.println(techObj.isTodayAHoliday());
	System.out.println();
	
	}
}
