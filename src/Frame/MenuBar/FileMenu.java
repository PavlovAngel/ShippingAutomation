package Frame.MenuBar;

import javax.swing.*;

public class FileMenu extends JMenu {
    NewFileMenuItem newFile = new NewFileMenuItem();

    FileMenu() {
        this.add(newFile);
    }
}
