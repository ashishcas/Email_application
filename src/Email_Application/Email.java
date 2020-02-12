package Email_Application;

import javax.swing.JFrame;

public class Email {
    public static void main(String[] a) {
        EmailHomePage frame = new EmailHomePage();
        frame.setTitle("Email HomePage");
        frame.setVisible(true);
        frame.setBounds(10, 10, 370, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

    }

}