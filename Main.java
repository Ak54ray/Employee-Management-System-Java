package com.ems;

public class Main {

    public static void main(String[] args) {

        Employee emp = new Employee(
                201,
                "Angesh",
                "IT",
                65000);

        EmployeeDAO dao = new EmployeeDAO();

        dao.addEmployee(emp);

    }

}