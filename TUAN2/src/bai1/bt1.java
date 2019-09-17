package bai1;

import javax.swing.*;

public class bt1 extends JFrame {
    public bt1( String title){

        super(title);
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        new bt1("Demo Windows");
    }
}
