package lab4;

import java.util.ArrayList;
import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        ArrayList<SanPham> arrayListsp= new ArrayList<>();
        SanPham sp;
        System.out.print("số lượng sản phẩm: ");
        int n=s.nextInt();
        for(int i=0;i<n ;i++)
        {
            System.out.println("Sản phẩm "+(i+1));
            sp=new SanPham();
            sp.nhap();
            arrayListsp.add(sp);
        }
        System.out.println("-------------------------------------------------------------");
        for(int i=0;i<n;i++)
        {
            System.out.println("Sản phẩm "+(i+1));
            arrayListsp.get(i).xuat();

        }
    }
}
