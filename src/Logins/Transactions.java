/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logins;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author John Rey
 */
public class Transactions extends javax.swing.JFrame {
    

    /**
     * Creates new form Transactions
     */
    public Transactions() {
        
        initComponents();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        back_btn = new javax.swing.JButton();
        payment_btn = new javax.swing.JButton();
        pass_appoint = new javax.swing.JPasswordField();
        show = new javax.swing.JButton();
        template = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Test", "Amount", "Date", "Payment", "Status"
            }
        ));
        jScrollPane2.setViewportView(table);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 710, 250));

        back_btn.setToolTipText("");
        back_btn.setContentAreaFilled(false);
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });
        getContentPane().add(back_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 460, 50, 30));

        payment_btn.setContentAreaFilled(false);
        payment_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payment_btnActionPerformed(evt);
            }
        });
        getContentPane().add(payment_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 460, 140, 30));

        pass_appoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pass_appointActionPerformed(evt);
            }
        });
        getContentPane().add(pass_appoint, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 130, -1));

        show.setContentAreaFilled(false);
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });
        getContentPane().add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, 160, 20));

        template.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logins/Transactions.jpg"))); // NOI18N
        getContentPane().add(template, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_formMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formWindowOpened

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed
        // TODO add your handling code here:
        Main menu = new Main();
                menu.setVisible(true);
                this.setVisible(true);
                this.setVisible(false);
    }//GEN-LAST:event_back_btnActionPerformed

    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Medic", "root","");
            
            
            
            
            
            String ps2 = pass_appoint.getText();
            String query ="SELECT * from appoint WHERE password='"+ps2+"'";
            Statement st= con.createStatement();
            ResultSet rs=st.executeQuery(query);
            
           
            
            while(rs.next()){
            String n =rs.getString("name");
            String t =rs.getString("typetest");
            String a =String.valueOf(rs.getInt("amount"));  
            String d =rs.getString("date");
            String p =rs.getString("payment");
            String s =rs.getString("status");
            
            
            
            
            String tbData[]={n,t,a,d,p,s};
            DefaultTableModel tblModel =(DefaultTableModel)table.getModel();
            
           
            tblModel.addRow(tbData);
            
            
            
            
            
            }
            
            con.close();
            }
        catch(Exception e){
        JOptionPane.showMessageDialog(null,"ERROR!");
        }
    }//GEN-LAST:event_showActionPerformed

    private void payment_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payment_btnActionPerformed
        // TODO add your handling code here:
        Payment pay = new Payment();
                pay.setVisible(true);
                this.setVisible(true);
                this.setVisible(false);
    }//GEN-LAST:event_payment_btnActionPerformed

    private void pass_appointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pass_appointActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pass_appointActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(Transactions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Transactions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Transactions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Transactions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Transactions().setVisible(true);
            }
            
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_btn;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPasswordField pass_appoint;
    private javax.swing.JButton payment_btn;
    private javax.swing.JButton show;
    private javax.swing.JTable table;
    private javax.swing.JLabel template;
    // End of variables declaration//GEN-END:variables
}
