package org.example.employee.repo;

import org.example.employee.EmployeeManage;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepo extends CrudRepository<EmployeeManage,Integer> {

}
