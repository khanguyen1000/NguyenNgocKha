package bai2;

import javax.management.remote.JMXConnectorFactory;
import javax.swing.*;
import java.awt.*;

public class bt2 extends JFrame {
    public bt2(String title)
    {
        super(title);
        setVisible(true);
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        JPanel pnFlow=new JPanel();
        pnFlow.setLayout(new FlowLayout());
        pnFlow.setBackground(Color.pink);
        JButton btn1=new JButton("FlowLayout");
        JButton btn2=new JButton("Add cac control");
        JButton btn3=new JButton("Tren 1 dong");
        JButton btn4=new JButton("het cho chua");
        JButton btn5=new JButton("thi xuong dong");
        pnFlow.add(btn1);pnFlow.add(btn2);pnFlow.add(btn3);
        pnFlow.add(btn4);pnFlow.add(btn5);
        Container con= getContentPane();
        con.add(pnFlow);
    }

    public static void main(String[] args) {
        new bt2("Demo FlowLayout");
    }
}
