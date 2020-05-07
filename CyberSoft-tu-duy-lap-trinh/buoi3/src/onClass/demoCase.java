package onClass;

public class demoCase {
public static void main(String[] args) {
	int thang=23; //nếu ko có break thì case sẽ chạy đến các case tiếp theo
	switch(thang) {
	case 1:
	case 2:
	case 3:{
		System.out.println("mùa xuân");
		break;
	}
	case 4:
	case 5:
	case 6:{
		System.out.println("mùa hạ");
		break;
	}
	case 7:
	case 8:
	case 9:{
		System.out.println("mùa thu");
		break;
	}
	case 10:
	case 11:
	case 12:{
		System.out.println("mùa đông");
		break;
	}
	default:{
		System.out.println("xàm");
		break;
	}
	}
	String ten="Nhung";
	switch(ten) {
	case "Nhung":{
		System.out.println(" nhiễm corona mẹ rồi");
		break;
	} 	 
	}
}
}
