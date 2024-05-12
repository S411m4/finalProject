/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package finalproject;

import javax.swing.plaf.metal.MetalCheckBoxUI;
import DatabaseHelpers.DatabaseHelper;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import models.NoteModel;
import models.TaskModel;
import java.awt.Component;
import javax.swing.JDialog;
import javax.swing.border.BevelBorder;
import main.CalenderCustom;

/**
 *
 * @author salma
 */
public class TaskPanel extends javax.swing.JPanel {
    private String str1;
    JLabel index , date;
    private TaskModel task;

    /**
     * Creates new form taskPanel
     */
    public TaskPanel(TaskModel task) {
        this.task = task;

        initComponents();
                this.setDueDateBtn.setToolTipText(task.getDueDateTime());

        //reset style of checkbox to override flatlaf style
        taskDone.setUI(new MetalCheckBoxUI());
        taskDone.setForeground(Color.gray);
        

        if (this.task.getState()) {
            taskDone.doClick();
        }

        taskString.setText(this.task.getTask());
        taskString.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                task.setTask(taskString.getText());
                task.Save();
            }
        });
    }

    public TaskPanel() {
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

        taskDone = new javax.swing.JCheckBox();
        taskString = new customSwingComponents.StrikeThroughTextField();
        setDueDateBtn = new com.markbean.notes.customGUIComponents.RoundedButton();

        setOpaque(false);

        taskDone.setBackground(new java.awt.Color(208, 188, 255));
        taskDone.setForeground(new java.awt.Color(56, 30, 114));
        taskDone.setBorder(null);
        taskDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taskDoneActionPerformed(evt);
            }
        });

        taskString.setBackground(new java.awt.Color(20, 18, 24));
        taskString.setBorder(null);
        taskString.setForeground(new java.awt.Color(255, 255, 255));
        taskString.setText("Task...");
        taskString.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        taskString.setLineColor(new java.awt.Color(255, 255, 255));

        setDueDateBtn.setBackground(new java.awt.Color(20, 18, 24));
        setDueDateBtn.setBorder(null);
        setDueDateBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/calenderIcon.png"))); // NOI18N
        setDueDateBtn.setToolTipText("no due date");
        setDueDateBtn.setBorderColor(new java.awt.Color(20, 18, 24));
        setDueDateBtn.setBorderPainted(false);
        setDueDateBtn.setColor(new java.awt.Color(20, 18, 24));
        setDueDateBtn.setColorClick(new java.awt.Color(20, 18, 24));
        setDueDateBtn.setColorOver(new java.awt.Color(20, 18, 24));
        setDueDateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setDueDateBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(setDueDateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(taskString, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(taskDone)
                .addGap(68, 68, 68))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(taskString, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(taskDone))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(setDueDateBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void taskDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taskDoneActionPerformed
        // TODO add your handling code here:
        task.setChecked(taskDone.isSelected());
        if(taskDone.isSelected())
        {
            taskString.drawStrikeThroughLine();
        }
        else
        {
            taskString.unDrawStrikeThroughLine();
        }
        task.Save();
    }//GEN-LAST:event_taskDoneActionPerformed

    private void setDueDateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setDueDateBtnActionPerformed
        // TODO add your handling code here:
        //new time(this);  
        openCalenderPopup();
        
        
    }//GEN-LAST:event_setDueDateBtnActionPerformed

    private void openCalenderPopup()
    {
        JDialog dialog = new JDialog();
        dialog.setSize(600,500);
        dialog.setLocationRelativeTo(this);
        CalenderCustom calender = new CalenderCustom(dialog, setDueDateBtn, task);
        dialog.add(calender);
        dialog.setVisible(true);
        repaint();
    }
    
//Roaa-Rowan time calender due date for task
//class time extends JFrame implements ActionListener
//{
//   private JLabel monthLabel;
//    private JButton prevButton, nextButton , ok;
//    private JTable calendarTable;
//    private JComboBox<String> yearComboBox;
//    private JScrollPane calendarScrollPane;
//    private JPanel calendarPanel;
//    private SimpleDateFormat sdf = new SimpleDateFormat("MMMM yyyy");
//    private Calendar currentCalendar;
//    private DefaultTableModel calendarTableModel;
//    
//    
//    public time(Component parent) {
//                setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//
//        setTitle("set the Duo Date");
//        setSize(400, 200);
//        setVisible(true);
//        currentCalendar = Calendar.getInstance();
//        ok = new JButton("OK");
//        monthLabel = new JLabel("", JLabel.CENTER);
//        prevButton = new JButton("<");
//        nextButton = new JButton(">");
//        calendarTableModel = new DefaultTableModel() {
//            public boolean isCellEditable(int rowIndex, int mColIndex) {
//                return false;
//            }
//        };
//        calendarTable = new JTable(calendarTableModel);
//        calendarScrollPane = new JScrollPane(calendarTable);
//        calendarPanel = new JPanel(null);
//
//        calendarPanel.setBorder(BorderFactory.createTitledBorder("Calendar"));
//        
//        getContentPane().setLayout(null);
//        monthLabel.setBounds(145, 20, 100, 20);
//        prevButton.setBounds(3, 40, 50, 50);
//        nextButton.setBounds(330, 40, 50, 50);
//        ok.setBounds(160, 40, 70, 50);
//        getContentPane().add(monthLabel);
//        getContentPane().add(prevButton);
//        getContentPane().add(nextButton);        
//        getContentPane().add(ok);
//
//        String[] years = {"2024","2025","2026"};
//        yearComboBox = new JComboBox<>(years);
//        yearComboBox.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                updateCalendar();
//            }
//        });
//        yearComboBox.setBounds(80,100,200,20);
//        getContentPane().add(yearComboBox);
//
//        prevButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                currentCalendar.add(Calendar.MONTH, -1);
//                updateCalendar();             
//            }
//        });
//
//        nextButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                currentCalendar.add(Calendar.MONTH, 1);
//                updateCalendar();
//            }
//        });
//        ok.addActionListener(new ActionListener()
//        {
//            public void actionPerformed(ActionEvent e)
//            {
//                  str1 = String.valueOf(monthLabel.getText());
//                    dispose();
//            }
//        });
//        updateCalendar();
//        
//    }
//    private void updateCalendar() {
//        int year = Integer.parseInt(yearComboBox.getSelectedItem().toString());
//        currentCalendar.set(Calendar.YEAR, year);
//        monthLabel.setText(sdf.format(currentCalendar.getTime()));   
//}
//
//        @Override
//        public void actionPerformed(ActionEvent e) {
//           
//
//        }
//
//    
// }

      
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.markbean.notes.customGUIComponents.RoundedButton setDueDateBtn;
    private javax.swing.JCheckBox taskDone;
    private customSwingComponents.StrikeThroughTextField taskString;
    // End of variables declaration//GEN-END:variables
}
