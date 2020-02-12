package Email_Application;

import java.awt.Container;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
    JTextField deleteMailText=new JTextField();
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
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setTitle("Login Form");
        frame.setVisible(true);
        frame.setBounds(100,100,370,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
    }

    public void addComponentsToContainer()
    {
        container.add(addingMailText);
        container.add(deleteMailText);
        container.add(AddMail);
        container.add(deleteBtn);
        container.add(sendBtn);
        container.add(viewBtn);

    }
    public void setLocationAndSize()
    {
        addingMailText.setBounds(31,26,150,30);
        deleteMailText.setBounds(31,92,150,30);
        AddMail.setBounds(202,26,150,30);
        deleteBtn.setBounds(202,92,150,30);
        sendBtn.setBounds(113, 205, 150, 30);
        viewBtn.setBounds(113, 152, 150, 30);


    }


    @Override
    public void actionPerformed(ActionEvent arg0) {
        // TODO Auto-generated method stub

    }
}
