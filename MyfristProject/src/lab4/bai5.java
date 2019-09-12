package lab4;

import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("số lượng sản phẩm: ");
        int n=s.nextInt();
        SanPham[] sp=new SanPham[n];
        for(int i=0;i<n;i++)
        {
            sp[i].nhap();
        }
        System.out.println("-------------------------------------------------------------");
        for (int i=0;i<n;i++)
            sp[i].xuat();
    }
}
