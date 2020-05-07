package hinhchunhat;

import java.util.Scanner;

public class HinhChuNhat {
	//attribute
	private double chieuDai;
	private double chieuRong;
	//constructors
	public HinhChuNhat() {
		
	}
	public HinhChuNhat(double cd,double cr) {
		this.chieuDai=cd;
		this.chieuRong=cr;
	}
	//get set 
	
	//methods
	public void nhap() {
		Scanner sn=new Scanner(System.in);
		System.out.println("Nhập chiều dài :");
		this.chieuDai=sn.nextDouble();
		System.out.println("Nhập chiều rộng :");
		this.chieuRong=sn.nextDouble();
	}
	public void xuat() {
		System.out.println("chiều dài "+ this.chieuDai);
		System.out.println("chiều rộng " + this.chieuRong);
	}
	public double tinhChuVi() {
			return (this.chieuDai+this.chieuRong)*2;
	}
	public double tinhDienTich() {
		return this.chieuDai*this.chieuRong;
	}
}
