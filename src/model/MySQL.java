package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySQL {

    public static Connection connection;

    static {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/adyapana_institute", "root", "********");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public static ResultSet execute(String query)throws Exception{
        Statement statement=connection.createStatement();
        if(query.startsWith("SELECT")){
            return statement.executeQuery(query);
        }else{
            statement.executeUpdate(query);
            return null;
        }
    }

    public static ResultSet executeQuery(String select_from_class) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
        

}
