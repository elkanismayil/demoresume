/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.resume.panel;

import com.company.dao.inter.SkillDaoInter;
import com.company.dao.inter.UserSkillDaoInter;
import com.company.entity.Skill;
import com.company.entity.User;
import com.company.entity.UserSkill;
import com.company.main.Context;
import com.company.resume.config.Config;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Seymur
 */
public class SkillsPanel extends javax.swing.JPanel {

    private SkillDaoInter skillDao = Context.instanceSkillDao();
    private UserSkillDaoInter userSkillDao = Context.instanceUserSkillDao();

    /**
     * Creates new form SkillsPanel
     */
    public SkillsPanel() {
        initComponents();
    }

    private void fillWindow() {
        List<Skill> skills = skillDao.getAll();
        for (Skill item : skills) {
            cbSkill.addItem(item);
        }
        fillTable();
    }

    List<UserSkill> list;

    private void fillTable() {
        User user = Config.loggedInUser;
        int id = user.getId();
        list = userSkillDao.getAllSkillByUserId(id);

        Vector<Vector> rows = new Vector<>();

        for (UserSkill l : list) {
            Vector row = new Vector();
            row.add(l.getSkill());
            row.add(l.getPower());
            rows.add(row);
        }

        Vector<String> columns = new Vector<>();
        columns.add("Skill");
        columns.add("Power");

        DefaultTableModel model = new DefaultTableModel(rows, columns);
        model.setColumnIdentifiers(new String[]{"Skill", "Power"});
        tblSkills.setModel(model);
    }

    public void fillUserComponents() {
        fillWindow();
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
        tblSkills = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        lblSkills = new javax.swing.JLabel();
        txtSkillName = new javax.swing.JTextField();
        lblPower = new javax.swing.JLabel();
        sliderPower = new javax.swing.JSlider();
        cbSkill = new javax.swing.JComboBox<>();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();

        tblSkills.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblSkills.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tblSkillsPropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(tblSkills);

        lblSkills.setText("skill:");

        txtSkillName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSkillNameActionPerformed(evt);
            }
        });

        lblPower.setText("power:");

        sliderPower.setMaximum(10);
        sliderPower.setMinimum(1);
        sliderPower.setPaintTicks(true);
        sliderPower.setValue(1);

        btnAdd.setText("+");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDelete.setText("-");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSkills)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cbSkill, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSkillName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                        .addComponent(lblPower)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sliderPower, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDelete)
                        .addGap(89, 89, 89)
                        .addComponent(btnSave)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblSkills)
                        .addComponent(txtSkillName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblPower)
                        .addComponent(cbSkill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(sliderPower, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnDelete)
                    .addComponent(btnSave))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtSkillNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSkillNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSkillNameActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int index = tblSkills.getSelectedRow();
        UserSkill userSkill = list.get(index);
        userSkillDao.removeUserSkill(userSkill.getId());
        fillWindow();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String skillName = txtSkillName.getText();
        Skill skill = null;
        if (skillName != null && skillName.trim().isEmpty()) {
            skill = new Skill(0, skillName);
            skillDao.insertSkill(skill);
        } else {
            skill = (Skill) cbSkill.getSelectedItem();
        }

        int power = sliderPower.getValue();
        UserSkill userSkill = new UserSkill(null, Config.loggedInUser, skill, power);
        userSkillDao.insertUserSkill(userSkill);
        fillWindow();
    }//GEN-LAST:event_btnAddActionPerformed

    private void tblSkillsPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblSkillsPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tblSkillsPropertyChange

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        UserSkill selectedUserSkill = list.get(tblSkills.getSelectedRow());
        String skillName = txtSkillName.getText();
        Skill skill = null;
        if (skillName != null && skillName.trim().isEmpty()) {
            skill = new Skill(0, skillName);
            skillDao.insertSkill(skill);
        } else {
            skill = (Skill) cbSkill.getSelectedItem();
        }

        int power = sliderPower.getValue();
        selectedUserSkill.setPower(power);
        selectedUserSkill.setSkill(skill);
        
        userSkillDao.updateUserSkill(selectedUserSkill);
        fillWindow();
    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<Skill> cbSkill;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPower;
    private javax.swing.JLabel lblSkills;
    private javax.swing.JSlider sliderPower;
    private javax.swing.JTable tblSkills;
    private javax.swing.JTextField txtSkillName;
    // End of variables declaration//GEN-END:variables
}
