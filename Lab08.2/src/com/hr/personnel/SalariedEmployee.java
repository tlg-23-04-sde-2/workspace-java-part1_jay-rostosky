package com.hr.personnel;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    // instance variables or fields
    private double salary;

    // constructors
    public SalariedEmployee() {
        super();
    }

    public SalariedEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);  // delegate to superclass ctor for name, hireDate
        // enrollIn401k();
    }

    public SalariedEmployee(String name, LocalDate hireDate, double salary) {
        this(name, hireDate);   // delegate to neighboring ctor above me, for name, hireDate
        setSalary(salary);      // delegate to setter for any validation/conversion
    }

    // business methods or "action" methods
    @Override
    public void pay() {
        System.out.println(getName() + " is paid salary " + getSalary());
    }

    public void takeVacation() {
        System.out.println(getName() + " is on vacation");
    }

    // accessor methods
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + ", salary=" + getSalary();
    }
}