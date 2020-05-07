package suaBT;

import java.util.Scanner;

public class bai7_suaBT {

	public static void main(String[] args) {
		//đầu vào
		Scanner sn=new Scanner(System.in);
		int lua_chon_ng_choi;
		int soluot = 0;
		int nguoi = 0, may = 0, hoa = 0;
		do {
		int lua_chon_cua_may = (int) (Math.random() * 3 + 1);
		//nhap dữ liệu
		System.out.println("0-thoát 1-bao 2-búa 3-kéo");
		System.out.println("mời bạn nhập ");
		lua_chon_ng_choi=sn.nextInt();
		if(lua_chon_ng_choi==0) {
			System.out.println("kết quả ");
			System.out.println("tỷ số "+may+" : "+nguoi);
			break;
		}else if(lua_chon_ng_choi<=3 && lua_chon_ng_choi>=1) {
			
			if(lua_chon_cua_may==lua_chon_ng_choi) {
				System.out.println("hoà");
				hoa++;
			}else if((lua_chon_cua_may==1 && lua_chon_ng_choi==2) 
					|| (lua_chon_cua_may==2&& lua_chon_ng_choi==3)
					||(lua_chon_cua_may==3&& lua_chon_ng_choi==1)) {
				System.out.println("nguoi thắng");
				nguoi++;
			}else {
				System.out.println("máy thắng ");
				may++;
			}
		}
		}while(true);
	}

}
