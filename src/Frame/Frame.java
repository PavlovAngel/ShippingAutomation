package Frame;

import Frame.MenuBar.MenuBar;

import javax.swing.*;
import java.awt.*;


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
        this.getContentPane().setBackground(new Color(13, 74, 86));
        this.setLocation(800, 100);
        this.add(textFieldPanel);
        this.add(button);
        this.setJMenuBar(menuBar);
        this.setVisible(true);
        this.setAlwaysOnTop(true);
    }


}