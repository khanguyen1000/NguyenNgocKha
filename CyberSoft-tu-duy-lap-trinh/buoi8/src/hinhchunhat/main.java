package hinhchunhat;

public class main {

	public static void main(String[] args) {
		HinhChuNhat hcn= new HinhChuNhat();
		hcn.nhap();
		hcn.xuat();
		double cv=hcn.tinhChuVi();
		double dt=hcn.tinhDienTich();
		
		System.out.println(" chu vi : "+ cv);
		System.out.println(" diện tích : "+dt);
		

	}

}
