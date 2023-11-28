package com.cg.employeeservice.service;

import com.cg.employeeservice.dto.EmployeeDto;
import com.cg.employeeservice.dto.APIResponseDto;

public interface EmployeeService {
    EmployeeDto saveEmployee(EmployeeDto employeeDto);

    APIResponseDto getEmployeeById(Long employeeId);
}
