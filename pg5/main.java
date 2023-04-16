package pg5;

import java.util.Scanner;

class student{
	int studid;
	String name,address;
	public student(int studid,String name,String address) {
		this.studid=studid;
		this.name=name;
		this.address=address;
	}
}

class sports extends student{
	String sports_name;
	int score;
	public sports(int studid,String name,String address,String sports_name,int score) {
		super(studid,name,address);
		this.sports_name=sports_name;
		this.score=score;
	}
}

class result extends sports{
	int mark;
	public result(int studid,String name,String address,int mark,String sports_name,int score) {
		super(studid,name,address,sports_name,score);
		this.mark=mark;
	}
	public void display() {
		System.out.println("............ACADEMIC AND SPORTS SCORE OF A STUDENT............");
		System.out.println("STUDENT ID:"+studid+ "\nNAME:"+name+ "\nADDRESS:"+address+ "\nMARK:"+mark+ "\nSPORTS NAME:"+sports_name+ "\nSCORE:"+score);
	}
}

public class main {
	
	public static void main(String a[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("ENTER THE STUDENT ID \nNAME \nADDRESS \nMARK \nSPORTS NAME \nSCORE");
		result obj = new result(s.nextInt(),s.next(),s.next(),s.nextInt(),s.next(),s.nextInt());
		obj.display();
	}

}