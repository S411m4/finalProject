/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package customSwingComponents;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author salma
 */
public class TableHeader extends JLabel{
    public TableHeader(String text)
    {
        super(text);
        setOpaque(true);
        setBackground(Color.WHITE);
        setFont(new Font("sanserif", 1, 12));
        setForeground(new Color(102,102,102));
        setBorder(new EmptyBorder(10,5,10,5));
    }
    
    @Override
    protected void paintComponent(Graphics graphics)
    {
        super.paintComponent(graphics);
        graphics.setColor(new Color(230,230,230));
        graphics.drawLine(0,getHeight() - 1, getWidth(), getHeight()-1);
    }
    
}
