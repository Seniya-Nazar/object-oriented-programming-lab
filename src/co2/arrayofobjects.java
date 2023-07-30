package co2;
import java.util.Scanner;

public class arrayofobjects {
public static int searcher(employee[] emp, int empno) {
for (int i = 0; i < emp.length; i++) {
if (emp[i].eno == empno) {
return i;
}
}
return -1;
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("enter the number of employee ");
int n = sc.nextInt();
employee[] emp = new employee[n];
for (int i = 0; i < n; i++) {

System.out.println("enter the details of employee " + (i + 1));
System.out.println("enter the emp no");
int eno = sc.nextInt();
System.out.println("enter the emp name");
String ename = sc.next();
System.out.println("enter the salary");
int esalary = sc.nextInt();
emp[i] = new employee(eno, ename, esalary);
}
for (int i = 0; i < n; i++) {
System.out.println(emp[i].eno + " " + emp[i].ename + " " + emp[i].esalary);
}
System.out.println("enter the empno to be searched");
int empno = sc.nextInt();
int index = searcher(emp, empno);
if (index == -1) {
System.out.println("Employee not found");
} else {
System.out.println(emp[index].eno + " " + emp[index].ename + " " +
emp[index].esalary);
}
}
}