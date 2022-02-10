import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.time.LocalDateTime;


public class Frame extends JFrame {
    Frame() {
        TextFieldPanel textFieldPanel = new TextFieldPanel();
        Button button = new Button();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.pack();
        this.setResizable(false);
        this.setTitle("");
        this.setSize(300, 130);
        this.getContentPane().setBackground(new Color(212, 212, 212));
        this.setLocation(800, 100);
        this.add(textFieldPanel);
        this.add(button);
        this.setVisible(true);
        this.setAlwaysOnTop(true);
    }

}