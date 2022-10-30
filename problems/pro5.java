//¹®Á¦ 5¹ø
package problems;

import javax.swing.*;
import java.awt.*;

public class pro5 extends JFrame {
    pro5(){
        setTitle("4x4 Color Frame");
        setSize(600, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new GridLayout(4,4));

        for(int i =0;i<16; i++) {
            Color[] col = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.CYAN, Color.BLUE, Color.MAGENTA, Color.GRAY, Color.PINK, Color.LIGHT_GRAY, Color.WHITE, Color.DARK_GRAY, Color.BLACK, Color.ORANGE, Color.BLUE, Color.MAGENTA};
            JLabel label = new JLabel(i+"");
            label.setBackground(col[i]);
            label.setOpaque(true);
            c.add(label);
        }
        setVisible(true);
    }

    public static void main(String[] args) {
        new pro5();
    }
}
