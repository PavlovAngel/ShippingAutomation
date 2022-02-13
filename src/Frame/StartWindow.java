package Frame;

import javax.swing.*;
import java.awt.*;

public class StartWindow extends JPanel {
    JTextField textField = new JTextField();

    StartWindow() {
        textField.setPreferredSize(new Dimension(181, 50));
        //this.setBounds(0,0,200,);
        this.add(textField);
    }
}
