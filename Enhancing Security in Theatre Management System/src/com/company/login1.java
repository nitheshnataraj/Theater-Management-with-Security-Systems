package com.company;
import java.sql.*;
import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;


public class login1 extends JFrame {
    private int maxLoginAttempts = 3;
    private int loginAttempts = 0;
    private String correctCaptcha;

    private JTextField usernameField;
    private JPasswordField passwordField;
    private JTextField captchaField;
    private JLabel captchaLabel;
    private JButton loginButton;
    private JButton registerButton;
    private JLabel Title;

    public login1() {
        initializeUI();
        generateAndSetCaptcha();
    }

    private void initializeUI() {
        setTitle("Login with CAPTCHA");
        setSize(1000, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel Title = new JLabel("ONLINE MOVIE TICKET BOOKING SYSTEM");
        Title.setBounds(375, 80, 1000, 25);
        add(Title);

        JLabel usernameLabel = new JLabel("Username:");
        usernameLabel.setBounds(350, 180, 100, 25);
        add(usernameLabel);

        usernameField = new JTextField();
        usernameField.setBounds(420, 180, 200, 25);
        add(usernameField);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(350, 250, 100, 25);
        add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(420, 250, 200, 25);
        add(passwordField);

        captchaLabel = new JLabel();
        captchaLabel.setBounds(420, 320, 150, 25);
        add(captchaLabel);

        captchaField = new JTextField();
        captchaField.setBounds(440, 350, 80, 25);
        add(captchaField);

        loginButton = new JButton("Login");
        loginButton.setBounds(340, 440, 100, 30);
        add(loginButton);

        registerButton = new JButton("Sign Up");
        registerButton.setBounds(550, 440, 100, 30);
        add(registerButton);

        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new register().setVisible(true);
            }
        });

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //workWithDatabase();
                String enteredCaptcha = captchaField.getText();
                if (enteredCaptcha.equals(correctCaptcha))  {
                    workWithDatabase();
                    String username = usernameField.getText();
                    String password = new String(passwordField.getPassword());
                    //if (validateLogin(username, password)) {
                        //JOptionPane.showMessageDialog(null, "Login successful!");dispose();
                   // }

                        loginAttempts++;
                        if (loginAttempts >= maxLoginAttempts) {
                            JOptionPane.showMessageDialog(null, "Exceeded maximum login attempts.");
                            System.exit(0);
                        }
                        //else{
                           // JOptionPane.showMessageDialog(null, "Invalid username or password.");
                          //  generateAndSetCaptcha();
                        //}

                } else {
                    JOptionPane.showMessageDialog(null, "Invalid CAPTCHA.");
                    generateAndSetCaptcha();
                }
            }

            public void workWithDatabase()
            {
                Connection c=null;
                Statement  s=null;
                ResultSet rs=null;
                int flag=0;

                //if(s1.equals("submit"))
                {
                    try
                    {
                        Class.forName("com.mysql.jdbc.Driver");
                        c=DriverManager.getConnection("jdbc:mysql://localhost/java_dbmovies","root","");
                        s=c.createStatement();
                        String a=usernameField.getText();
                        String b=passwordField.getText();
                        rs=s.executeQuery("select name,password from register");
                        while(rs.next())
                        {       //flag=1;
                            String ename=rs.getString("name");
                            String pass=rs.getString("password");
                            if(a.equals(ename) && b.equals(pass))
                            {

                                JOptionPane.showMessageDialog(null,"Logined successfully");
                                //this.setVisible(false);
                                new movie().setVisible(true);
                                //continue;
                                break;
                            }



                            else if("".equals(a) && "".equals(b))
                            {
                                JOptionPane.showMessageDialog(null,"please enter valid details");
                                break;

                            }
                        }

                    }

                    catch(Exception e)
                    {
                        System.out.println(e);
                    }
                }




            }
        });

    }

    private void generateAndSetCaptcha() {
        String data = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random();
        StringBuilder captcha = new StringBuilder();
        for (int i = 0; i < 6; i++) { // Adjust the CAPTCHA length as needed
            int index = random.nextInt(data.length());
            captcha.append(data.charAt(index));
        }
        correctCaptcha = captcha.toString();
        captchaLabel.setText("CAPTCHA: " + correctCaptcha);
    }

    private boolean validateLogin(String username, String password) {
        // Replace this with your actual login validation logic
        return username.equals("user") && password.equals("password");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new login1().setVisible(true);
            }
        });
    }
}
