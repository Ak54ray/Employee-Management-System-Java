package com.ems;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class EmployeeDAO {

    public void addEmployee(Employee emp) {

        try {

            Connection con = DBConnection.getConnection();

            String query = "INSERT INTO employee VALUES(?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, emp.getEmpId());
            ps.setString(2, emp.getEmpName());
            ps.setString(3, emp.getDepartment());
            ps.setDouble(4, emp.getSalary());

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Employee Added Successfully!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}