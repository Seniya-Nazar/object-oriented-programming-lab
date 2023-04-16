package pg2;

import java.util.Scanner;

class employee{
	int empid,salary;
	String name,address;
	public employee(int empid,String name,String address,int salary) {
		this.empid=empid;
		this.name=name;
		this.address=address;
		this.salary=salary;
	}
}

class teachers extends employee{
	String department,subject;
	public teachers(int empid,String name,String address,String department,String subject,int salary) {
		super(empid,name,address,salary);
		this.department=department;
		this.subject=subject;
	}
	
	public void display() {
		System.out.println("Employee ID:" +empid + "\nEmployee Name:" +  name + "\nAddress:" + address + "\nDepartment:" + department + "\nSubject:"+ subject +  "\nSalary:" + salary);
	}
	
}

public class main {
	
	public static void main(String a[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of teachers:");
		int n=s.nextInt();
		teachers[] objarr= new teachers[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter the Employee ID, NAME,ADDRESS, DEPARTMENT, SUBJECT,SALARY");
			objarr[i]=new teachers(s.nextInt(),s.next(),s.next(),s.next(),s.next(),s.nextInt());
		}
		for(int i=0;i<n;i++) {
			objarr[i].display();
		}
	}

}
