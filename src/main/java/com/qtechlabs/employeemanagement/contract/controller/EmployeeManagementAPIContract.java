package com.qtechlabs.employeemanagement.contract.controller;

public interface EmployeeManagementAPIContract {

	// POST/CREATE/INSERT
	// @PostMapping("/api/v1/employee/")
	public String createEmployee(EmployeeDTO employeeDTO);

	// GET/RETRIEVE/SELECT
	// @GetMapping("/api/v1/employee/{employeeId}")
	public EmployeeDTO getEmployee(Long employeeId);

	// PUT/UPDATE/UPDATE
	// @PutMapping("/api/v1/employee/{employeeId}")
	public EmployeeDTO updateEmployee(Long employeeId, EmployeeDTO employeeDTO);

	// DELETE/DELETE/DELETE
	// @DeleteMapping("/api/v1/employee/{employeeId}")
	public String deleteEmployee(Long employeeId);

}
