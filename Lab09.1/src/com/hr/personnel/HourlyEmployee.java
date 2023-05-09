package com.hr.personnel;

import gov.irs.TaxPayer;
import java.time.LocalDate;

public class HourlyEmployee extends Employee {
    private double rate;
    private double hours;

    public HourlyEmployee() {
        super();
    }

    public HourlyEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);  // delegate to superclass ctor for name, hireDate
    }

    public HourlyEmployee(String name, LocalDate hireDate, double rate, double hours) {
        this(name, hireDate);   // delegate to neighboring ctor above me for name, hireDate
        setRate(rate);          // delegate to setters for any validation/conversion
        setHours(hours);
    }

    // business methods or "action" methods
    @Override
    public void pay() {
        double payment = getRate() * getHours();
        System.out.println(getName() + " is paid hourly " + payment);
    }

    @Override  // interface TaxPayer
    public void payTaxes() {
        double taxes = getRate() * getHours() * HOURLY_TAX_RATE;
        System.out.println(getName() + " paid taxes of " + taxes);
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return super.toString() + ", rate=" + getRate() + ", hours=" + getHours();
    }
}