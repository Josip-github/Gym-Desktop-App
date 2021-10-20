/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.gym.view;

import hr.edunova.gym.model.Membership;
import java.awt.Component;
import java.text.SimpleDateFormat;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author dell
 */
public class MembershipRenderer extends JLabel implements ListCellRenderer<Membership> {
 
    SimpleDateFormat df = new SimpleDateFormat("dd. MM. YYYY.");
    
    @Override
    public Component getListCellRendererComponent(JList<? extends Membership> list, Membership membership, int index,
        boolean isSelected, boolean cellHasFocus) {
          
        //String code = country.getCode();
       // ImageIcon imageIcon = new ImageIcon(getClass().getResource("/images/" + code + ".png"));
       
         String tekst = "";
         tekst = "Membership: " + membership.getMember().getFirstname() + " " + 
                 membership.getMember().getLastname() + ", date Of Begin: " + df.format(membership.getDateOfBegin()) + 
                 ", payment: " + membership.getPayment();
       // setIcon(imageIcon);
        setText(tekst);
         
        return this;
    }
     

    
}
