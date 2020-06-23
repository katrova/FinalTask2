package com.company;

/*
 * Classname : Company
 *
 * Description : POJO class Company
 *
 * @version 1.0 2020.06.23
 *
 * @author Vasylkivska Kateryna KNTEU
 *
 * */

import java.util.Objects;

public class Company {
    // parent for this company nullable, when there is no parent for this company
    private Company parent;
    private long employeesCount;

    // 1. Constructor:

    // 1.1 generate an empty constructor using Java
    public Company() {
    }
    //___________________________________________________________________________

    // 1.2 generate the full constructor using Java with the following parameters:
    /**
     * @param parent,        which will be the parent company
     * @param employeesCount long, which will be set total number of employee
     */
    public Company(Company parent, long employeesCount) {
        this.parent = parent;
        this.employeesCount = employeesCount;
    }
    //___________________________________________________________________________

    // 2. generate getters and setters for the above parameters
    public Company getParent() {
        return parent;
    }

    public void setParent(Company parent) {
        this.parent = parent;
    }

    public long getEmployeesCount() {
        return employeesCount;
    }

    public void setEmployeesCount(long employeesCount) {
        this.employeesCount = employeesCount;
    }
    //____________________________________________________________________________

    // 3. generate String
    /**
     * Method to get formatted Company object
     *
     * @return Returns info about Company object
     */
    @Override
    public String toString() {
        return "Company{" +
                "parent=" + parent +
                ", employeesCount=" + employeesCount +
                '}';
    }
    //______________________________________________________________________________

    // 4. generate equals and hashCode
    /**
     * Method to check whether object equals by value
     *
     * @param o Object as parameter
     * @return Return boolean value as a result
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return getEmployeesCount() == company.getEmployeesCount() &&
                Objects.equals(getParent(), company.getParent());
    }

    /**
     * Method to get object hash
     *
     * @return hash of Company
     */
    @Override
    public int hashCode() {
        return Objects.hash(getParent(), getEmployeesCount());
    }
}
