package phanSO;

public class PhanSo {
	// attribute
	private int tu;
	private int mau;

	// constructors
	public PhanSo() {
		this.tu = 4;
		this.mau = 1;
	}

	public PhanSo(int tu, int mau) {
		this.tu = tu;
		this.mau = mau;
	}

	// get set
	public int getTu() {
		return this.tu;
	}

	public int getMau() {
		return this.mau;
	}

	// methods
	public void xuat() {
		System.out.println(this.tu + " / " + this.mau);
	}

	public PhanSo cong(PhanSo ps2) {
		PhanSo tong = new PhanSo();
		tong.tu = this.tu * ps2.mau + ps2.tu * this.mau;
		tong.mau = this.mau * ps2.mau;
		
		int ucln=timUCLN(tong.tu,tong.mau);
		
		PhanSo kq=new PhanSo();
		
		kq.tu=tong.tu/ucln;
		kq.mau=tong.mau/ucln;
		
		return kq;
	}
	private int timUCLN(int a,int b) {
		int ucln=1;
		a=Math.abs(a);
		b=Math.abs(b);
		while(a!=b) {
			if(a>b){
				a=a-b;
			}else
				b=b-a;
		}
		ucln=a;
		return ucln;
	}
	public PhanSo tru(PhanSo ps2) {
		PhanSo tru = new PhanSo();
		tru.tu = this.tu * ps2.mau - ps2.tu * this.mau;
		tru.mau = this.mau * ps2.mau;
		
		int ucln=timUCLN(tru.tu,tru.mau);
		PhanSo kq=new PhanSo();
		kq.tu=tru.tu/ucln;
		kq.mau=tru.mau/ucln;
		
		return kq;
	}

	public PhanSo nhan(PhanSo ps2) {
		PhanSo nhan = new PhanSo();
		nhan.tu = this.tu * ps2.tu;
		nhan.mau = this.mau * ps2.mau;
		int ucln=timUCLN(nhan.tu,nhan.mau);
		PhanSo kq=new PhanSo();
		kq.tu=nhan.tu/ucln;
		kq.mau=nhan.mau/ucln;
		
		return kq;
	}

	public PhanSo chia(PhanSo ps2) {
		PhanSo chia = new PhanSo();
		chia.tu = this.tu * ps2.mau;
		chia.mau = this.mau * ps2.tu;
		int ucln=timUCLN(chia.tu,chia.mau);
		PhanSo kq=new PhanSo();
		kq.tu=chia.tu/ucln;
		kq.mau=chia.mau/ucln;
		
		return kq;
	}

}
