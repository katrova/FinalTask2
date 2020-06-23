package com.company;

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
    //___________________________________________________________________
}
