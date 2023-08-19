package Frame;

import javax.swing.*;


public class BoxChoiceMenu extends JPanel {
    BoxChoiceMenu() {
        this.setBounds(0, 50, 160, 20);
        JRadioButton smallBox = new JRadioButton("1");
        JRadioButton bigBox = new JRadioButton("2");
        JRadioButton bigBox1 = new JRadioButton("3");
        JRadioButton bigBox2 = new JRadioButton("4");
        ButtonGroup group = new ButtonGroup();
        group.add(smallBox);
        group.add(bigBox);
        group.add(bigBox1);
        group.add(bigBox2);
        smallBox.setBounds(0, 0, 40, 20);
        bigBox.setBounds(40, 0, 40, 20);
        bigBox1.setBounds(80, 0, 40, 20);
        bigBox2.setBounds(120, 0, 40, 20);
        this.setLayout(null);
        this.add(smallBox);
        this.add(bigBox);
        this.add(bigBox1);
        this.add(bigBox2);
    }
}
