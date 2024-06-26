/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package paneltags;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author salma
 */
public class tagsPanel extends javax.swing.JPanel {

    /**
     * Creates new form tagsPanel
     */
    
    public void loadTagsFromDB(ArrayList<String> tags)
    {
        panelTags1.loadTagsFromDB(tags);
    }
    
    public tagsPanel() {
        initComponents();
        panelTags1.addEventTags(new EventTags() {
            @Override
            public void onAddItem(Item item, String text) {
            }

            @Override
            public void onKeyType(Item item, String text, KeyEvent evt) {
            }

            @Override
            public void onItemRemove(Item item, String text) {
            }

            @Override
            public boolean isRemoveAble(Item item, String text) {
                if (text.equals("123")) {
                    return false;
                } else {
                    return true;
                }
            }

            @Override
            public boolean isAddAble(Item item, String text) {
                return !isDuplicated(text);
            }

            @Override
            public boolean onEditAble(Item item, String text) {
                return !isDuplicated(item, text);
            }
        });
    }
    
    private boolean isDuplicated(String text) {
        List<String>list=panelTags1.getAllItem();
        for(String t:list){
            if(text.equals(t)){
                return true;
            }
        }
        return false;
    }
    
    private boolean isDuplicated(Item item, String text) {
        List<String>list=panelTags1.getAllItemExit(item);
        for(String t:list){
            if(text.equals(t)){
                return true;
            }
        }
        return false;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder1 = new customSwingComponents.PanelBorder();
        panelTags1 = new paneltags.PanelTags();

        setMaximumSize(new java.awt.Dimension(179, 117));
        setMinimumSize(new java.awt.Dimension(179, 117));
        setOpaque(false);

        panelBorder1.setBackground(new java.awt.Color(20, 18, 24));
        panelBorder1.setForeground(new java.awt.Color(230, 224, 233));
        panelBorder1.setMaximumSize(new java.awt.Dimension(179, 117));
        panelBorder1.setMinimumSize(new java.awt.Dimension(179, 117));
        panelBorder1.setOpaque(true);

        panelTags1.setBackground(new java.awt.Color(20, 18, 24));

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelTags1, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelTags1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private customSwingComponents.PanelBorder panelBorder1;
    private paneltags.PanelTags panelTags1;
    // End of variables declaration//GEN-END:variables
}
