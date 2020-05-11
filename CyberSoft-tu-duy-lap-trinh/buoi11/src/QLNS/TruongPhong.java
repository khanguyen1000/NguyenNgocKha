/**
 * lớp Trưởng phòng  thừa kế bởi lớp nhân sự và có 1 thuộc tính riêng là 'Số lượng nhân viên quản lý'
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

public class TruongPhong extends NhanSu {
	//attributes 
	private int SLNVQL;
	
	//constructors
	public TruongPhong() {
		super();
		SLNVQL = 0;
	}
	
	public TruongPhong(String maSo, String hoTen, String sdt, int soNgayLam, String chucVu, double luong1Ngay,int sLNVQL) {
		super(maSo, hoTen, sdt, soNgayLam, chucVu, luong1Ngay);
		SLNVQL = sLNVQL;
	}

	//get set
	public int getSLNVQL() {
		return SLNVQL;
	}

	public void setSLNVQL(int sLNVQL) {
		SLNVQL = sLNVQL;
	}
	
	//methods
	public void nhap() {
		super.nhap();
		Scanner sn=new Scanner(System.in);
		System.out.print("nhập số lương nhân viên quản lý : ");
		this.SLNVQL=Integer.parseInt(sn.nextLine());
	}
	public void xuat() {
		super.xuat();
		System.out.println("Số lượng nhân viên quản lý : "+this.SLNVQL);
		
	}
	public double TinhLuong() {
		return (super.cachTinhLuong()+100*this.SLNVQL);
	}
}
