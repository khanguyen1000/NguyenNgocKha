package QLTruongHoc;

public class HocSinh extends Nguoi {
	//attributes
	private double diemToan;
	private double diemVan;
	private double diemNN;
	//constructors
	public HocSinh() {
		super();
		this.diemToan = 0;
		this.diemVan = 0;
		this.diemNN = 0;
	}
	public HocSinh(String hoTen, int namSinh, String noiSinh, String diaChi,double diemToan, double diemVan, double diemNN) {
		super(hoTen, namSinh, noiSinh, diaChi);
		this.diemToan = diemToan;
		this.diemVan = diemVan;
		this.diemNN = diemNN;
	}
	//get set 
	public double getDiemToan() {
		return diemToan;
	}
	public void setDiemToan(double diemToan) {
		this.diemToan = diemToan;
	}
	public double getDiemVan() {
		return diemVan;
	}
	public void setDiemVan(double diemVan) {
		this.diemVan = diemVan;
	}
	public double getDiemNN() {
		return diemNN;
	}
	public void setDiemNN(double diemNN) {
		this.diemNN = diemNN;
	}
	//methods
	public void nhap() {
		
	}
	public void xuat() {
		super.xuat();
		System.out.println("điểm toán : "+this.diemToan);
		System.out.println("điểm văn : "+this.diemVan);
		System.out.println("điểm ngoại ngữ : "+this.diemNN);
	}
	public double TinhDiemTB() {
		return (this.diemToan+this.diemVan+this.diemNN)/3;
	}
	public String xepLoai() {
		String loai=null;
		double dtb=TinhDiemTB();
		if(dtb<5) {
			loai="yếu";
		}else if (dtb>=5&& dtb<7) {
			loai="tb";
		
		}else if (dtb>=7 && dtb<8) {
			loai= "khá";
		}else if (dtb>=8 && dtb<9) {
			loai="giỏi";
		}else if(dtb>=9) {
			loai="xuất sắc";
		}
		return loai;
	}

}
