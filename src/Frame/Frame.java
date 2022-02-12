package Frame;

import Frame.MenuBar.MenuBar;

import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.metal.MetalLookAndFeel;
import java.awt.*;
import javax.swing.plaf.metal.DefaultMetalTheme;


public class Frame extends JFrame {
    public Frame() {
        TextFieldPanel textFieldPanel = new TextFieldPanel();
        Button button = new Button();
        MenuBar menuBar = new MenuBar();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
        this.setLayout(null);
        this.setResizable(false);
        this.setTitle("");
        this.setSize(300, 130);
        this.getContentPane().setBackground(new Color(150, 148, 148));
        this.setTitle("Shipping");
        this.setLocation(800, 100);
        this.add(textFieldPanel);
        this.add(button);
        this.setJMenuBar(menuBar);
        this.setVisible(true);
        this.setAlwaysOnTop(true);

    }

    }



