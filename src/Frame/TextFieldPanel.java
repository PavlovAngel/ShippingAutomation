package Frame;


import javax.swing.*;
import java.awt.*;

public class TextFieldPanel extends JPanel {

    public static TextField textField = new TextField();

    TextFieldPanel() {
        this.setBounds(0, -10, 153, 50);
        this.add(textField);



    }

    public static String getUrlFromTextField() {

        return textField.getText();
    }

    public static void setTextFieldCursorColour(Color color) {
        textField.setCaretColor(color);
    }



}