package lab2;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        for (; ; ) {
            Scanner s = new Scanner(System.in);

            System.out.println("----------------------------");
            System.out.println("1.Giải phương trình bậc nhất");
            System.out.println("2.Giải phương trình bậc Hai");
            System.out.println("3.Tính Tiền Điện");
            System.out.println("4.Exit");
            System.out.println("----------------------------");
            System.out.print("Chọn Chức năng:");
            int k = s.nextInt();
            switch (k) {
                case 1: {
                    bt1 bt1 = new bt1();
                    bt1.Ptbac1();
                    break;
                }
                case 2: {
                    bai2 bai2 = new bai2();
                    bai2.PtBac2();
                    break;
                }
                case 3: {
                    bai3 bai3 = new bai3();
                    bai3.TienDien();
                    break;
                }
            }
            if (k == 4){
                System.out.println("tks");
                break;}
        }
        System.exit(0);
    }
}
