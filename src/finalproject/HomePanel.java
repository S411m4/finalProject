/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.markbean.smartnotes;

import customSwingComponents.ScrollBar;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import static javax.swing.ScrollPaneConstants.UPPER_RIGHT_CORNER;
import models.StatusType;

/**
 *
 * @author salma
 */
public class HomePanel extends javax.swing.JPanel {

    /**
     * Creates new form HomePanel
     */
    public HomePanel() {
        initComponents();

            spTable.setVerticalScrollBar(new ScrollBar());
            spTable.getVerticalScrollBar().setBackground(Color.WHITE);
            JPanel p = new JPanel();
            p.setBackground(Color.WHITE);
            
        table.addRow(new Object[]{"Salma", "salma@gmail.com", "Admin", "25 Apr 2018", StatusType.PENDING});
        table.addRow(new Object[]{"Salma", "salma@gmail.com", "Admin", "25 Apr 2018", StatusType.APPROVED});
        table.addRow(new Object[]{"Salma", "salma@gmail.com", "Admin", "25 Apr 2018", StatusType.REJECTED});
          table.addRow(new Object[]{"Salma", "salma@gmail.com", "Admin", "25 Apr 2018", StatusType.PENDING});
        table.addRow(new Object[]{"Salma", "salma@gmail.com", "Admin", "25 Apr 2018", StatusType.APPROVED});
        table.addRow(new Object[]{"Salma", "salma@gmail.com", "Admin", "25 Apr 2018", StatusType.REJECTED});
          table.addRow(new Object[]{"Salma", "salma@gmail.com", "Admin", "25 Apr 2018", StatusType.PENDING});
        table.addRow(new Object[]{"Salma", "salma@gmail.com", "Admin", "25 Apr 2018", StatusType.APPROVED});
        table.addRow(new Object[]{"Salma", "salma@gmail.com", "Admin", "25 Apr 2018", StatusType.REJECTED});

          table.addRow(new Object[]{"Salma", "salma@gmail.com", "Admin", "25 Apr 2018", StatusType.PENDING});
        table.addRow(new Object[]{"Salma", "salma@gmail.com", "Admin", "25 Apr 2018", StatusType.APPROVED});
        table.addRow(new Object[]{"Salma", "salma@gmail.com", "Admin", "25 Apr 2018", StatusType.REJECTED});

          table.addRow(new Object[]{"Salma", "salma@gmail.com", "Admin", "25 Apr 2018", StatusType.PENDING});
        table.addRow(new Object[]{"Salma", "salma@gmail.com", "Admin", "25 Apr 2018", StatusType.APPROVED});
        table.addRow(new Object[]{"Salma", "salma@gmail.com", "Admin", "25 Apr 2018", StatusType.REJECTED});

          table.addRow(new Object[]{"Salma", "salma@gmail.com", "Admin", "25 Apr 2018", StatusType.PENDING});
        table.addRow(new Object[]{"Salma", "salma@gmail.com", "Admin", "25 Apr 2018", StatusType.APPROVED});
        table.addRow(new Object[]{"Salma", "salma@gmail.com", "Admin", "25 Apr 2018", StatusType.REJECTED});



    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        card3 = new customSwingComponents.Card();
        card2 = new customSwingComponents.Card();
        card1 = new customSwingComponents.Card();
        panelBorder1 = new customSwingComponents.PanelBorder();
        jLabel1 = new javax.swing.JLabel();
        spTable = new javax.swing.JScrollPane();
        table = new customSwingComponents.Table();

        jLayeredPane1.setLayout(new java.awt.GridLayout(1, 0, 10, 0));
        jLayeredPane1.add(card3);
        jLayeredPane1.add(card2);
        jLayeredPane1.add(card1);

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Standard Design Table");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "null"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        spTable.setViewportView(table);

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spTable, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private customSwingComponents.Card card1;
    private customSwingComponents.Card card2;
    private customSwingComponents.Card card3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private customSwingComponents.PanelBorder panelBorder1;
    private javax.swing.JScrollPane spTable;
    private customSwingComponents.Table table;
    // End of variables declaration//GEN-END:variables
}
