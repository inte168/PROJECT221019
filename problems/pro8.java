//문제 8번
package problems;

import javax.swing.*;
import java.awt.*;

public class pro8 extends JFrame {
    pro8(){
        setTitle("여러 개의 패널을 가진 프레임");
        setDefaultCloseOperation(3);
        
        Container c = getContentPane();
        c.setLayout(new BorderLayout());
        c.add(new NorthPanel(), BorderLayout.NORTH);
        c.add(new CenterPanel(), BorderLayout.CENTER);
        c.add(new BottomPanel(), BorderLayout.SOUTH);
        setSize(300, 300);
        setVisible(true);
    }

    class NorthPanel extends JPanel {
        NorthPanel() {
            setBackground(Color.GRAY);
            setLayout(new FlowLayout());
            add(new JButton("열기"));
            add(new JButton("닫기"));
            add(new JButton("나가기"));
        }
    }

    class CenterPanel extends JPanel {
        CenterPanel() {
            setBackground(Color.white);
            setLayout(null);
            int x, y;
            for(int i =0; i< 10; i++){
                x = (int)(Math.random() *250);
                y = (int)(Math.random() *200);
                JLabel label = new JLabel("*");
                label.setSize(50, 10);
                label.setLocation(x, y);
                add(label);
            }
        }
    }

    class BottomPanel extends JPanel {
        BottomPanel() {
            setBackground(Color.YELLOW);
            setLayout(new FlowLayout(FlowLayout.LEFT));
            add(new JButton("Word Input"));
            add(new JTextField(15));
            
        }
    }
    public static void main(String[] args) {
        new pro8();
    }
}