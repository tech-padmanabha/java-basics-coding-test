package com.collection;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Employee {
	private Integer empNo;
	private String empName;
	private String Job;
	private Integer mgr;
	private LocalDate hireDate;
	private Double sal;
	private Integer deptNo;

	public static List<Employee> getEmployees() {
		List<Employee> empList = Arrays.asList(
				new Employee(7839, "KING", "PRESIDENT", null, LocalDate.of(1981, 11, 17), 5000.0, 10),
				new Employee(7698, "BLAKE", "MANAGER", 7839, LocalDate.of(1981, 5, 1), 2850.0, 30),
				new Employee(7566, "JONES", "MANAGER", 7839, LocalDate.of(1981, 4, 2), 2975.0, 20),
				new Employee(7782, "CLARK", "MANAGER", 7839, LocalDate.of(1981, 9, 6), 2450.0, 10),

				new Employee(7788, "SCOTT", "ANALYST", 7566, LocalDate.of(1981, 7, 13), 3000.0, 20),
				new Employee(7902, "FORD", "ANALYST", 7566, LocalDate.of(1981, 12, 3), 3000.0, 20),
				new Employee(7369, "SMITH", "CLERK", 7902, LocalDate.of(1980, 12, 17), 800.0, 20),
				new Employee(7499, "ALLEN", "SALESMAN", 7698, LocalDate.of(1981, 2, 20), 1600.0, 30));
		return empList;
	}

	public Employee() {
		super();
	}

	public Employee(Integer empNo, String empName, String job, Integer mgr, LocalDate hireDate, Double sal,
			Integer deptNo) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		Job = job;
		this.mgr = mgr;
		this.hireDate = hireDate;
		this.sal = sal;
		this.deptNo = deptNo;
	}

	public Integer getEmpNo() {
		return empNo;
	}

	public void setEmpNo(Integer empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getJob() {
		return Job;
	}

	public void setJob(String job) {
		Job = job;
	}

	public Integer getMgr() {
		return mgr;
	}

	public void setMgr(Integer mgr) {
		this.mgr = mgr;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}

	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}

	public Double getSal() {
		return sal;
	}

	public void setSal(Double sal) {
		this.sal = sal;
	}

	public Integer getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(Integer deptNo) {
		this.deptNo = deptNo;
	}

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + ", Job=" + Job + ", mgr=" + mgr + ", hireDate="
				+ hireDate + ", sal=" + sal + ", deptNo=" + deptNo + "]";
	}
}
