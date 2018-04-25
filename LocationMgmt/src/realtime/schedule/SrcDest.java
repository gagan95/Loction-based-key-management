

package realtime.schedule;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.font.TextAttribute;
import java.sql.*;
import java.text.AttributedString;
import java.util.Arrays;
import javax.swing.JOptionPane;


public class SrcDest extends javax.swing.JFrame {
public static int nd;
public static int r=1000;
    public static int f = 0, f1 = 0;
    public static int[] xy;
    public static int source=0,cn=0;
      public static int target=0;
      public static int[] nnid;
      public static double dis;
      public static String str1,str2;
Statement st;
   
    public SrcDest() {
        initComponents();
        jLabel1.setVisible(false);
        jLabel3.setVisible(false);       
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(300, 100, 0, 0));

        jPanel1.setBackground(new java.awt.Color(8, 122, 145));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 102, 51));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel4.setOpaque(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 638, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 568, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 570));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Select Sender And Receiver Node");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 204, 255));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(51, 51, 51)));
        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Vani", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Sender");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 160, 40));

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Vani", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Receiver");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 359, 170, 40));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 255, 255));
        jLabel3.setText("Receiver Node");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 190, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 255, 255));
        jLabel1.setText("Source Node");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 190, 20));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Arrow-Left-icon.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 60, 50));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/next.png"))); // NOI18N
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 470, 100, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 250, 570));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            f=0;f1=0;
            Graphics node = jPanel4.getGraphics();
            node.setColor(Color.white);
            node.fillOval(640, 570, r / 2, r / 2);
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/locationkey", "root", "");
             st=con.createStatement();
             st.executeQuery("Truncate table forward");
            int n = 0,n1=0, x = 0, y = 0, i = 0;
          
            PreparedStatement pst = con.prepareStatement("select * from nodedetails ");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                n = rs.getInt("nodeid");
                i++;
            }
            nnid=new int[i];
            cn=i;
            System.out.println("no.of nodes"+cn);
            int[] xx = new int[i];
            int[] yy = new int[i];
            int j = 0;
            PreparedStatement pst1 = con.prepareStatement("select * from nodedetails ");
            ResultSet rs1 = pst1.executeQuery();
            while (rs1.next()) {
                nnid[j] = rs1.getInt("nodeid");
                xx[j] = rs1.getInt("x");
                yy[j] = rs1.getInt("y");
                j++;
            }
            xy=new int[i];
            int t = 0, t1 = 0;
            for (int h = 0; h < i; h++) {
                xy[h] = xx[h];
            }
            Arrays.sort(xy);
            for (int k = 0; k < i; k++) {
                String ss=" ",sss=" ";
                int a = xy[k];
                if (a % 2 == 0) {
                    t = 3;
                }
                if (a % 2 == 1) {
                    t = 2;
                }
                t1 = k;
                int x1 = 0, y1 = 0,xz=0;
                PreparedStatement pst2 = con.prepareStatement("select * from nodedetails where x=?");
                pst2.setInt(1, xy[t1]);
                xz=xy[t1];
                ResultSet rs2 = pst2.executeQuery();
                while (rs2.next()) {
                    n = rs2.getInt("nodeid");
                    x1 = rs2.getInt("x");
                    y1 = rs2.getInt("y");
                }
              
                for (int g = 0; g < t; g++) {
                    if(t1!=i-1){
                    int x2 = 0, y2 = 0;
                    PreparedStatement pst21 = con.prepareStatement("select * from nodedetails where x=?");
                    pst21.setInt(1, xy[t1 + 1]);
                    ResultSet rs21 = pst21.executeQuery();
                    while (rs21.next()) {
                        n1 = rs21.getInt("nodeid");
                        x2 = rs21.getInt("x");
                        y2 = rs21.getInt("y");
                    }
                    sss=n1+" ";
                    ss+=sss;
                    node.setColor(Color.black);
                    node.drawLine(x1, y1, x2, y2);
                    
                   dis = (double) Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
                    System.out.println("path from"  +x1+"  "+y1+" "+x2+" "+y2 +"    "+dis);
                st.executeUpdate("Insert into forward (`src`,`dst`,`dist`) values ('"+n+"','"+n1+"',"+dis+")");
                    t1++;
                    }
                }
                String sql = "UPDATE nodedetails SET temp = ?,visit=? WHERE x = ?";
                PreparedStatement prest = con.prepareStatement(sql);
                prest.setString(1,ss);
                prest.setDouble(2,dis);
                prest.setInt(3,xz);
                prest.executeUpdate();
            }
            PreparedStatement ps = con.prepareStatement("select * from nodedetails ");
            ResultSet rs123 = ps.executeQuery();
            while (rs123.next()) {
                n = rs123.getInt("nodeid");
                x = rs123.getInt("x");
                y = rs123.getInt("y");
            
                String name = "nid_" + n;
                AttributedString as = new AttributedString(name);
                as.addAttribute(TextAttribute.FOREGROUND, Color.black);
                as.addAttribute(TextAttribute.FONT, Font.BOLD);
                as.addAttribute(TextAttribute.FONT, Font.BOLD);
                node.setColor(Color.MAGENTA);
                node.fillOval(x, y, 20, 20);
                node.setColor(Color.ORANGE);
                node.drawString(as.getIterator(), x, y);
                }
           
        }catch (Exception ex) {
          System.out.println("Button1" +ex.getMessage());
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
            if (f == 0) {
                f = 1;
                 str1 = JOptionPane.showInputDialog(null, "Enter Source Node : ",
                        "SENDER", 1);
                int c = 0;
                c = str1.indexOf("_");
                str1 = str1.substring(c + 1);
              
                int n = Integer.parseInt(str1);
                source=n;
                Graphics node = jPanel4.getGraphics();
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/locationkey", "root", "");
        
                int x = 0, y = 0;
                PreparedStatement pst = con.prepareStatement("select * from nodedetails where nodeid=?");
                pst.setInt(1, n);
                ResultSet rs = pst.executeQuery();
                while (rs.next()) {
                    n = rs.getInt("nodeid");
                    x = rs.getInt("x");
                    y = rs.getInt("y");
                 
                    node.setColor(Color.blue);
                    node.fillOval(x, y, 20, 20);
                }
                jLabel1.setVisible(true);
                jLabel1.setText("Selected Source nid_" + str1);
                jLabel3.setVisible(false);
                
            } else {
              JOptionPane.showMessageDialog(null, "Already Source will be selected");
            }

        } catch (Exception ex) {
             System.out.println("Button2"+ex.getMessage());
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
//        try{
//     Class.forName("com.mysql.jdbc.Driver");
//                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/locationkey", "root", "");              
//    Statement stmt = con.createStatement();  
//    for(int i=0;i<cn;i++){
//      String sql = "DROP TABLE route"+nnid[i]+" ";
//      String sql1="DROP TABLE alterroute"+nnid[i]+" ";
//       String sql2="DROP TABLE isolate"+nnid[i]+" ";
//      stmt.executeUpdate(sql);
//      stmt.executeUpdate(sql1);
//      stmt.executeUpdate(sql2);
//    }
//}catch(Exception ex){
//    System.out.println("Button4"+ex.getMessage());
//}
        Distance d=new Distance();
      d.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

                                         

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try {
            if (f1 == 0) {

                str2 = JOptionPane.showInputDialog(null, "Enter Destination Node Node : ",
                    "RECEVER", 1);
                int c = 0;
                c = str2.indexOf("_");
                str2 = str2.substring(c + 1);
                int n = Integer.parseInt(str2);
                if(source!=n){
                    target=n;
                    f1 = 1;
                    Graphics node = jPanel4.getGraphics();
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/locationkey", "root", "");

                    int x = 0, y = 0;
                    PreparedStatement pst = con.prepareStatement("select * from nodedetails where nodeid=?");
                    pst.setInt(1, n);
                    ResultSet rs = pst.executeQuery();
                    while (rs.next()) {
                        n = rs.getInt("nodeid");
                        x = rs.getInt("x");
                        y = rs.getInt("y");
                        node.setColor(Color.blue);
                        node.fillOval(x, y, 20, 20);
                    }
                    jLabel3.setVisible(true);
                    jLabel3.setText("Selected Destination  nid_" + str2);

                }
                else
                JOptionPane.showMessageDialog(null, "Source and destination are same");
            } else {
                JOptionPane.showMessageDialog(null, "Already Destination will be selected");
            }

        } catch (Exception ex) {
            System.out.println("Button3"+ex.getMessage());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

                                            

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SrcDest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
