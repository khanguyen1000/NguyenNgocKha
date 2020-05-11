/**
 * lớp Nhân viên thừa kế bởi lớp nhân sự và có 1 thuộc tính riêng là 'trưởng phòng quản lý'
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

public class NhanVien extends NhanSu {
	
	//attributes
	private String TPQL;
	
	//constructors
	public NhanVien() {
		super();
		TPQL = null;
	}
	
	public NhanVien(String maSo, String hoTen, String sdt, int soNgayLam, String chucVu, double luong1Ngay,String tPQL) {
		super(maSo, hoTen, sdt, soNgayLam, chucVu, luong1Ngay);
		TPQL = tPQL;
	}

	//get set 
	public String getTPQL() {
		return TPQL;
	}
	public void setTPQL(String tPQL) {
		TPQL = tPQL;
	}
	
	//methods
	public void nhap() {
		Scanner sn=new Scanner(System.in);
		super.nhap();
		System.out.print("Trưởng phòng quản lý : ");
		this.TPQL=sn.nextLine();
	}
	public void xuat() {
		super.xuat();
		System.out.println("trưởng phòng quản lý : "+this.TPQL);
		
	}
	public double TinhLuong() {
		return super.cachTinhLuong();
	}

}
