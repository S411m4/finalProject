/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package finalproject;

import customSwingComponents.ScrollBar;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.KeyStroke;
import models.NoteModel;

/**
 *
 * @author salma
 */
//TODO: Create homePanel when quitting
public class NotePanel extends javax.swing.JPanel {

    private NoteModel note;
    private final int maxTitleLetters = 13;

    /**
     * Creates new form NotePanel
     */
    public NotePanel(NoteModel note) {
        this.note = note;
        
      
        initComponents();
        title.setBackground(Color.white);
        content.setBackground(Color.white);
        content.setForeground(Color.BLACK);
        content.setFont(new Font("Segoe Print", Font.PLAIN, 12));
        contentScroll.setVerticalScrollBar(new ScrollBar());
        contentScroll.getVerticalScrollBar().setBackground(Color.WHITE);
        String lastEditedDateString = note.getLastEditedDate() == null ? note.getCreatedDate() : note.getLastEditedDate();
        lastEditedDate.setText(lastEditedDateString);
        createdDate.setText(note.getCreatedDate());
        title.setText(note.getTitle());
        content.setText(note.getContent());

        title.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

                if (title.getText().length() >= maxTitleLetters) {
                    e.consume();
                }

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {
                save();
            }
        });

        // Add KeyListener to JTextArea
        content.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                // Check if Ctrl+S is pressed
                if (e.getKeyCode() == KeyEvent.VK_S && e.isControlDown()) {
                    // Call your Create function here
                    //System.out.println("Save from shortcut");
                    save();
                }

                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    //System.out.println("AutoSave");
                    save();
                }
            }
        });

        if (note.getID() == -1) {
            note.Create();
        }
    }

    private void save() {
        note.setTitle(title.getText());
        note.setContent(content.getText());
        note.Save();
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
        buttonsPanel = new javax.swing.JPanel();
        saveBtn = new customSwingComponents.GradientButton();
        paintBtn = new customSwingComponents.GradientButton();
        homeBtn = new customSwingComponents.GradientButton();
        lastEditedPanel = new javax.swing.JPanel();
        lastEditedDate = new javax.swing.JLabel();
        lastEditedDateLabel = new javax.swing.JLabel();
        dateCreatedPanel = new javax.swing.JPanel();
        createdDate = new javax.swing.JLabel();
        createdDateLabel = new javax.swing.JLabel();
        contentScroll = new javax.swing.JScrollPane();
        content = new javax.swing.JTextArea();
        title = new javax.swing.JTextField();

        setOpaque(false);

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));

        buttonsPanel.setOpaque(false);

        saveBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/saveIcon.png"))); // NOI18N
        saveBtn.setMnemonic(KeyEvent.VK_S);
        saveBtn.setGradientColor1(new java.awt.Color(43, 41, 48));
        saveBtn.setGradientColor2(new java.awt.Color(43, 41, 48));
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        paintBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/paintIcon.png"))); // NOI18N
        paintBtn.setGradientColor1(new java.awt.Color(43, 41, 48));
        paintBtn.setGradientColor2(new java.awt.Color(43, 41, 48));
        paintBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paintBtnActionPerformed(evt);
            }
        });

        homeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/menuIcon.png"))); // NOI18N
        homeBtn.setGradientColor1(new java.awt.Color(43, 41, 48));
        homeBtn.setGradientColor2(new java.awt.Color(43, 41, 48));
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonsPanelLayout = new javax.swing.GroupLayout(buttonsPanel);
        buttonsPanel.setLayout(buttonsPanelLayout);
        buttonsPanelLayout.setHorizontalGroup(
            buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonsPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(paintBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(homeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        buttonsPanelLayout.setVerticalGroup(
            buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paintBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(homeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        lastEditedPanel.setOpaque(false);

        lastEditedDate.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        lastEditedDate.setForeground(new java.awt.Color(153, 153, 153));
        lastEditedDate.setText("17/2/2024, 3:00 a.m.");

        lastEditedDateLabel.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        lastEditedDateLabel.setForeground(new java.awt.Color(153, 153, 153));
        lastEditedDateLabel.setText("Last Edited:");

        javax.swing.GroupLayout lastEditedPanelLayout = new javax.swing.GroupLayout(lastEditedPanel);
        lastEditedPanel.setLayout(lastEditedPanelLayout);
        lastEditedPanelLayout.setHorizontalGroup(
            lastEditedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lastEditedPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lastEditedDateLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lastEditedDate, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        lastEditedPanelLayout.setVerticalGroup(
            lastEditedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lastEditedPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lastEditedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastEditedDate)
                    .addComponent(lastEditedDateLabel))
                .addContainerGap())
        );

        dateCreatedPanel.setOpaque(false);

        createdDate.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        createdDate.setForeground(new java.awt.Color(153, 153, 153));
        createdDate.setText("17/2/2024, 3:00 a.m.");

        createdDateLabel.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        createdDateLabel.setForeground(new java.awt.Color(153, 153, 153));
        createdDateLabel.setText("created:");

        javax.swing.GroupLayout dateCreatedPanelLayout = new javax.swing.GroupLayout(dateCreatedPanel);
        dateCreatedPanel.setLayout(dateCreatedPanelLayout);
        dateCreatedPanelLayout.setHorizontalGroup(
            dateCreatedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dateCreatedPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(createdDateLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(createdDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dateCreatedPanelLayout.setVerticalGroup(
            dateCreatedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dateCreatedPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dateCreatedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createdDate)
                    .addComponent(createdDateLabel))
                .addContainerGap())
        );

        contentScroll.setBorder(null);
        contentScroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        content.setColumns(20);
        content.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        content.setLineWrap(true);
        content.setRows(5);
        content.setWrapStyleWord(true);
        content.setBorder(null);
        contentScroll.setViewportView(content);

        title.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        title.setForeground(new java.awt.Color(208, 208, 208));
        title.setText("Title");
        title.setBorder(null);
        title.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addComponent(lastEditedPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                        .addComponent(dateCreatedPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 163, Short.MAX_VALUE)
                        .addComponent(buttonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addComponent(contentScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 1011, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 14, Short.MAX_VALUE))
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addComponent(title)
                        .addContainerGap())))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dateCreatedPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastEditedPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(contentScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 7, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        // TODO add your handling code here:
        HomeFrame.Instance.setPage(HomeFrame.Instance.getHomePanel());
         
        NotesPreviewScrollPanel.Instance.loadNotes();

    }//GEN-LAST:event_homeBtnActionPerformed

    private void paintBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paintBtnActionPerformed
        // TODO add your handling code here:
        new Paintapp();
    }//GEN-LAST:event_paintBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        //System.out.println("SAVE Button");
        save();
    }//GEN-LAST:event_saveBtnActionPerformed

    private void titleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_titleActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttonsPanel;
    private javax.swing.JTextArea content;
    private javax.swing.JScrollPane contentScroll;
    private javax.swing.JLabel createdDate;
    private javax.swing.JLabel createdDateLabel;
    private javax.swing.JPanel dateCreatedPanel;
    private customSwingComponents.GradientButton homeBtn;
    private javax.swing.JLabel lastEditedDate;
    private javax.swing.JLabel lastEditedDateLabel;
    private javax.swing.JPanel lastEditedPanel;
    private customSwingComponents.GradientButton paintBtn;
    private customSwingComponents.PanelBorder panelBorder1;
    private customSwingComponents.GradientButton saveBtn;
    private javax.swing.JTextField title;
    // End of variables declaration//GEN-END:variables
}
