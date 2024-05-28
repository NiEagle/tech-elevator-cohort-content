package com.techelevator;

public class Employee {
//CLASS VARIABLES
    private int employeeId;
    private String firstName;
    private String lastName;
    private String department;
    private double annualSalary;

//GETTERS
    public int getEmployeeId() {
    return employeeId;
}
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getDepartment() {
        return department;
    }
    public double getAnnualSalary() {
        return annualSalary;
    }

    //SETTERS
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
}
