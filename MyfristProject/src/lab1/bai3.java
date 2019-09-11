package lab1;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Nhập cạnh a của khối lập phương :");
        float a= s.nextFloat();
        System.out.println("Thể Tích của khối lập phương là:"+Math.pow(a,3));
    }
}
