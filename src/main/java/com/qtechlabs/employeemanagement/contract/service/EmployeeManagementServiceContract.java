package com.qtechlabs.employeemanagement.contract.service;

import com.qtechlabs.employeemanagement.contract.controller.EmployeeDTO;

public interface EmployeeManagementServiceContract {

	public boolean createEmployee(EmployeeDTO employeeDTO);

	public EmployeeDTO getEmployee(Long employeeId);

	public EmployeeDTO updateEmployee(Long employeeId, EmployeeDTO employeeDTO);

	public boolean deleteEmployee(Long employeeId);

}
