package Frame.MenuBar;

import Frame.MenuBar.MenuItems.MenuItemNew;
import Frame.MenuBar.MenuItems.MenuItemSave;

import javax.swing.*;

public class FileMenu extends JMenu {
    MenuItemNew newItem = new MenuItemNew();
    MenuItemSave saveItem = new MenuItemSave();

    FileMenu() {
        this.add(newItem);
        this.add(saveItem);
    }
}
