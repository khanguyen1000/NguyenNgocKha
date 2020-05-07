package onClass;

public class test {
	public static void main(String[] args) {
		int x=1,y=0,z=0,h=0;
		x+= 2; 

		y++;

		y+= x++;

		x+= y++; 

		z = y - 4;

		y = z-1; 

		h = ++z;
		
		System.out.println("x= "+x);
		System.out.println("y= "+y);
		System.out.println("z= "+z);
		System.out.println("h= "+h);
	}
}
