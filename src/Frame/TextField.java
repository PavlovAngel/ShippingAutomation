package Frame;

import Web.User;
import Web.WebSite;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.time.LocalDateTime;

public class TextField extends JTextField implements KeyListener {
    public boolean isWrite = false;

    TextField() {
        this.setPreferredSize(new Dimension(156, 50));
        this.setFont(new Font("Consolas", Font.BOLD, 18));
        this.addKeyListener(this);
        this.setToolTipText("Enter Url!");


    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if ((e.getKeyCode() == KeyEvent.VK_ENTER)) {
            System.out.println(LocalDateTime.now());
            // this.setEditable(false);
            isWrite = true;
            // this.setEnabled(false);
            try {
                User.loginToSite();
                if (WebSite.getIsRealUrl()) {

                    User.printHtml();
                }
            } catch (IOException ex) {
                this.setForeground(Color.RED);
                ex.printStackTrace();
            }
        }
    }
    @Override
    public void keyReleased(KeyEvent e) {

    }

}


