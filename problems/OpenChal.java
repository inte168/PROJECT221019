//¿ÀÇÂÃ§¸°Áö
package problems;

import javax.swing.*;
import java.awt.*;

public class OpenChal extends JFrame {
    OpenChal() {
        setTitle("Open Challenge 9");
        setDefaultCloseOperation(3);
        
        Container c = getContentPane();
        c.setLayout(new BorderLayout());
        c.add(new NorthPanel(), BorderLayout.NORTH);
        c.add(new CenterPanel(), BorderLayout.CENTER);
        setSize(400, 500);
        setVisible(true);
    }

    class NorthPanel extends JPanel {
        NorthPanel() {
            setBackground(Color.GRAY);
            setLayout(new FlowLayout());
            add(new JButton("Open"));
            add(new JButton("Read"));
            add(new JButton("Close"));
        }
    }

    class CenterPanel extends JPanel {
        CenterPanel() {
            String text[] = {"Hello", "Java", "Love"};
            setBackground(Color.lightGray);
            setLayout(null);
            int x, y;
            for(int i =0; i< text.length; i++){
                x = (int)(Math.random() *350);
                y = (int)(Math.random() *450);
                JLabel label = new JLabel(text[i]);
                label.setSize(50, 10);
                label.setLocation(x, y);
                add(label);
            }
        }
    }

    public static void main(String[] args) {
        new OpenChal();
    }
}
