/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnalyticsDashboard;
import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.ui.FlatUIUtils;
import com.formdev.flatlaf.util.UIScale;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

/**
 *
 * @author Raven
 */
public class Background extends JPanel {

    public Background() {
        init();
    }

    private void init() {
        setOpaque(false);
        setLayout(new BorderLayout());
        putClientProperty(FlatClientProperties.STYLE, ""
                + "border:5,5,5,5;"
                + "background:$Drawer.background");
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        FlatUIUtils.setRenderingHints(g2);
        int arc = UIScale.scale(30);
        g2.setColor(getBackground());
        FlatUIUtils.paintComponentBackground(g2, 0, 0, getWidth(), getHeight(), 0, arc);
        g2.setBackground(new Color(20,18,24));
        g2.dispose();
        super.paintComponent(g);
    }
}