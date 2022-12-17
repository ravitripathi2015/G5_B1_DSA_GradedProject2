package com.gl.groupassignment1;

public class Driver {

	public static void main(String[] args) {
		HrDepartment hr = new HrDepartment();
		TechDepartment th = new TechDepartment();
		AdminDepartment ad = new AdminDepartment();
		superDepartment sp = new superDepartment();
		System.out.println(ad.departmentName());
		System.out.println(ad.getTodaysWork());
		System.out.println(ad.getWorkDeadline());
		System.out.println(sp.isTodayAHoliday());
		System.out.println(" ");
		System.out.println(hr.departmentName());
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(sp.isTodayAHoliday());
		System.out.println(" ");
		System.out.println(th.departmentName());
		System.out.println(th.getTodaysWork());
		System.out.println(th.getWorkDeadline());
		System.out.println(th.getTechStackInformation());
		System.out.println(sp.isTodayAHoliday());
	}

}
