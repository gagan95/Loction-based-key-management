

package realtime.schedule;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.font.TextAttribute;
import java.text.AttributedString;
import java.sql.*;
import java.text.DecimalFormat;
import java.util.Random;
import javax.swing.JOptionPane;


public class Nodes extends javax.swing.JFrame {

    public static int n = 0, n1 = 0, r = 1000, no = 0;
    public static int X, Y;
    Statement stmt;

    public Nodes() {
        initComponents();
        JOptionPane.showMessageDialog(null, "Click Here To Deploy The Nodes");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/locationkey", "root", "");
            stmt = c.createStatement();
            stmt.executeQuery("truncate table `dist`");
        } catch (Exception e) {
            System.out.println("Connection" + e.getMessage());
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Arrow-Right-icon.png"))); // NOI18N
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 240, 70, 60));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 280, 24));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Sensor Node Deployment");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 270, 40));

        jPanel2.setBackground(new java.awt.Color(8, 124, 147));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 0, 620, 570));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_formMousePressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/locationkey", "root", "");
            Statement st = con.createStatement();
            st.execute("Delete from nodedetails");


        } catch (Exception ex) {
            System.out.println("opened" + ex.getMessage());
        }
    }//GEN-LAST:event_formWindowOpened

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        // TODO add your handling code here:
        Graphics node = jPanel2.getGraphics();
        n++;
        String name = "nid_" + n;
        AttributedString as = new AttributedString(name);
        as.addAttribute(TextAttribute.FOREGROUND, Color.black);
        as.addAttribute(TextAttribute.FONT, Font.BOLD);
        as.addAttribute(TextAttribute.FONT, Font.BOLD);
        node.setColor(Color.blue);
        PointerInfo a = MouseInfo.getPointerInfo();
        Point b = a.getLocation();
        int x = (int) b.getX();
        int y = (int) b.getY();
        draw(node, as, x, y);
    }//GEN-LAST:event_jPanel2MousePressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        try {
            DecimalFormat df = new DecimalFormat(".##");
            String[] node = new String[no];
            int[] x = new int[no];
            int[] y = new int[no];
            int d = 0;
            ResultSet rs = stmt.executeQuery("SELECT * FROM `nodedetails`");
            while (rs.next()) {
                node[d] = rs.getString(1);
                x[d] = rs.getInt(2);
                y[d] = rs.getInt(3);
                d++;
            }
            for (int i = 0; i < x.length; i++) {
                for (int k = i; k < x.length; k++) {
                    if (x[i] == x[k] && y[i] == y[k]) {
                    } else {
                        int a = x[i];
                        int b = y[i];
                        int c = x[k];
                        int d1 = y[k];
                        double dis = (double) Math.sqrt((c - a) * (c - a) + (d1 - b) * (d1 - b));
                        double bw = dis * (1024 / 60);
                        stmt.executeUpdate("INSERT INTO `dist` (`From`,`To`,`Distance`,`Bandwidth`) VALUES ('" + node[i] + "', '" + node[k] + "' , " + df.format(dis) + "," + df.format(bw) + " )");
                    }
                }
            }
            //            JOptionPane.showMessageDialog(this, "Distance Successfully Updated");

            SrcDest sd = new SrcDest();
            sd.setVisible(true);
        }
        catch (Exception e) {
            System.out.println("button1:" + e.getMessage());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Nodes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

 public static void draw(Graphics node, AttributedString as, int xx, int yy) {
        try {
            node.setColor(Color.PINK);
            node.fillOval(xx-10, yy-40, 20, 20);
            node.drawString(as.getIterator(), xx, yy);
            no++;
            {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/locationkey", "root", "");
                PreparedStatement pr = con.prepareStatement("insert into nodedetails values (?,?,?,?,?)");
                pr.setInt(1, n);
                pr.setInt(2, xx);
                pr.setInt(3, yy);
                pr.setString(4, " ");
                   pr.setString(5, " ");
                
                pr.executeUpdate();
            } 
        } 
        catch (Exception ex) {
            System.out.println("draw"+ ex.getMessage());
        }

    }

}
