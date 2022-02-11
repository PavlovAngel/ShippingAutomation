package Frame.MenuBar;

import Frame.TextFieldPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class NewFileMenuItem extends JMenuItem implements ActionListener {
    NewFileMenuItem() {
        this.setText("New");
        this.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this) {
            TextFieldPanel.textField.setText("");

        }
    }
}
