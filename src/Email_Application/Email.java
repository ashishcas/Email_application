package Email_Application;

import javax.swing.JFrame;

public class Email {
    public static void main(String[] a) {
        EmailHomePage Emailframe = new EmailHomePage();
        Emailframe.setTitle("Email HomePage");
        Emailframe.setVisible(true);
        Emailframe.setBounds(100, 100, 800, 600);
        Emailframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Emailframe.setResizable(false);

        //CREATE TABLE EMAILDATA ID INT PRIMARY KEY NOT NULL,EMAIL TEXT  NOT NULL; query for creating table in potgres
    }

}