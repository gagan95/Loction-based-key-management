

package realtime.schedule;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.*;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


public class HierarchialSche extends javax.swing.JFrame {
 public static  File desFile1;
  public static String [] children;
    public static String filename,s,filename1;
    public static String file;
    Statement st;
    Connection con;
    ResultSet rs;
    private File f;
    private String fpath;
    private String line;
    public HierarchialSche() {
        initComponents();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/locationkey", "root", "");
            
            st = con.createStatement();
            
            ResultSet rs;
             rs=st.executeQuery("Select * from route");
       while(rs.next())
         {
             int n=rs.getInt(2);
             jComboBox2.addItem(n);
         }

        } catch (Exception e) {
            System.err.println(e);
        }
        File dir = new File("D:/FileSplit/");
      FilenameFilter filter = new FilenameFilter() {
         public boolean accept 
                 (File dir, String name) {
             String a="";
            return name.startsWith(a);           
        }
      };
       children = dir.list(filter);
      if (children == null) {
         System.out.println("Either dir does not exist or is not a directory");
      } 
      else {
         for (int i=0; i< children.length; i++) {
            filename = children[i];
            jComboBox1.addItem(filename);
         }
      } 
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(8, 124, 147));
        setBounds(new java.awt.Rectangle(300, 100, 0, 0));
        setMinimumSize(new java.awt.Dimension(724, 551));
        setPreferredSize(new java.awt.Dimension(724, 551));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), null, null), "Node & File Selection", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Vani", 1, 14), new java.awt.Color(102, 255, 255))); // NOI18N
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Select Spitted Packets");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 121, 149, 28));

        jComboBox1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 119, 148, 32));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Select Achor Node");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 58, -1, -1));

        jComboBox2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "choose", "1", "2", "3", "4", "5", "6", "7" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 51, 148, 31));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Forward");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, 119, 34));

        jTextField1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 150, 32));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("PORT NUMBER");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 110, 24));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 610, 240));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 610, 200));

        jPanel2.setBackground(new java.awt.Color(14, 116, 147));
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Anchor Node Process");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(260, 10, 230, 28);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       try {
            int port = Integer.parseInt(jTextField1.getText());
            ServerSocket ser = new ServerSocket(port);
           JOptionPane.showMessageDialog(null,"File is waiting for Receive");
            Socket soc = ser.accept();
            //JOptionPane.showMessageDialog(null,"Request Received For Send File");
            BufferedOutputStream out = new BufferedOutputStream(soc.getOutputStream());
           
               filename1=jComboBox1.getSelectedItem().toString();
                st.executeQuery("Truncate table file");
                st.executeUpdate("Insert into file values('"+filename1+"')");
               
            
            InputStream in = new BufferedInputStream(new FileInputStream("D:/FileSplit/"+filename1));
      
           jTextArea1.append("\nSelect File is:"+filename1);
           jTextArea1.append("\nReceiver Port :"+jTextField1.getText());
            jTextArea1.append("\nFile Received");
           
            byte[] buf = new byte[100];
            int length;
            while ((length = in.read(buf)) > 0) {
                out.write(buf, 0, length);
            }
            out.close();
            out.flush();
            in.close();
            soc.close();
            ser.close();
            JOptionPane.showMessageDialog(null,"File SuccessFully Send");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            JFileChooser jfc = new JFileChooser("./");// TODO add your handling code here
            jfc.showOpenDialog(this);
            f = jfc.getSelectedFile();
            fpath = f.getAbsolutePath();
            jTextField1.setText(fpath);
            
            BufferedReader br = new BufferedReader(new FileReader(f));

            while ((line = br.readLine()) != null) {
                jTextArea1.append(line + "\n");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
            System.out.println(e);
        } 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        // TODO add your handling code here:
   
        
    }//GEN-LAST:event_jComboBox1ItemStateChanged
public static String filn()
{   
    
    return(file);
}
    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HierarchialSche().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
