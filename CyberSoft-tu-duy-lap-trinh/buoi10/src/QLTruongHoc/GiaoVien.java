package QLTruongHoc;

public class GiaoVien extends Nguoi{
	//attributes
	private int namBatDauDay;
	private String chuyenMon;
	//constructors
	public GiaoVien() {
		super();
		this.namBatDauDay = 0;
		this.chuyenMon = "";
	}
	public GiaoVien(String hoTen, int namSinh, String noiSinh, String diaChi,int namBatDauDay, String chuyenMon) {
		super(hoTen, namSinh, noiSinh, diaChi);
		this.namBatDauDay = namBatDauDay;
		this.chuyenMon = chuyenMon;
	}
	//get set 
	public int getNamBatDauDay() {
		return namBatDauDay;
	}
	public void setNamBatDauDay(int namBatDauDay) {
		this.namBatDauDay = namBatDauDay;
	}
	public String getChuyenMon() {
		return chuyenMon;
	}
	public void setChuyenMon(String chuyenMon) {
		this.chuyenMon = chuyenMon;
	}
	//methods
	public void nhap() {
		
	}
	public void xuat() {
		super.xuat();
		System.out.println("năm bắt đầu : "+this.namBatDauDay );
		System.out.println("chuyên môn : "+this.chuyenMon);
	}
	public int tinhThamNien() {
		int namhienhanh=2020;
		return namhienhanh-this.namBatDauDay;
		
	}
}
