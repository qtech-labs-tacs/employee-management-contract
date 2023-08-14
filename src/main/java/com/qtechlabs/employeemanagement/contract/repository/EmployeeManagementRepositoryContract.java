package com.qtechlabs.employeemanagement.contract.repository;


public interface EmployeeManagementRepositoryContract {

	public boolean insertIntoEmployeeTable(Employee employee);

	public Employee selectFromEmployeeTable(Long employeeId);

	public Employee updateIntoEmployeeTable(Employee employee);

	public boolean deleteFromEmployeeTable(Long employeeId);
	
	
}
