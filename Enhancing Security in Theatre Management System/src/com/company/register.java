package com.company;

import javax.swing.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class register extends javax.swing.JFrame {
Connection conn=null;

    public register() {
        initComponents();
        conn=JavaApplication4.ConnecrDb();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1080, 754));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24));
        jLabel1.setText("NAME");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(135, 128, 110, 28);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24));
        jLabel2.setText("EMAIL ID");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(135, 184, 140, 28);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24));
        jLabel3.setText("PASSWORD");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(135, 309, 150, 28);

        jTextField1.setFont(new java.awt.Font("Times New Roman", 1, 24));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(343, 129, 190, 34);

        jTextField2.setFont(new java.awt.Font("Times New Roman", 1, 24));
        getContentPane().add(jTextField2);
        jTextField2.setBounds(343, 185, 190, 30);

        jTextField3.setFont(new java.awt.Font("Times New Roman", 1, 24));
        getContentPane().add(jTextField3);
        jTextField3.setBounds(343, 310, 190, 30);

        jButton1.setFont(new java.awt.Font("Algerian", 1, 24));
        jButton1.setText("SIGN UP");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(200, 380, 220, 41);

        jLabel4.setFont(new java.awt.Font("Algerian", 1, 36));
        jLabel4.setText("NEW REGISTER");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(160, 30, 300, 47);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24));
        jLabel5.setText("PHONE NUMBER");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(135, 250, 200, 28);

        jTextField4.setFont(new java.awt.Font("Times New Roman", 1, 24));
        getContentPane().add(jTextField4);
        jTextField4.setBounds(340, 240, 200, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
       String a=jTextField1.getText();
       String b=jTextField2.getText();
       String c=jTextField3.getText();
    
       Statement s;
       ResultSet rs;
       try
       {
           Class.forName("com.mysql.jdbc.Driver");
          Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/java_dbmovies","root","");
          s=conn.createStatement();
          int i=0,y=0,e=0;
          s=conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
          rs=executeQuery("select * from register");
          a=jTextField1.getText();
          While (rs.next() && y==0)
                 ; {
                      String p=rs.getString("name");
                      a=jTextField1.getText();
                      System.out.println(p+""+a);
                  }
                  System.out.println(e);
                  s.executeUpdate("insert into register values('"+a+"','"+b+"','"+c+"');");
       }
       catch(Exception e)
       {
           System.out.println(e);
       }
       if("".equals(a) && "".equals(b) && "".equals(c))
       {
           JOptionPane.showMessageDialog(this,"please enter valid details");
       }
       else {
           
       
       try{
          Statement t =conn.createStatement();
          String s1=("insert into register values('"+a+"','"+b+"','"+c+"');");
          System.out.println("success");
          t.executeUpdate(s1);
       }
       catch(SQLException e)
       {
           Logger.getLogger(register.class.getName()).log(Level.SEVERE,null,e);
       }
       
      this.setVisible(false);   new login1().setVisible(true);
          

    }
}

    public static void main(String args[]) {

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(register.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(register.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(register.class.getName()).log(Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            Logger.getLogger(register.class.getName()).log(Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new register().setVisible(true);
            }
        });
    }

    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;

    private ResultSet executeQuery(String select__from_register) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private void While(boolean b) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
