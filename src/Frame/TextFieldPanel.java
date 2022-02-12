package Frame;

import Web.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.time.LocalDateTime;

public class TextFieldPanel extends JPanel {

    public static TextField textField = new TextField();

    TextFieldPanel() {
        this.setBounds(0, -10, 178, 50);
        this.add(textField);



    }

    public static String getUrlFromTextField() {

        return textField.getText();
    }

    public static void setTextFieldCursorColour(Color color) {
        textField.setCaretColor(color);
    }



}