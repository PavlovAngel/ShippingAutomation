package Frame.MenuBar.MenuItems;
import Frame.TextFieldPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MenuItemNew extends JMenuItem implements ActionListener {
    public MenuItemNew() {
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


        }
    }
}
