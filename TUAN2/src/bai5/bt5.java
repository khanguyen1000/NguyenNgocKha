package bai5;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class bt5 extends JFrame {
    public bt5(){
        setVisible(true);
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel pnBoder=new JPanel();
        pnBoder.setLayout(new BorderLayout());

        JPanel pnNorth =new JPanel();
        pnNorth.setBackground(Color.GRAY);

        JLabel lb1=new JLabel("GIAI PHUONG TRINH BAC 2");
        Font font =new Font("arial",Font.BOLD,25);
        lb1.setFont(font);
        lb1.setForeground(Color.cyan);
        pnNorth.add(lb1);
        pnBoder.add(pnNorth,BorderLayout.NORTH);

        JPanel pnCenter=new JPanel();
        pnCenter.setLayout(new BoxLayout(pnCenter,BoxLayout.Y_AXIS));
        Border bor=BorderFactory.createLineBorder(Color.red);
        TitledBorder titledBorder=new TitledBorder(bor,"Nhap a b c : ");
        pnCenter.setBorder(titledBorder);

        JPanel pna=new JPanel();
        JLabel lbA=new JLabel("a :");
         JTextField txtSoa= new JTextField();
        pna.add(lbA); pna.add(txtSoa);
        pnCenter.add(pna);

        JPanel pnb=new JPanel();
        JLabel lbB=new JLabel("b :");
        JTextField txtSob= new JTextField(15);
        pnb.add(lbB); pnb.add(txtSob);
        pnCenter.add(pnb);

        JPanel pnc=new JPanel();
        JLabel lbC=new JLabel("c :");
        JTextField txtSoc= new JTextField(15);
        pnc.add(lbC);pnc.add(txtSoc);
        pnCenter.add(pnc);

        JPanel pnkq=new JPanel();
        JLabel kq=new JLabel("ket qua :");
        JTextField txtKetqua=new JTextField(15);
        txtKetqua.setEnabled(false);
        pnkq.add(kq); pnkq.add(txtKetqua);
        pnCenter.add(pnkq);
        pnBoder.add(pnCenter,BorderLayout.CENTER);

        JPanel pnSouth=new JPanel();
        TitledBorder tbd=new TitledBorder(bor,"Chon thao tac :");
        pnSouth.setBorder(tbd);
        pnSouth.setLayout(new FlowLayout());
        JButton btnGiai=new JButton("Giai");
        JButton btnXoaTrang=new JButton("Xoa Trang");
        JButton btnThoat=new JButton("Thoat");
        pnSouth.add(btnGiai);pnSouth.add(btnXoaTrang);pnSouth.add(btnThoat);
        pnBoder.add(pnSouth,BorderLayout.SOUTH);

        //button giai
        btnGiai.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                double a = Double.parseDouble(txtSoa.getText());
                double b = Double.parseDouble(txtSob.getText());
                double c = Double.parseDouble(txtSoc.getText());
                double delta = Math.pow(b, 2) - ( 4 * a * c );
                double x1, x2;
                if (a == 0) {
                    if(b == 0) {
                        if(c == 0)
                            txtKetqua.setText("Pt co vo so nghiem");
                        else
                            txtKetqua.setText("Pt vo nghiem");
                    }
                    else
                        txtKetqua.setText("Pt co nghiem x = " + (-c / b));
                }
                else if (delta < 0)
                    txtKetqua.setText("Pt vo nghiem");
                else if (delta == 0)
                    txtKetqua.setText("Pt co nghiem kep x= " + (- b / 2 * a));
                else {
                    x1 = (- b + Math.sqrt(delta) / (2 * a));
                    x2 = (- b - Math.sqrt(delta) / (2 * a));
                    txtKetqua.setText("Pt co 2 nghiem phan biet: x1 = " + x1 + ", x2 = " + x2);
                }
            }
        });
        //button xoa trang
        btnXoaTrang.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                txtSoa.setText("");
                txtSob.setText("");
                txtSoc.setText("");
                txtKetqua.setText("");
            }
        });

        //button thoat
        btnThoat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });
        add(pnBoder);
    }

    public static void main(String[] args) {
        new bt5();
    }
}
