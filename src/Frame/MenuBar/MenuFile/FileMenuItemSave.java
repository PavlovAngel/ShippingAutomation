package Frame.MenuBar.MenuFile;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FileMenuItemSave extends JMenuItem implements ActionListener {
    public FileMenuItemSave() {
        this.setText("Save");
        this.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
