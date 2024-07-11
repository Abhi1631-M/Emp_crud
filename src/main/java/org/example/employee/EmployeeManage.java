package org.example.employee;

import jakarta.persistence.*;
import jakarta.persistence.Id;

import java.util.Date;
@Entity
@Table(name = "employee")
public class EmployeeManage {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String firstName;

    private String lastName;
    private String jobRole;
    private long salary;

    public EmployeeManage() {
    }
    public EmployeeManage(int id,String firstName,String lastName,String jobRole, long salary,Date joinOn)
    {
        super();
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.jobRole=jobRole;
        this.salary=salary;

    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getJobRole() {
        return jobRole;
    }

    public long getSalary() {
        return salary;
    }

    public void setId(int id) {
        this.id = id;
    }





    public void setSalary(long salary) {
        this.salary = salary;
    }

    public void setJobRole(String jobRole) {
        this.jobRole = jobRole;
    }

    @Override
    public String toString() {
        return "EmployeeManage{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", jobRole='" + jobRole + '\'' +
                ", salary=" + salary +
                '}';
    }
}
