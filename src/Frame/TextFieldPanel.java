package Frame;

import javax.swing.*;
import java.awt.*;

public class TextFieldPanel extends JPanel {

    public static TextField textField = new TextField();

    TextFieldPanel() {
        this.setBounds(0, -10, 178, 50);
        this.setBackground(new Color(255, 255, 255));
        this.add(textField);

    }

    public static String getUrlFromTextField() {
        return textField.getText();
    }
}