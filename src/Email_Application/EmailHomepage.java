package Email_Application;

import java.awt.Container;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.JTextField;

class EmailHomePage extends JFrame implements ActionListener {

    /**
     *
     */
    private JFrame frame;
    Container container=getContentPane();
    JTextField addingMailText=new JTextField();
    JTextField phoneNumber=new JTextField();
    JTextField nameOfStudent=new JTextField();
    JTextField batchOfpassout=new JTextField();
    JTextField branchOfStudent=new JTextField();
    JTextField deleteMailText=new JTextField();
    JTextField messageTxt=new JTextField();
    JButton AddMail=new JButton("Add Mail");
    JButton deleteBtn=new JButton("Delete Mail");
    JButton sendBtn = new JButton("Send Mails");
    JButton viewBtn = new JButton("view Mails");

    public void setLayoutManager()
    {
        //Setting layout manager of Container to null
        container.setLayout(null);
    }

    /**
     * Create the application.
     * @return
     */
    public EmailHomePage () {
//		initialize();
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();
        addActionEvent();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setTitle("Email invites");
        frame.setVisible(true);
        frame.setBounds(100,100,370,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
    }

    public void addComponentsToContainer()
    {
        container.add(addingMailText);
        container.add(deleteMailText);
        container.add(messageTxt);
        container.add(AddMail);
        container.add(deleteBtn);
        container.add(sendBtn);
        container.add(viewBtn);

    }
    public void setLocationAndSize()
    {
        addingMailText.setBounds(31,26,150,30);
        nameOfStudent.setBounds(31,20,150,30);
        phoneNumber.setBounds(31,26,150,30);
        batchOfpassout.setBounds(31,26,150,30);
        branchOfStudent.setBounds(31,26,150,30);
        deleteMailText.setBounds(31,92,150,30);
        messageTxt.setBounds(31,149,150,30);
        AddMail.setBounds(202,26,150,30);
        deleteBtn.setBounds(202,92,150,30);
        sendBtn.setBounds(202, 149, 150, 30);
        viewBtn.setBounds(202, 204, 150, 30);


    }

    public void addActionEvent() {
        AddMail.addActionListener(this);
        deleteBtn.addActionListener(this);
        sendBtn.addActionListener(this);
        viewBtn.addActionListener(this);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        Connection c = null;
        Statement stmt = null;
        //Function For ADD EMAIL
        if(e.getSource() == AddMail) {
            String addEmail = addingMailText.getText();

            if(!addEmail.isEmpty()) {
                try {
                    Class.forName("org.postgresql.Driver");
                    c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/alumnimeet",
                            "postgres", "lowes123");
                    c.setAutoCommit(false);
                    System.out.println("Opened database successfully");
                    stmt = c.createStatement();
                    PreparedStatement ps = c.prepareStatement("INSERT INTO EMAIL(email) VALUES(?)");
                    ps.setString(1, addEmail);
                    ps.executeUpdate();
                    stmt.close();
                    c.commit();
                    c.close();
                    System.out.println("Mailed is added Succesfully");

                } catch (Exception err) {
                    err.printStackTrace();
                    System.err.println(err.getClass().getName() + ": " + err.getMessage());
                    System.exit(0);
                }
            }
        }
        if(e.getSource() == deleteBtn) {
            String deleteEmail = deleteMailText.getText();


            try {
                Class.forName("org.postgresql.Driver");
                c = DriverManager
                        .getConnection("jdbc:postgresql://localhost:5432/alumnimeet",
                                "postgres", "lowes123");
                c.setAutoCommit(false);
                System.out.println("Opened database successfully");
                stmt = c.createStatement();
                PreparedStatement ps = c.prepareStatement("DELETE FROM  EMAIL WHERE email = ?");
                ps.setString(1, deleteEmail);
                ps.executeUpdate();
                stmt.close();
                c.commit();
                c.close();
                System.out.println("Mailed is added Succesfully");

            } catch (Exception err) {
                err.printStackTrace();
                System.err.println(err.getClass().getName() + ": " + err.getMessage());
                System.exit(0);
            }
        }
        if(e.getSource() == viewBtn) {
            String addEmail = addingMailText.getText();


            try {
                Class.forName("org.postgresql.Driver");
                c = DriverManager
                        .getConnection("jdbc:postgresql://localhost:5432/alumnimeet",
                                "postgres", "lowes123");
                c.setAutoCommit(false);
                System.out.println("Opened database successfully");
                stmt = c.createStatement();
                PreparedStatement ps = c.prepareStatement("INSERT INTO EMAIL(email) VALUES(?)");
                ps.setString(1, addEmail);
                ps.executeUpdate();
                stmt.close();
                c.commit();
                c.close();
                System.out.println("Mailed is added Succesfully");

            } catch (Exception err) {
                err.printStackTrace();
                System.err.println(err.getClass().getName() + ": " + err.getMessage());
                System.exit(0);
            }
        }
        if(e.getSource() == sendBtn) {
            String addEmail = addingMailText.getText();


            try {
                Class.forName("org.postgresql.Driver");
                c = DriverManager
                        .getConnection("jdbc:postgresql://localhost:5432/alumnimeet",
                                "postgres", "lowes123");
                c.setAutoCommit(false);
                System.out.println("Opened database successfully");
                stmt = c.createStatement();
                PreparedStatement ps = c.prepareStatement("INSERT INTO EMAIL(email) VALUES(?)");
                ps.setString(1, addEmail);
                ps.executeUpdate();
                stmt.close();
                c.commit();
                c.close();
                System.out.println("Mailed is added Succesfully");

            } catch (Exception err) {
                err.printStackTrace();
                System.err.println(err.getClass().getName() + ": " + err.getMessage());
                System.exit(0);
            }
        }

    }
}
