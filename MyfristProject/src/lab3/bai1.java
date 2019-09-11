package lab3;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("nhập số nguyên a:"); float a= s.nextFloat();
        boolean ok=true;
        for(int i=2;i<a-1;i++)
        {     if(a%i==0)
            {
             ok=false;
             break;
            }
            i++;
        }
        if (ok==true) System.out.println("a là số nguyên");
        else System.out.println("a không phải là số nguyên");
    }
}
