package org.example.employee.empService;

import org.example.employee.EmployeeManage;
import org.example.employee.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class EmpService {

   @Autowired
   private EmployeeRepo employeeRepo;
    public List<EmployeeManage> getAllEmployees(){
        List<EmployeeManage> emps = (List<EmployeeManage>)employeeRepo.findAll();
        return emps;
    }
    public Optional<EmployeeManage> getEmployee(int id){
        return employeeRepo.findById(id);
    }

    public void addEmployee(EmployeeManage employee) {
        employeeRepo.save(employee);
    }

    public EmployeeManage employeeManage(EmployeeManage employeeManage) {
        return employeeRepo.save(employeeManage);
    }
    public void updateEmployee(EmployeeManage employee) {
        employeeRepo.save(employee);
    }


        public void deleteEmployee(int id) {
            employeeRepo.deleteById(id);
        }

}
