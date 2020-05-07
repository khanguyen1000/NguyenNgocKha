package onClass;

import java.util.LinkedList;
import java.util.Scanner;

public class DanNhapList {

	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		// trong java có 2 loạị list, là LinkedList và ArrayList
		LinkedList<Integer> listSo = new LinkedList<Integer>();
		for(int i=0;i<5;i++) {
			System.out.println("nhap k:");
			int k=sn.nextInt();
			listSo.add(k);
		}
		listSo.remove(0);
		System.out.println(listSo.get(0));
		
	}

}
