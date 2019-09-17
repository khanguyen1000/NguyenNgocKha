package bai4;

import javax.swing.*;
import java.awt.*;

public class bt4 extends JFrame {
    public bt4(){
        super("Borderlayout");
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        Font font=new Font("Arial",Font.BOLD|Font.ITALIC|Font.CENTER_BASELINE,25);
        JPanel pnBoder=new JPanel();
        pnBoder.setLayout(new BorderLayout());
        JPanel pnNorth=new JPanel();
        pnNorth.setBackground(Color.RED);
        JLabel lb1=new JLabel("North");
        lb1.setFont(font);
        pnNorth.add(lb1);
        pnBoder.add(pnNorth,BorderLayout.NORTH);
        JPanel pnSouth=new JPanel();
        pnSouth.setBackground(Color.RED);
        JLabel lb2=new JLabel("South");
        lb2.setFont(font);
        pnSouth.add(lb2);
        pnBoder.add(pnSouth,BorderLayout.SOUTH);
        JPanel pnWest=new JPanel();
        pnWest.setBackground(Color.BLUE);
        JLabel lb3=new JLabel("WEST");
        lb3.setFont(font);
        pnWest.add(lb3);
        pnBoder.add(pnWest,BorderLayout.WEST);
        JPanel pnEast=new JPanel();
        pnEast.setBackground(Color.BLUE);
        JLabel lb4=new JLabel("EAST");
        lb4.setFont(font);
        pnEast.add(lb4);
        pnBoder.add(pnEast,BorderLayout.EAST);
        JPanel pnCenter=new JPanel();
        pnCenter.setBackground(Color.YELLOW);
        JLabel lb5=new JLabel("CENTER");
        lb5.setFont(font);
        pnCenter.add(lb5);
        pnBoder.add(pnCenter,BorderLayout.CENTER);
        getContentPane().add(pnBoder);
    }
    public static void main(String[] args) {
        new bt4();
    }
}
