package day26Encapsulation;
class Encap1 {
	private int pincode=413601;
	private double salary= 50000;
	private char grade='D';
	
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
}
public class Example2 {
	public static void main(String[] args) {
		Encap1 d1=new Encap1();
		System.out.println(d1.getPincode());
		System.out.println(d1.getSalary());
		System.out.println(d1.getGrade());
		System.out.println("*************************");	
        d1.setPincode(2471);
        System.out.println(d1.getPincode());
        d1.setSalary(45000);
        System.out.println(d1.getSalary());
        d1.setGrade('E');
        System.out.println(d1.getGrade());
	}
}

