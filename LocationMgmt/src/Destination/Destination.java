/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Destination;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author EGC
 */
public class Destination extends javax.swing.JFrame {

    /**
     * Creates new form source
     */
    public String tar;
     Statement st;
    Connection con;
    ResultSet rs;
   public static String [] file=new String[10];
    int i=0;
     public static File splitfol;
    public Destination() {
      
            initComponents();
             try { 
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/locationkey", "root", "");
            
            st = con.createStatement();
            
//            rs=st.executeQuery("Select * from file");
//          if(rs.next())
//            {
//                  tar="D:/Received/"+rs.getString(1);
//                
//            }
            
            
           
           String     pa = "D:/Received/";
    
       splitfol=new File(pa);

       if(splitfol.exists()==false)
       splitfol.mkdir();
       else
       {
           File[] files=splitfol.listFiles();

           for (File file : files)
        {
        if (!file.delete())
             {
                System.out.println("Failed to delete "+file);
              }
            }



      }
           
//            System.out.println(tar);
        } catch (Exception ex) {
            Logger.getLogger(Destination.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(300, 100, 0, 0));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Base Station Node");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(150, 0, 200, 30);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), null, null), "Data Transfering Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Vani", 1, 14), new java.awt.Color(102, 255, 255))); // NOI18N
        jPanel2.setOpaque(false);
        jPanel2.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Receiver Port");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(20, 50, 84, 17);

        jTextField1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel2.add(jTextField1);
        jTextField1.setBounds(130, 50, 127, 28);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Accept");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(290, 50, 104, 30);

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Arrange");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(130, 110, 121, 30);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(30, 270, 410, 170);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(40, 40, 390, 207);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 255, 255));
        jLabel4.setText("Packet Datas");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(180, 10, 81, 17);
        jPanel1.add(jPanel4);
        jPanel4.setBounds(0, -40, 10, 10);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 50, 460, 450);

        jPanel5.setBackground(new java.awt.Color(8, 124, 147));
        jPanel5.setLayout(null);
        getContentPane().add(jPanel5);
        jPanel5.setBounds(0, 0, 480, 520);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        FileMerging fm=new FileMerging();
        fm.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here
        try {
            ResultSet rs;
            rs=st.executeQuery("Select * from file");
            if(rs.next())
            {
                tar="D:/Received/"+rs.getString(1);
                file[i]=tar;
                i++;

            }
            int port = Integer.parseInt(jTextField1.getText());
            System.out.println("File:"+tar);
            // ServerSocket ser = new ServerSocket(port);
            Socket soc = new Socket("localhost", port);
            InputStream in = new BufferedInputStream(soc.getInputStream());
            BufferedInputStream br = new BufferedInputStream(in);
            FileWriter file = new FileWriter(tar);
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(tar));
            byte[] bb = new byte[100];
            int count;
            while ((count = br.read(bb)) != -1) {
                //jTextArea1.append(count + "\n");
                bos.write(bb, 0, count);
            }
            in.close();
            bos.close();
            soc.close();

            BufferedReader br1 = new BufferedReader(new FileReader(tar));
            String str = null;
            while ((str = br1.readLine()) != null) {
                jTextArea1.append("\n"+str);
            }
        } catch (Exception e) {
            System.out.println("Error101:"+e.getMessage());
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Destination().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
