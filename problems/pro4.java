//���� 4��
package problems;

import javax.swing.*;
import java.awt.*;

public class pro4 extends JFrame {
    pro4() {
        setTitle("Ten Color Buttons Frame");
        setSize(600, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new GridLayout(1, 10));

        for(int i =0;i<10;i++) {
            Color[] col = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.CYAN, Color.BLUE, Color.MAGENTA, Color.GRAY, Color.PINK, Color.LIGHT_GRAY};
            String text = Integer.toString(i);
            JButton b = new JButton(text);
            b.setOpaque(true);
            b.setBackground(col[i]);
            c.add(b);
        }
        setVisible(true);
    }

    public static void main(String[] args) {
        new pro4();
    }
}
