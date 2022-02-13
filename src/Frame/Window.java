package Frame;

import Frame.MenuBar.MenuBar;

import javax.swing.*;
import java.awt.*;


public class Window extends JFrame {
    public Window() {

        TextFieldPanel textFieldPanel = new TextFieldPanel();
        Button button = new Button();
        MenuBar menuBar = new MenuBar();
        StartWindow startWindow = new StartWindow();
        BoxChoiceMenu boxChoiceMenu = new BoxChoiceMenu();
        JLabel weight = new JLabel(50 + " kg");
        JLabel boxes = new JLabel("Boxes: " + 80);
        JLabel cmrBoxes = new JLabel("Boxes: " + 80);
        boxes.setBounds(180, 50, 65, 20);
        cmrBoxes.setBounds(0, 50, 65, 20);
        //boxes.setBorder(BorderFactory.createLineBorder(Color.BLACK,1,true));
        //  weight.setBorder(BorderFactory.createLineBorder(Color.BLACK,1,true));
        weight.setBounds(130, 50, 50, 20);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
        this.setLayout(null);
        this.setResizable(false);
        this.setSize(250, 100);
        this.getContentPane().setBackground(new Color(150, 148, 148));
        this.setTitle("Shipping");
        this.setLocation(800, 100);
        //this.add(startWindow);
        this.add(weight);
        this.add(boxes);
        this.add(cmrBoxes);
        this.add(textFieldPanel);
        // this.add(boxChoiceMenu);
        this.add(button);
        //this.setJMenuBar(menuBar);
        this.setVisible(true);
        this.setAlwaysOnTop(true);

    }

}



