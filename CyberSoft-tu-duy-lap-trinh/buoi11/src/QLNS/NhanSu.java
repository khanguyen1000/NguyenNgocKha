/**
 * lớp Nhân sự gồm MaSo ,Họ tên , sdt ,số ngày làm  , lương 1 ngày ,cách tính lương
 * 
 *  @author kha_ng
 *  
 *  ngày tạo : 9-5-2020
 *  
 *  phiên bản :1.0
 * 
 */
package QLNS;

import java.util.Scanner;

public class NhanSu {
	
	//attributes 
	private String maSo;
	protected String hoTen;
	protected String sdt ;
	private int soNgayLam;
	private String chucVu;
	protected double luong1Ngay;	
	
	//constructors
	public NhanSu() {
		this.maSo = null;
		this.hoTen = null;
		this.sdt = null;
		this.soNgayLam = 0;
		this.chucVu = null;
		this.luong1Ngay = 0;
	}
	
	public NhanSu(String maSo, String hoTen, String sdt, int soNgayLam, String chucVu, double luong1Ngay) {
		this.maSo = maSo;
		this.hoTen = hoTen;
		this.sdt = sdt;
		this.soNgayLam = soNgayLam;
		this.chucVu = chucVu;
		this.luong1Ngay = luong1Ngay;
	}

	public String getMaSo() {
		return maSo;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	public int getSoNgayLam() {
		return soNgayLam;
	}
	public String getChucVu() {
		return chucVu;
	}
	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}
	public double getLuong1Ngay() {
		return luong1Ngay;
	}
	//methods
	public void nhap() {
		Scanner sn =new Scanner(System.in);
		System.out.println("______________________________________");
		System.out.println();
		System.out.print("nhập Mã số : ");
		this.maSo=sn.nextLine();
		System.out.println("----------------------");
		System.out.println();
		System.out.print("họ tên : ");
		this.hoTen=sn.nextLine();
		System.out.println("----------------------");
		System.out.println();
		System.out.print("số điện thoại : ");
		this.sdt=sn.nextLine();
		System.out.println("----------------------");
		System.out.println();
		System.out.print("số ngày làm : ");
		this.soNgayLam=Integer.parseInt(sn.nextLine());
		System.out.println("----------------------");
		System.out.println();
	}
	public void xuat() {
		System.out.println("Mã số : "+this.maSo );
		System.out.println("họ tên : "+this.hoTen);
		System.out.println("số điện thoại : "+this.sdt);
		System.out.println("số ngày làm : "+this.soNgayLam);
		System.out.println("lương 1 ngày : "+this.luong1Ngay);
	}
	
	public double cachTinhLuong() {
		return this.luong1Ngay*this.soNgayLam;
	}
	
	
}
