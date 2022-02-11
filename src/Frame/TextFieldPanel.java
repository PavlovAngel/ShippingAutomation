package Frame;

import Web.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.time.LocalDateTime;

public class TextFieldPanel extends JPanel implements KeyListener {

    public static TextField textField = new TextField();

    TextFieldPanel() {
        this.setBounds(0, -10, 178, 50);
        this.add(textField);
        textField.addKeyListener(this);


    }

    public static String getUrlFromTextField() {

        return textField.getText();
    }

    public static void setTextFieldCursorColour(Color color) {
        textField.setCaretColor(color);
    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            System.out.println(LocalDateTime.now());
            try {
                User.loginToSite();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}