package pg3;

import java.util.Scanner;

class person{
	String name, gender, address;
	int age;
	public person(String name, String gender, String address, int age) {
		this.name=name;
		this.gender=gender;
		this.address=address;
		this.age=age;
	}
}

class employee extends person{
	int empid,salary;
	String company_name,qualification;
	public employee(int empid,String name, String gender, String address, int age, String company_name, String qualification, int salary) {
		super(name,gender,address,age);
		this.empid=empid;
		this.company_name=company_name;
		this.qualification=qualification;
		this.salary=salary;
	}
}

class teacher extends employee{
	int teacherid;
	String subject,department;
	public teacher(int empid,String name, String gender, String address, int age, String company_name, String qualification, int salary, int teacherid, String subject, String department) {
		super(empid,name,gender,address,age,company_name,qualification,salary);
		this.teacherid=teacherid;
		this.subject=subject;
		this.department=department;
	}
	
	public void display() {
		System.out.println("Employee ID:"+ empid + "\nName:"+name +
				"\nGender:"+gender +"\nAddress:"+address+
				"\nAge:"+age+"\nCompany Name:"+company_name+ 
				"\nQualification:"+qualification+ "\nSalary:"+salary+ 
				"\nTeacher iD:"+teacherid+ "\nSubject:"+subject+ 
				"\nDepartment:"+department);
	}
	
}

public class main {
	
	public static void main(String a[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of Teachers:");
		int n=s.nextInt();
		teacher[] objarr = new teacher[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter the Employee ID, Name, Gender, Address, Age, Company Name, Qualification, Salary, Teacher iD, Subject, Department");
			objarr[i]= new teacher(s.nextInt(),s.next(),s.next(),s.next(),s.nextInt(),s.next(),s.next(),s.nextInt(),s.nextInt(),s.next(),s.next());
		}
		for(int i=0;i<n;i++) {
			objarr[i].display();
		}
	}

}
