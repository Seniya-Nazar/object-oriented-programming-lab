package pg6;

import java.util.Scanner;

interface shapes{
	float area();
	float perimeter();
}

class circle implements shapes{
	float r;
	public circle(float r) {
		this.r=r;
	}
	public float area() {
		return 3.14f*r*r;
	}
	public float perimeter() {
		return 2*3.14f*r;
	}
}

class rectangle implements shapes{
	float l,b;
	public rectangle(float l,float b) {
		this.l=l;
		this.b=b;
	}
	public float area() {
		return l*b;
	}
	public float perimeter() {
		return 2*(l+b);
	}
}

public class main {
	
	public static void main(String ar[]) {
		Scanner s= new Scanner(System.in);
		int ch;
		float result;
		do {
			System.out.println("ENTER THE CHOICE: \n1.CIRCLE \n2.RECTANGLE");
			ch=s.nextInt();
			switch(ch) {
			case 0:
				System.out.println("Exit");
			case 1: 
				System.out.println("ENTER THE RADIUS:");
				circle cir=new circle(s.nextFloat());				
				System.out.println("Area:"+cir.area());
				System.out.println("Perimeter:"+cir.perimeter());
				break;
				
			case 2: 
				System.out.println("ENTER THE LENGTH AND BREADTH:");
				rectangle rect=new rectangle(s.nextFloat(),s.nextFloat());
				System.out.println("Area:"+rect.area());
				System.out.println("Perimeter:"+rect.perimeter());
				break;
				
				default:
					System.out.println("ENTER A VALID CHOICE!!!!");
			
			}
		}while(ch!=0);
	}
	
}
