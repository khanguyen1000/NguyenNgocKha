package lab4;

import java.util.Scanner;

public class SanPham {
    private String tenSp;
    private double donGia;
    private double giamGia;
    public SanPham(){};
    public SanPham(String tenSp,double donGia,double giamGia){
        this.tenSp=tenSp;
        this.donGia=donGia;
        this.giamGia=giamGia;
    };
    public SanPham(String tenSp,double donGia){
        this.tenSp=tenSp;
        this.donGia=donGia;
        this.giamGia=0;
    };
    public String gettenSp() {
        return tenSp;
    }
    public void setTenSp(String hoTen) {
        this.tenSp = tenSp;
    }
    public double getDonGia() {
        return donGia;
    }
    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    public double getGiamGia() {
        return giamGia;
    }
    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }
    private double getThueNhapKhau(){
        return 0.1*donGia;
    }
    public void xuat(){
        System.out.println("Tên Sản Phẩm: "+tenSp);
        System.out.println("Đơn Giá: "+donGia);
        System.out.println("Giảm Giá: "+giamGia);
        System.out.println("Thuế Nhập Khẩu: "+getThueNhapKhau());
    }
    Scanner s=new Scanner(System.in);
    public void nhap(){

        System.out.print("Tên sản phẩm:");
        tenSp=s.nextLine();
        System.out.print("Đơn giá:");
        donGia=s.nextFloat();
        System.out.print("Giảm giá:");
        giamGia=s.nextFloat();
    }
}
