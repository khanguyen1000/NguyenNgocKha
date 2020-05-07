package phanSO;

public class main {

	public static void main(String[] args) {
		
		PhanSo ps1=new PhanSo(3,4);
		PhanSo ps2=new PhanSo(2,3);
		PhanSo tong=new PhanSo();
		tong= ps1.nhan(ps2);
		
		tong.xuat();

	}
	
}
