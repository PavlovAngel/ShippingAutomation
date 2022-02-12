package Frame.MenuBar.MenuFile;
import Frame.TextFieldPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class FileMenuItemNew extends JMenuItem implements ActionListener {
    public FileMenuItemNew() {
        this.setText("New");
        this.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this) {
            TextFieldPanel.textField.setText("");
            TextFieldPanel.textField.setEditable(true);
            TextFieldPanel.setTextFieldCursorColour(Color.black);
            TextFieldPanel.textField.setForeground(Color.BLACK);
            TextFieldPanel.textField.setEnabled(true);


        }
    }
}
