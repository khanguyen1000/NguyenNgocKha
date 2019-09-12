package lab1;

import java.util.Scanner;

public class bai4{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print(" hệ số a x^2:"); float a= s.nextFloat();
        System.out.print(" hệ số b x  :"); float b= s.nextFloat();
        System.out.print(" hệ số c    :"); float c= s.nextFloat();
        float delta= (float) (Math.pow(b,2)-4*a*c);
        System.out.println("delta:"+delta+"\n Căn bậc 2 của delta:"+Math.sqrt(delta));
    }
}
