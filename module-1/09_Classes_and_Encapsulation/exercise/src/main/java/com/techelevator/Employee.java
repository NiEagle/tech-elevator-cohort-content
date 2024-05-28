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
    //CONSTRUCTOR
    public Employee(int employeeId, String firstName, String lastName, double annualSalary){
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.annualSalary = annualSalary;
    }

    //methodsCreate a method called raiseSalary() that accepts a double called percent and returns void. The method increases the current annual salary by the percentage provided. For example, 5.5 represents 5.5%.

    public void raiseSalary(double percent){
        this.annualSalary= this.annualSalary + (this.annualSalary * (percent / 100));

    }
    public String getFullName(){
        return lastName + ", " + firstName;
    }
}
