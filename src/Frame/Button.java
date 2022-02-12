package Frame;

import Main.Main;
import Web.User;
import Web.WebSite;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.time.LocalDateTime;

public class Button extends JButton implements ActionListener {

    Button() {
        this.setText("Click");
        this.setSize(110, 42);
        this.setLocation(178, -1);
        this.setBorderPainted(true);
        this.setBackground(new Color(255,255 , 255));
        this.setForeground(new Color(0, 0, 0));
        this.setFocusable(false);
        this.addActionListener(this);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this) {

            System.out.println(LocalDateTime.now());
            try {
                User.loginToSite();
                // User.printHtml();
                //  Web.User.getDataFromSite();
                TextFieldPanel.textField.setEditable(false);
                TextFieldPanel.textField.setCaretColor(Color.white);

            } catch (IOException ex) {
                ex.printStackTrace();

            }
            System.out.println(LocalDateTime.now());

        }

    }
}
