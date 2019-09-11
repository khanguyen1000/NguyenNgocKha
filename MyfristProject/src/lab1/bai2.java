package lab1;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Dài:");
        float dai= s.nextFloat();
        System.out.println("Rộng:");
        float rong=s.nextFloat();
        float cv=(dai+rong)*2;
        float dt=dai*rong;
        float cnn=Math.min(dai,rong);
        System.out.println("Chu vi:"+cv+"\n Diện Tích: "+dt+"\n Cạnh nhỏ nhất:"+cnn);
    }
}
