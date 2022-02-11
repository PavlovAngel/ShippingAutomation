package Frame.MenuBar;

import javax.swing.*;


public class MenuBar extends JMenuBar {
    FileMenu fileMenu = new FileMenu();

    public MenuBar() {
        fileMenu.setText("File");
        this.add(fileMenu);
    }


}
