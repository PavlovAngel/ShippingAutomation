package Frame.MenuBar.MenuFile;

import javax.swing.*;

public class MenuFile extends JMenu {
    FileMenuItemNew New = new FileMenuItemNew();
    FileMenuItemSave save = new FileMenuItemSave();

    public MenuFile() {
        this.setText("File");
        this.add(New);
        this.add(save);
    }
}
