package Frame.MenuBar.MenuItems;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuItemSave extends JMenuItem implements ActionListener {
    public MenuItemSave() {
        this.setText("Save");
        this.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
