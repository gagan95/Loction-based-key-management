

package realtime.schedule;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.swing.JOptionPane;



public class FileSplitting extends javax.swing.JFrame {
    public static String filename, pa;
    public static String filesec1, enc;
    public static File desFile;
    String fp = FileChooser.filec;
    public static File f2;
    public static int num;
    public static String[] ab;
    public static File splitfol;
    public static int ii = 0;
    
   
    public FileSplitting() {
        initComponents();
         try{
       pa = "D:/FileSplit/";
      enc="./enc.txt";
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
        }catch(Exception e){
        System.out.println("Dir"+e.getMessage());
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(300, 100, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(8, 124, 147));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pcket Schedule", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Vani", 1, 14), new java.awt.Color(102, 255, 255))); // NOI18N
        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Enter File Name to Split");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(48, 29, 200, 22);

        jTextField1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel1.add(jTextField1);
        jTextField1.setBounds(299, 27, 210, 29);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.setOpaque(false);
        jPanel2.setLayout(null);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(62, 46, 292, 314);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("  Splitted Packet Information");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(98, 14, 227, 26);

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Schedule Information");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(420, 200, 170, 42);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Schedule");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(420, 130, 170, 39);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(40, 83, 605, 371);

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 670, 500));

        jLabel3.setFont(new java.awt.Font("Vani", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Data Packet Scheduling Process");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 410, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try
        {
  filename =jTextField1.getText();               
  desFile = new File(enc);
            FileInputStream fin;

            String spilt ="";

            int len;

            long splitlen;

            String str;

            fin=new FileInputStream(desFile);

            len=0;

            String numfile= JOptionPane.showInputDialog(null,"Enter the number of files can be spiltted:", "File Splitter", JOptionPane.QUESTION_MESSAGE);

            num =Integer.parseInt(numfile);

            splitlen=(desFile.length())/num;

            desFile.length();

            System.out.println("File length : "+desFile.length());

            int i=0;

            fin=new FileInputStream(desFile);

            int c=fin.read();


               jTextArea1.append("Split Files"+"\n"+"==============\n\n");  
            while(c!=-1)
            {
                FileOutputStream fw=new FileOutputStream("D:/FileSplit/"+filename+(ii+1)+".txt");
  jTextArea1.append("D:/FileSplit/"+filename+(i+1)+".txt"+"\n\n");
                while(c!=-1 && len<splitlen)
                {

                    fw.write(c);

                    c=fin.read();
//                    System.out.println("The value of the c"+c);
                  len++;
                  }
// ab[ii]="D:/crosslayer/splittedfile/"+filename+(i+1)+".txt";
//  System.out.println("D:/crosslayer/splittedfile/"+filename+(i+1)+".txt"+ "a size : "+ab.length);
// System.out.println(ab[ii]);
                len=0;
                fw.close();
                i++;
                ii++;
            }
            System.out.println(splitlen);      
            String split=" File can be splitted ";
            JOptionPane.showMessageDialog(null, split);
            System.out.println(" File can be splitted");
            desFile.delete();
           
        }
       catch(Exception e)
        {
            System.out.println("Exception : "+e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Coordinator c=new Coordinator();
        c.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

  
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FileSplitting().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
