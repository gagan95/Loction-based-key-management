

package Destination;

import static Destination.Destination.splitfol;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.swing.JOptionPane;
import static realtime.schedule.Encryption.str1;
import realtime.schedule.PerformanceGraph;


public class FileMerging extends javax.swing.JFrame {

   
    private static FileInputStream inFile;
    private static FileOutputStream outFile;
    public FileMerging() {
        initComponents();
        Boolean f;
        jButton4.setEnabled(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jTextArea1 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(300, 100, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Packet ReArranged");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 210, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, null));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 180, 130));

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jPanel1.add(jTextArea3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 360, 210));

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Vani", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Packet Arranging");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 160, 30));

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Vani", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Decrypted Packet");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 160, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Decrypted Data");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 120, 20));

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setFont(new java.awt.Font("Vani", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Evoluvation");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 160, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 560, 270));

        jTabbedPane1.setFont(new java.awt.Font("Vani", 1, 14)); // NOI18N

        jPanel4.setOpaque(false);
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jPanel4.add(jTextArea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 260, 130));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Received Packet List");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 170, 30));

        jTabbedPane1.addTab("Received Packets", jPanel4);

        jPanel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0), null, null));
        jPanel5.setOpaque(false);
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("Reordered File List");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, -1, 40));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jPanel5.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 250, 120));

        jTabbedPane1.addTab("Reordered Packet List", jPanel5);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 560, 180));

        jPanel2.setBackground(new java.awt.Color(8, 124, 147));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int len=Destination.file.length;
        for (int i=0;i<len;i++)
        {
           if(Destination.file[i]!=null)
           {
               jTextArea1.append("\n"+Destination.file[i]);
           }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        final File folder = new File("D:/Received/");
        for (final File fileEntry : folder.listFiles()) {
            jTextArea2.append("\n"+fileEntry.getName());
            System.out.println("\n"+fileEntry.getName());
        }
    
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        final File f1=new File("D:/FileSplit/");
        final File folder = new File("D:/Received/");
       
           try {
               int l=0,k=0; 
               for (final File fileEntry : f1.listFiles())
                {
                    l++;
                }
        for (final File fileEntry : folder.listFiles()) {
           
        k++;
        }   
    if(l==k)
    {
          for (final File fileEntry : folder.listFiles()) {
            BufferedReader br1 = null;
         String file="D:/Received/"+fileEntry.getName().toString();
                br1 = new BufferedReader(new FileReader(file));
                str1 = "";
                while ((str1 = br1.readLine()) != null) {
                   
                   jTextArea3.append("\n"+str1);
                }
             
         br1.close();
          
        } 
        
    BufferedWriter fileOut = new BufferedWriter(new FileWriter("Received.txt")); 
    String myString1 =jTextArea3.getText();
//    System.out.println(myString1);
    fileOut.write(myString1);
    fileOut.close();
    jButton4.setEnabled(true);
    }
    else
    {
        JOptionPane.showMessageDialog(this, "The packet is rearranging");
    }
           }
        catch (Exception ex) {
                Logger.getLogger(FileMerging.class.getName()).log(Level.SEVERE, null, ex);
           
                   
            }
            
        
      
                
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
           
            // TODO add your handling code here:
            Boolean f=false;
            jTextArea3.setText("");
            String Secret=JOptionPane.showInputDialog(null,"Enter Your Secret Code", "Password", JOptionPane.QUESTION_MESSAGE);
            inFile = new FileInputStream("enc.txt");
            FileWriter fw = new FileWriter("decrypt.txt");
            outFile = new FileOutputStream("decrypt.txt");
            PBEKeySpec keySpec = new PBEKeySpec(Secret.toCharArray());
            SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("PBEWithMD5AndDES");
            SecretKey passwordKey = keyFactory.generateSecret(keySpec);
            byte[] salt = new byte[8];
            inFile.read(salt);
            int iterations = 100;
            PBEParameterSpec parameterSpec = new PBEParameterSpec(salt, iterations);
            Cipher cipher = Cipher.getInstance("PBEWithMD5AndDES");
            cipher.init(Cipher.DECRYPT_MODE, passwordKey, parameterSpec);
            byte[] input = new byte[100];
            int bytesRead;
            while ((bytesRead = inFile.read(input)) != -1) {
                byte[] output = cipher.update(input, 0, bytesRead);
                if (output != null) {
                    outFile.write(output);
                    f=true;
                }
               
            }
            
            byte[] output = new byte[100];
            output = cipher.doFinal();
            if (output != null) {
                outFile.write(output);
                f=true;
            inFile.close();
            outFile.flush();
            outFile.close();
           if(f)
           {
            BufferedReader br1 = new BufferedReader(new FileReader("decrypt.txt"));
            String str = null;
              jTextArea3.setText("********Decrypted Text********");
            while ((str = br1.readLine()) != null) {
                jTextArea3.append("\n"+str);                 
            }
          JOptionPane.showMessageDialog(null, "Decrypted Successfully");
           }         
             }   
        } catch (Exception ex) {
           System.out.println("button4:"+ex.getMessage());
            JOptionPane.showMessageDialog(null, "Invalid Decryption Key");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        PerformanceGraph pg=new PerformanceGraph();
        pg.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FileMerging().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    // End of variables declaration//GEN-END:variables
}
