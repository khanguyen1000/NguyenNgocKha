package lab3;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print(" Bảng cửu chương cần tìm: "); int a=s.nextInt();
        for(int i=1;i<10;i++)
        {
            System.out.println(+a+" x "+i+" = "+a*i);
        }
    }
}
