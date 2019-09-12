package lab4;

public class bai3 {
    public static void main(String[] args) {
        String tenSp; double donGia; double giamGia;
        SanPham sp1=new SanPham();
        SanPham sp2=new SanPham();
        System.out.println("sản phẩm 1:");
        sp1.nhap();
        System.out.println("Sản Phẩm 2:");
        sp2.nhap();
        sp1=new SanPham(sp1.gettenSp(),sp1.getDonGia(),sp1.getGiamGia());
        sp2=new SanPham(sp2.gettenSp(),sp2.getDonGia());
        System.out.println("sản phẩm giảm giá:");
        sp1.xuat();
        System.out.println("Sản Phẩm Không giảm giá:");
        sp2.xuat(); }
}
