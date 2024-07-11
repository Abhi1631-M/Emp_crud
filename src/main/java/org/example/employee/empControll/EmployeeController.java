package org.example.employee.empControll;

import org.example.employee.EmployeeManage;
import org.example.employee.empService.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/")
public class EmployeeController {

    private final EmpService empService;

    @Autowired
    public EmployeeController(EmpService empService) {
        this.empService = empService;
    }

    @GetMapping("emp-detail")
    public String EmployeePage(Model model) {
        model.addAttribute("emp", empService.getAllEmployees());
        return "empList"; // Assuming empList.jsp is the view name
    }
    @GetMapping("emp-detail/{id}")
    public Optional<EmployeeManage> getEmployee(@PathVariable int id){
        return empService.getEmployee(id);
    }

    @GetMapping("emp-detail/new")
    public String addEmployeeForm(Model model) {

        // create student object to hold student form data
        EmployeeManage employeeManage=new EmployeeManage();
        model.addAttribute("employeeManage",employeeManage);
        return "addEmp";

    }
    @PostMapping("emp-detail/add")
    public String addEmployee(@ModelAttribute("employeeManage") EmployeeManage employee) {
        empService.addEmployee(employee);
        return "redirect:/emp-detail";
    }
    @GetMapping("emp-detail/edit/{id}")
    public String editEmployeeForm(@PathVariable int id, Model model) {
        Optional<EmployeeManage> employee = empService.getEmployee(id);
        if (employee.isPresent()) {
            model.addAttribute("employeeManage", employee.get());
            return "editEmp";
        }
        return "redirect:/emp-detail";
    }
    @PostMapping("emp-detail/update")
    public String updateEmployee(@ModelAttribute("employeeManage") EmployeeManage employee) {
        empService.updateEmployee(employee);
        return "redirect:/emp-detail";
    }
    @GetMapping("emp-detail/delete/{id}")
    public String deleteEmployee(@PathVariable int id) {
        empService.deleteEmployee(id);
        return "redirect:/emp-detail";
    }
}
