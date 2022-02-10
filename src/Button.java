import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.time.LocalDateTime;

public class Button extends JButton implements ActionListener {

    Button() {
        this.setText("Click");
        this.setSize(110, 40);
        this.setLocation(178, 0);
        this.setBackground(Color.WHITE);
        this.setFocusable(false);
        this.addActionListener(this);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this) {

            System.out.println(LocalDateTime.now());

            try {
                User.loginToSite();
                User.printHtml();
                //  User.getDataFromSite();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            System.out.println(LocalDateTime.now());

        }

    }
}
