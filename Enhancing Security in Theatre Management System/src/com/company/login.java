package com.company;

import java.sql.*;
import javax.swing.JOptionPane;
import java.util.Random;

public class login extends javax.swing.JFrame {

    private String captchaText;
    public login() {
        initComponents();
        // Add these lines in the constructor (login()) after initComponents()
        captchaText = generateRandomCaptcha(); // This method generates the random CAPTCHA text
        captchaLabel.setText("CAPTCHA: " + captchaText);


    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        // Add these lines in the initComponents() method
        captchaLabel = new javax.swing.JLabel();
        captchaTextField = new javax.swing.JTextField();

        captchaLabel.setFont(new java.awt.Font("Times New Roman", 1, 24));
        captchaLabel.setText("CAPTCHA");
        captchaLabel.setVisible(true);
        captchaTextField.setFont(new java.awt.Font("Times New Roman", 1, 24));
        captchaTextField.setVisible(true);


        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("USERNAME");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("PASSWORD");

        captchaLabel.setFont(new java.awt.Font("Times New Roman", 1, 24));
        captchaLabel.setText("CAPTCHA");

        jTextField1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N

        submit.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        submit.setText("LOGIN");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton2.setText("SIGN UP");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPasswordField1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(jPasswordField1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(submit)
                        .addGap(85, 85, 85)
                        .addComponent(jButton2)
                        .addContainerGap(112, Short.MAX_VALUE))))

        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submit)
                    .addComponent(jButton2))
                .addGap(45, 45, 45))
        );

        jLabel1.setBackground(new java.awt.Color(0, 51, 255));
        jLabel1.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Online Movie Ticket Booking");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(175, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {
        // new movie().setVisible(true); 
       //  String s1;
                 //s1=evt.getActionCommand();
         workWithDatabase();
        String enteredCaptcha = captchaTextField.getText();
        if (enteredCaptcha.equals(captchaText)) {
            workWithDatabase(); // Proceed with login if CAPTCHA is correct
        } else {
            JOptionPane.showMessageDialog(this, "Invalid CAPTCHA, please try again.");
            captchaTextField.setText(""); // Clear the CAPTCHA text field
            captchaText = generateRandomCaptcha(); // Generate a new CAPTCHA
            captchaLabel.setText("CAPTCHA: " + captchaText);
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
       String a=jTextField1.getText();
       String b=jPasswordField1.getText();
       rs=s.executeQuery("select name,password from register");
       while(rs.next())
       {       //flag=1;
               String ename=rs.getString("name");
               String pass=rs.getString("password");
        if(a.equals(ename) && b.equals(pass))
        {  
           
        JOptionPane.showMessageDialog(this,"Logined successfully");
       this.setVisible(false);   new movie().setVisible(true);
         //continue;
         break;
         }

       
       
        else if("".equals(a) && "".equals(b))
       {
           JOptionPane.showMessageDialog(this,"please enter valid details");
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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
this.setVisible(false);    new register().setVisible(true);
    }


    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });

    }



    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton submit;
    private javax.swing.JTextField captchaTextField;
    private javax.swing.JLabel captchaLabel;

    private String generateRandomCaptcha() {
        String data = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random();
        StringBuilder captcha = new StringBuilder();

        for (int i = 0; i < 6; i++) { // You can adjust the CAPTCHA length
            int index = random.nextInt(data.length());
            captcha.append(data.charAt(index));
        }

        return captcha.toString();
    }
}
