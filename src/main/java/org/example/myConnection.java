package org.example;

import java.sql.*;

public class myConnection {
    String jdbcURL = "jdbc:postgresql://localhost:5432/Try";
    String userName = "postgres";
    String password = "tarop1324";
    public Connection getConnection() {
        try {
            Connection connection = DriverManager.getConnection(jdbcURL, userName, password);
            System.out.println("There is connection");
            return connection;

        } catch (SQLException e) {
            System.out.println("Error!!");
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
    public void select(){
        try {
            Connection connection=getConnection();
            System.out.println("Connection Success!!!");
            Statement statement=connection.createStatement();
            String query="SELECT * FROM try_table";
            ResultSet resultSet=statement.executeQuery(query);
            while (resultSet.next()){
                String Name=resultSet.getString("try_coloms");
                int ID=resultSet.getInt("id");
                System.out.println("ID:  "+ID+"Name:  "+Name+"\n");
            }
            connection.close();
        } catch (SQLException e) {
            System.out.printf("Error");
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
    public void insert(String Name){

        try {
            Connection connection=getConnection();
            System.out.println("Connection Success!!!");
            Statement statement= null;
            String query="INSERT INTO try_table(try_coloms) VALUES ('"+Name+"')";
            statement = connection.createStatement();
            int resultSet=statement.executeUpdate(query);
            System.out.println("Insert Success!!!");
            connection.close();
        } catch (SQLException e) {
            System.out.println("Error");
            throw new RuntimeException(e);
        }
    }
    public void Update(String Name,int ConditionId) {
        String query = ("UPDATE try_table SET try_coloms = ?  WHERE id = ? ");
        try {
            Connection connection = getConnection();
            PreparedStatement statement= connection.prepareStatement(query);
            statement.setString(1,Name);
            statement.setInt(2,ConditionId);
            int resultSet=statement.executeUpdate();
            connection.close();

        }
        catch (SQLException e) {
            System.out.println("Error!!");
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}



