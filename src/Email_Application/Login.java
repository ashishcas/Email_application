package Email_Application;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Login {
    public static void main(String[] a) {
        LoginFrame frame = new LoginFrame();
        frame.setTitle("Login Form");
        frame.setVisible(true);
        frame.setBounds(10, 10, 370, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
//        //Creating Connection to Database postgres
//        Connection c = null;
//        Statement stmt = null;
//        try {
//            Class.forName("org.postgresql.Driver");
//            c = DriverManager
//                    .getConnection("jdbc:postgresql://localhost:5432/alumnimeet",
//                            "postgres", "lowes123");
//            c.setAutoCommit(false);
//            System.out.println("Opened database successfully");
//            stmt = c.createStatement();
////            String sql = "CREATE TABLE LOGIN " +
////                    "(ID INT PRIMARY KEY     NOT NULL," +
////                    " NAME           TEXT    NOT NULL, " +
////                    " PASSWORD            TEXT     NOT NULL)";
//            String sql = "INSERT INTO LOGIN (ID,NAME,PASSWORD) "
//                    + "VALUES (1, 'laya', 'laya123' );";
//            stmt.executeUpdate(sql);
//            stmt.close();
//            c.commit();
//            c.close();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//            System.err.println(e.getClass().getName()+": "+e.getMessage());
//            System.exit(0);
//        }
//        System.out.println("Table created successfully");
    }

    }
