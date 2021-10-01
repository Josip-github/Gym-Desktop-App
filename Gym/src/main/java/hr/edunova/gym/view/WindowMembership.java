/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.gym.view;

import hr.edunova.gym.controller.CourseController;
import hr.edunova.gym.controller.MemberController;
import hr.edunova.gym.controller.MembershipController;
import hr.edunova.gym.model.Course;
import hr.edunova.gym.model.Member;
import hr.edunova.gym.model.Membership;
import hr.edunova.gym.util.Application;
import hr.edunova.gym.util.GymException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Vlasnik
 */
public class WindowMembership extends javax.swing.JFrame {

    private CourseController courseController;
    private MemberController memberController;
    private MembershipController membershipController;
    /**
     * Creates new form WindowMembership
     */
    public WindowMembership() {
        initComponents();
        courseController = new CourseController();
        memberController = new MemberController();
        membershipController = new MembershipController();
        settings();
        readMemberships();
    }
    
    private void readMemberships(){
        DefaultListModel<Membership> m = new DefaultListModel<>();
        membershipController.read().forEach(ms -> {m.addElement(ms);});
        lstMemberships.setModel(m);
        
    }
    
    private void settings(){
        setTitle(Application.getTitle("Membership"));
        DefaultComboBoxModel<Course> cbm = new DefaultComboBoxModel<>();
        Course courseNull = new Course();
        courseNull.setId(Long.valueOf(0));
        courseNull.setName("Not chosen");
        cbm.addElement(courseNull);
        new CourseController().read().forEach(c -> cbm.addElement(c));
        cbCourses.setModel(cbm);
        
    }
    
    /*private void readCourses(){
        DefaultListModel<Course> m = new DefaultListModel<>();
        courseController.read().forEach(c -> {m.addElement(c);});
        lstMembers.setModel(m);
        
    }*/

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstMembers = new javax.swing.JList<>();
        lblCourses = new javax.swing.JLabel();
        cbCourses = new javax.swing.JComboBox<>();
        dpDateOfBegin = new com.github.lgooddatepicker.components.DatePicker();
        lblDateOfBegin = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        chBoxPayment = new javax.swing.JCheckBox();
        lblDateOfEnd = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        lblCondition = new javax.swing.JLabel();
        lblEndDate = new javax.swing.JLabel();
        dpEndDate = new com.github.lgooddatepicker.components.DatePicker();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstMemberships = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lstMembers.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstMembersValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstMembers);

        lblCourses.setText("Courses:");

        lblDateOfBegin.setText("Date of begin:");

        lblPrice.setText("Price:");

        txtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceActionPerformed(evt);
            }
        });

        chBoxPayment.setText("Payment:");

        lblDateOfEnd.setText("Date of end:");

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        lblCondition.setText("Condition(name or surname):");

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        lstMemberships.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstMembershipsValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(lstMemberships);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCondition, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblCourses, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbCourses, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dpDateOfBegin, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(chBoxPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dpEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(172, 172, 172)
                        .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDateOfBegin, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(158, 158, 158)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDateOfEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCourses, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCondition))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbCourses, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblDateOfBegin, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnSearch))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dpDateOfBegin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblEndDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblDateOfEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(dpEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(chBoxPayment))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceActionPerformed

    private void lstMembersValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstMembersValueChanged
        
        if(lstMembers.getValueIsAdjusting() || lstMembers.getSelectedValue()==null){
            return;
        }
        
        memberController.setEntity(lstMembers.getSelectedValue());
        //courseController.setEntity(lstMembers.getSelectedValue());
        var mc = memberController.getEntity();
        
        memberController.setEntity((Member)cbCourses.getSelectedItem());
        var m = membershipController.getEntity();
        
        
        cbCourses.setSelectedItem(m.getMember());
        
        
        
    }//GEN-LAST:event_lstMembersValueChanged

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        readMembers();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        
        membershipController.setEntity(new Membership());
        setValuesIntoEntity();
        try {
            membershipController.create();
            readMemberships();
        } catch (GymException ex) {
            JOptionPane.showMessageDialog(getRootPane(), ex.getMessage());
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        
        if(membershipController.getEntity()==null){
            JOptionPane.showMessageDialog(getRootPane(), "First choose a member.");
            return;
        }
        setValuesIntoEntity();
        try {
            membershipController.update();
            readMemberships();
        } catch (GymException ex) {
            JOptionPane.showMessageDialog(getRootPane(), ex.getMessage());
        }
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        
        if(membershipController.getEntity()==null){
            JOptionPane.showMessageDialog(getRootPane(), "First choose a member.");
            return;
        }
        setValuesIntoEntity();
        try {
            membershipController.delete();
            readMemberships();
        } catch (GymException ex) {
            JOptionPane.showMessageDialog(getRootPane(), ex.getMessage());
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void lstMembershipsValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstMembershipsValueChanged
        if(evt.getValueIsAdjusting() || lstMemberships.getSelectedValue() == null){
            return;
        }
        
        membershipController.setEntity(lstMemberships.getSelectedValue());
        var ms = membershipController.getEntity();
        
        //lstMembers.setSelectedValue(ms.getMember(), false);
        cbCourses.setSelectedItem(ms.getCourse());
        dpDateOfBegin.setDate(ms.getDateOfBegin().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
        dpEndDate.setDate(ms.getDateOfEnd().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
        txtPrice.setText(String.valueOf(ms.getPrice()));
        chBoxPayment.setSelected(ms.getPayment());
    }//GEN-LAST:event_lstMembershipsValueChanged

    private void readMembers(){
        DefaultListModel<Member> m = new DefaultListModel<>();
        memberController.read(txtSearch.getText()).forEach(mr -> m.addElement(mr));
        lstMembers.setModel(m);
    }
    
    private void setValuesIntoEntity(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        var e = membershipController.getEntity();
        e.setCourse((Course)cbCourses.getSelectedItem());
        e.setMember(lstMembers.getSelectedValue());
        e.setDateOfBegin(Date.from(
                dpDateOfBegin.getDate().atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()
        ));
        e.setDateOfEnd(Date.from(
                dpEndDate.getDate().atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()
        ));
        
        try{
        e.setPrice(new BigDecimal(txtPrice.getText()));    
        } catch(Exception ex){
            JOptionPane.showMessageDialog(getRootPane(), "The price has to be a decimal number!");
            return;
        }
        
        e.setPayment(chBoxPayment.isSelected());
        
        
    }
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<Course> cbCourses;
    private javax.swing.JCheckBox chBoxPayment;
    private com.github.lgooddatepicker.components.DatePicker dpDateOfBegin;
    private com.github.lgooddatepicker.components.DatePicker dpEndDate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCondition;
    private javax.swing.JLabel lblCourses;
    private javax.swing.JLabel lblDateOfBegin;
    private javax.swing.JLabel lblDateOfEnd;
    private javax.swing.JLabel lblEndDate;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JList<Member> lstMembers;
    private javax.swing.JList<Membership> lstMemberships;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
