package org.single;

public class Employee{
public void employeeName() {
System.out.println("Employee");
}
	public static void main(String[] args) {
	Employee e = new Employee();
	e.employeeName();
	Single.getInstance().company();
	}
	
	
}
