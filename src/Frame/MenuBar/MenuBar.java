package Frame.MenuBar;

import Frame.MenuBar.MenuFile.MenuFile;
import Frame.MenuBar.MenuEdit.MenuEdit;
import Frame.MenuBar.MenuHelp.MenuHelp;
import Frame.MenuBar.MenuOptions.MenuOptions;

import javax.swing.*;
import java.awt.*;


public class MenuBar extends JMenuBar {


    public MenuBar() {
        MenuFile menuFile = new MenuFile();
        MenuEdit menuEdit = new MenuEdit();
        MenuOptions menuOptions = new MenuOptions();
        MenuHelp menuHelp = new MenuHelp();
        this.add(menuFile);
        this.add(menuEdit);
        this.add(menuOptions);
        this.add(menuHelp);
        this.setBackground(new Color(220, 217, 217));
    }


}
