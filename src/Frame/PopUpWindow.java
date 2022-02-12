package Frame;

import javax.swing.*;

public class PopUpWindow extends JOptionPane {
    public PopUpWindow() {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.add(this);
        this.setBounds(10,10,100,100);
        frame.setBounds(100,100,100,100);
        this.setVisible(true);
    }
}
