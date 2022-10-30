//���� 7��
package problems;

import javax.swing.*;
import java.awt.*;

public class pro7 extends JFrame {
    pro7(){
        setTitle("���� ������");
        setSize(350, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container c = getContentPane();
        JPanel pn = new JPanel();
        JPanel ps = new JPanel();
        JPanel pc = new JPanel();

        pn.setBackground(Color.LIGHT_GRAY);
        pc.setLayout(new GridLayout(4,4));
        ps.setBackground(Color.YELLOW);

        c.add(pc);
        c.add(pn, BorderLayout.NORTH);
        c.add(ps, BorderLayout.SOUTH);

        JLabel l1 = new JLabel("�����Է�");
        JTextField tf1 = new JTextField(10);
        pn.add(l1);
        pn.add(tf1);

        JLabel l2 = new JLabel("�����");
        JTextField tf2 = new JTextField(10);
        ps.add(l2);
        ps.add(tf2);

        for(int i =0; i<16; i++) {
            JButton b = new JButton();
            String[] str = {"CE", "���", "+", "-", "x", "/"};
            pc.add(b);
            if(i<10) b.setText(i+"");
            else b.setText(str[i-10]);

            if(i>11) {
                b.setOpaque(true);
                b.setBackground(Color.CYAN);
            }
        }
        setVisible(true);
    }

    public static void main(String[] args) {
        new pro7();
    }
}