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
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vlasnik
 */
public class WindowMembership extends javax.swing.JFrame {

    private CourseController courseController;
    private MemberController memberController;
    private MembershipController membershipController;
    SimpleDateFormat sdf;
    /**
     * Creates new form WindowMembership
     */
    public WindowMembership() {
        initComponents();
        courseController = new CourseController();
        memberController = new MemberController();
        membershipController = new MembershipController();
        sdf = new SimpleDateFormat("dd.MM.yyyy");
        settings();
        readMemberships();
    }
    
    private void readMemberships(){
        DefaultListModel<Membership> m = new DefaultListModel();
        membershipController.read().forEach(mc -> m.addElement(mc));
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
        btnShowAll = new javax.swing.JButton();

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

        btnShowAll.setText("Show all memberships");
        btnShowAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowAllActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCondition, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnUpdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnDelete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(chBoxPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCourses, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbCourses, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDateOfBegin, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dpDateOfBegin, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblDateOfEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(dpEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(btnShowAll, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCondition)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearch))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(lblDateOfEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblCourses, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(cbCourses, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(29, 29, 29)
                            .addComponent(lblPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(28, 28, 28)
                            .addComponent(chBoxPayment)
                            .addGap(17, 17, 17)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(dpDateOfBegin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblDateOfBegin, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lblEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(dpEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnShowAll, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
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
        var m = memberController.getEntity();
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
            membershipController.setEntity(null);
        } catch (GymException ex) {
            JOptionPane.showMessageDialog(getRootPane(), ex.getMessage());
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        
        if(membershipController.getEntity()==null){
            JOptionPane.showMessageDialog(getRootPane(), "First choose a membership.");
            return;
        }
        setValuesIntoEntity();
        try {
            membershipController.update();
            readMemberships();
            membershipController.setEntity(null);
        } catch (GymException ex) {
            JOptionPane.showMessageDialog(getRootPane(), ex.getMessage());
        }
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        
        if(membershipController.getEntity()==null){
            JOptionPane.showMessageDialog(getRootPane(), "First choose a membership.");
            return;
        }
        setValuesIntoEntity();
        try {
            membershipController.delete();
            readMemberships();
            membershipController.setEntity(null);
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
        DefaultListModel<Member> m = new DefaultListModel<>();
        m.addElement(ms.getMember());
        lstMembers.setModel(m);
        //txtSearch.setText(ms.getMember().getLastname());
        cbCourses.setSelectedItem(ms.getCourse());
        txtPrice.setText(ms.getPrice().toString());
        dpDateOfBegin.setDate(ms.getDateOfBegin().toInstant()
                                .atZone(ZoneId.systemDefault()).toLocalDate());
        dpEndDate.setDate(ms.getDateOfEnd().toInstant()
                                .atZone(ZoneId.systemDefault()).toLocalDate());
    }//GEN-LAST:event_lstMembershipsValueChanged

    private void btnShowAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowAllActionPerformed
        new JTableClassTest().setVisible(true);
    }//GEN-LAST:event_btnShowAllActionPerformed

    private void readMembers(){
        DefaultListModel<Member> m = new DefaultListModel<>();
        memberController.read(txtSearch.getText()).forEach(mr -> m.addElement(mr));
        if(m.isEmpty()){
            
            if(JOptionPane.showConfirmDialog(rootPane, 
                    "Member does not exist, would you like to create one?", 
                    "?", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
                new WindowMembers().setVisible(true);
                
            }
        }
        lstMembers.setModel(m);
    }
    
    private void setValuesIntoEntity(){
        
        var e = membershipController.getEntity();
        
        try{
            e.setCourse((Course)cbCourses.getSelectedItem());
        } catch(Exception ex){
            e.setCourse(null);
        }
        
        try{
            e.setMember(lstMembers.getSelectedValue());
        } catch(Exception ex){
            JOptionPane.showMessageDialog(getRootPane(), "You have to choose a member!");
        }
        
        try{
            
            e.setDateOfBegin(Date.from(
                dpDateOfBegin.getDate().atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()
            ));
            e.setDateOfEnd(Date.from(
                dpEndDate.getDate().atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()
            ));
        
        } catch(Exception ex){
             e.setDateOfBegin(null);
             e.setDateOfEnd(null);
        }
        
        try{
            
            e.setPrice(new BigDecimal(txtPrice.getText()));    
        } catch(Exception ex){
            e.setPrice(null);
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
    private javax.swing.JButton btnShowAll;
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
