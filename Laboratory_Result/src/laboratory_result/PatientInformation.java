/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratory_result;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class PatientInformation extends javax.swing.JFrame {

    DefaultListModel dlm = new DefaultListModel();

    /**
     * Creates new form PatientInformation
     */
    public PatientInformation() {
        initComponents();
        listInformation();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DeleteButton = new javax.swing.JButton();
        ustPanel = new javax.swing.JPanel();
        PatientList = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        Select = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        PatienNameList = new javax.swing.JList<>();
        PatientNameLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        PatientInformations = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        DeleteButton.setText("Delete");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        ustPanel.setBackground(new java.awt.Color(204, 255, 255));

        PatientList.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        PatientList.setForeground(new java.awt.Color(0, 153, 153));
        PatientList.setText("Patient İnformations");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratuvar_sonuc_takip/icons/logo.png"))); // NOI18N

        jButton4.setBackground(new java.awt.Color(153, 255, 255));
        jButton4.setForeground(new java.awt.Color(153, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratuvar_sonuc_takip/icons/exit.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ustPanelLayout = new javax.swing.GroupLayout(ustPanel);
        ustPanel.setLayout(ustPanelLayout);
        ustPanelLayout.setHorizontalGroup(
            ustPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ustPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(ustPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ustPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(ustPanelLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(PatientList)
                        .addContainerGap(96, Short.MAX_VALUE))))
        );
        ustPanelLayout.setVerticalGroup(
            ustPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ustPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ustPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(ustPanelLayout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(PatientList, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        Select.setText("View Details");
        Select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(PatienNameList);

        PatientNameLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        PatientNameLabel.setForeground(new java.awt.Color(0, 102, 102));
        PatientNameLabel.setText("Patient ID");

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        PatientInformations.setColumns(20);
        PatientInformations.setRows(5);
        jScrollPane2.setViewportView(PatientInformations);

        jButton2.setText("Analysis Information");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ustPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(PatientNameLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Select)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DeleteButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ustPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(PatientNameLabel)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(DeleteButton)
                    .addComponent(Select)
                    .addComponent(jButton2))
                .addGap(15, 15, 15))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    Patient patient = new Patient();

    void listInformation() {
        dlm.removeAllElements();
        try {
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/LaboratoryDB", "lab", "lab");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM PATIENT");
            while (rs.next()) {
                int id = rs.getInt("ID");
                dlm.addElement("" + id);
                PatienNameList.setModel(dlm);
            }

        } catch (SQLException ex) {
            Logger.getLogger(PatientInformation.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        
            
        try {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("Laboratory_ResultPU");
            EntityManager em = emf.createEntityManager();
           
            Query q = em.createQuery("DELETE FROM Patient p WHERE p.id=:pId");
         
             int id = Integer.parseInt(PatienNameList.getSelectedValue());
            q.setParameter("pId", id);
            
            em.getTransaction().begin();
            
            q.executeUpdate();
            
            em.getTransaction().commit();
            dlm.removeElementAt(PatienNameList.getSelectedIndex());
            JOptionPane.showMessageDialog(this, "Deleted");
        } catch (NumberFormatException e) {
        }
        PatientInformations.setText("");
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void SelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectActionPerformed
       
        int id = Integer.parseInt(PatienNameList.getSelectedValue());
        
        try {
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/LaboratoryDB", "lab", "lab");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM Patient p WHERE ID="+id);
           
            while (rs.next()) {
                int patientId =rs.getInt("ID");
                String name=rs.getString("NAME");
                String surname=rs.getString("SURNAME");
                String gender=rs.getString("GENDER");
                String contact=rs.getString("CONTACT");
                PatientInformations.setText(" Id: "+patientId+'\n'+" Name: "+name+'\n'+" Surname: "+surname+'\n'+" Gender: "+gender+'\n'+" Contact: "+contact);
                
            }
            
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please selcet id!!");
        }
        catch (Exception e) {
        }
           
    }//GEN-LAST:event_SelectActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JAuthorizedOperations ao = new JAuthorizedOperations();
        ao.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       JAnalysisInformation jai=new JAnalysisInformation();
       jai.setVisible(true);
       dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(PatientInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientInformation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteButton;
    private javax.swing.JList<String> PatienNameList;
    private javax.swing.JTextArea PatientInformations;
    private javax.swing.JLabel PatientList;
    private javax.swing.JLabel PatientNameLabel;
    private javax.swing.JButton Select;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel ustPanel;
    // End of variables declaration//GEN-END:variables
}
