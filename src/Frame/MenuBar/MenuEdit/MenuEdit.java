package Frame.MenuBar.MenuEdit;

import javax.swing.*;

public class MenuEdit extends JMenu {
   public MenuEdit(){
       MenuEditItemUndo undo = new MenuEditItemUndo();
       this.add(undo);
        this.setText("Edit");
    }
}
