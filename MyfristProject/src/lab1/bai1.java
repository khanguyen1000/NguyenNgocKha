package lab1;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Nhập Họ Tên:");
        String hoTen =s.nextLine();
        System.out.println("Nhập Điểm:");
        float diem=s.nextFloat();
        System.out.println("Học Sinh : "+hoTen+"\nĐiểm: "+diem);

    }
}
