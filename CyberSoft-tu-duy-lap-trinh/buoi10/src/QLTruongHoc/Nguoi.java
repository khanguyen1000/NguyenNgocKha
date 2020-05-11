package QLTruongHoc;

public class Nguoi {
	//attributes
	protected String hoTen;
	protected int namSinh;
	protected String noiSinh;
	protected String diaChi;
	//constructors
	public Nguoi() {
		this.hoTen = "";
		this.namSinh = 0;
		this.noiSinh = "";
		this.diaChi = "";
	}
	public Nguoi(String hoTen, int namSinh, String noiSinh, String diaChi) {
		this.hoTen = hoTen;
		this.namSinh = namSinh;
		this.noiSinh = noiSinh;
		this.diaChi = diaChi;
	}
	//get set 
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public int getNamSinh() {
		return namSinh;
	}
	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}
	public String getNoiSinh() {
		return noiSinh;
	}
	public void setNoiSinh(String noiSinh) {
		this.noiSinh = noiSinh;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	//methods
	public void nhap() {
		
	}
	public void xuat() {
		System.out.println("họ tên : "+this.hoTen);
		System.out.println("năm sinh : "+this.namSinh);
		System.out.println("nơi sinh : "+this.noiSinh);
		System.out.println("địa chỉ : "+this.diaChi);
	}

	
	
}
