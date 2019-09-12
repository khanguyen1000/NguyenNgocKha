package lab2;

import java.util.Scanner;

public class bai3 {
    public bai3(){};
    public void TienDien() {
        Scanner s=new Scanner(System.in);
        System.out.print("Nhập Số Điện:"); float soDien=s.nextFloat();
        if (soDien<50)
            System.out.println("Tiền:"+soDien*1000);
        else
            System.out.println("Tiền:"+(50*1000+(soDien-50)*1200));
    }
}
