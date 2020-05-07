package student;

import java.util.Scanner;

public class Student {
	//thuộc tính attribute
	
	private String name ;
	private double toan;
	private double van;
	
	//phương thức khởi tạo
	
	public Student() {
		this.name="";
		this.toan=0;
		this.van=0;
	}
	public Student(String name ,double toan, double van) {
		this.name =name;
		this.toan=toan;
		this.van=van;
	}
	//phương thức get set 
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public double getToan() {
		return this.toan;
	}
	public void setToan(double toan) {
		this.toan=toan;
	}
	public double getVan() {
		return this.van;
	}
	public void setVan(double van ) {
		this.van=van;
	}
	//phương thức nghiệp vụ methods
	public double tinhDiemTB() {
		return (this.toan+this.van)/2;
	}
	public String xeLoai() {
		String loai=null;
		double dtb=tinhDiemTB();
		if(dtb<5) {
			loai="yếu";
		}else if (dtb>=5&& dtb<7) {
			loai="tb";
		
		}else if (dtb>=7 && dtb<8) {
			loai= "khá";
		}else if (dtb>=8) {
			loai="giỏi";
		}
		return loai;
	}

}
