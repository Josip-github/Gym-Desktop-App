/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.gym.view;

import hr.edunova.gym.controller.CourseController;
import hr.edunova.gym.controller.MemberController;
import hr.edunova.gym.controller.MembershipController;
import hr.edunova.gym.model.Membership;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vlasnik
 */
public class JTableClassTest extends javax.swing.JFrame {

    private MembershipController membershipController;
    private CourseController courseController;
    private MemberController memberController;
    SimpleDateFormat sdf;
    DecimalFormatSymbols symbols = new DecimalFormatSymbols(new Locale("hr","HR"));
        DecimalFormat df = new DecimalFormat("###,###.00",symbols);
    /**
     * Creates new form JTableClassTest
     */
    public JTableClassTest() {
        initComponents();
        membershipController = new MembershipController();
        courseController = new CourseController();
        memberController = new MemberController();
        sdf = new SimpleDateFormat("dd.MM.yyyy");
        readMemberships();
    }
    
    private void readMemberships(){
        
        List<Membership> mships = membershipController.read();
        //DefaultTableModel tblModel = new DefaultTableModel();
        
        DefaultTableModel tblModel = (DefaultTableModel)tblMemberships.getModel();
        
        for(Membership m : mships){
            String row[] = {
                m.getId().toString(),
                m.getCourse().toString(),
                m.getMember().getFirstname() + " " + m.getMember().getLastname(),
                sdf.format(m.getDateOfBegin()).toString(),
                //m.getDateOfBegin().toString(),
                sdf.format(m.getDateOfEnd()).toString(),
                //m.getDateOfEnd().toString(),
                //m.getPrice().toString(),
                df.format(m.getPrice()),
                m.getPayment().toString()
            };
            tblModel.addRow(row);
        }
        
        //tblMemberships.setModel(tblModel);
        tblMemberships.repaint();
        
            
           
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
        tblMemberships = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tblMemberships.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Course", "Member", "Begin date", "End date", "Price", "Payment"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblMemberships);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 805, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblMemberships;
    // End of variables declaration//GEN-END:variables
}
