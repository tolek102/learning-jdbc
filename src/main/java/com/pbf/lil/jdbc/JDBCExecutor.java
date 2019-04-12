package com.pbf.lil.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

public class JDBCExecutor {

    public static void main(String[] args) {
        DatabaseConnectionManager dcm = new DatabaseConnectionManager("localhost", "hplussport",
                "postgres", "password");

        try {
            Connection connection = dcm.getConnection();
            CustomerDAO customerDAO = new CustomerDAO(connection);
            Customer customer = customerDAO.findById(10000);
            System.out.println("Before update: " + customer.getFirstName() + " " + customer.getLastName() + " " + customer.getEmail());
            customer.setEmail("gorge.washington@wh.gov");
            customer = customerDAO.update(customer);
            System.out.println("After update: " + customer.getFirstName() + " " + customer.getLastName() + " " + customer.getEmail());

        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
//select * from customer WHERE last_name = 'Washington';