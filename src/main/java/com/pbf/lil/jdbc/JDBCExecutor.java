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
            customerDAO.findAllSorted(20).forEach(System.out::println);
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
//select * from customer WHERE last_name = 'Washington';