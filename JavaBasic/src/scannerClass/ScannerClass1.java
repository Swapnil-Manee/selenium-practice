package scannerClass;
import java.util.Scanner;
public class ScannerClass1 {
	public static void main(String[] args) {

//		int age=10;
//		double salary=2566.36;
//		String name="Pune";

		// Object creation of Scanner class
		Scanner scnRef = new Scanner(System.in);//==> it means system se inputlena there is no default cons.
		int age;
		double salary;
		String name;
		boolean valid;
		/* Initialization of variable using Scanner class */
		System.out.println("Enter age value from console");
		age = scnRef.nextInt();
		System.out.println("Enter salary value from console");
		salary = scnRef.nextDouble();
		System.out.println("Enter name value from console");
		name = scnRef.next();
		System.out.println("Enter true/false value from console");
		valid = scnRef.nextBoolean();
		System.out.println("age: " + age);
		System.out.println("salary: " + salary);
		System.out.println("name: " + name);
		System.out.println("valid: " + valid);
		int num1, num2;
		System.out.println("Enter num1: ");
		num1 = scnRef.nextInt();
		System.out.println("Enter num2: ");
		num2 = scnRef.nextInt();
		char op;
		System.out.println("Enter operator: ");
		op = scnRef.next().charAt(0); // this is used for read single character 
		System.out.println("Addition of two numbers: " + addNumber(op, num1, num2));
		System.out.println("*****************************************");
	}

	static int addNumber(char op, int num1, int num2) {
		if (op == '+') {
			return num1 + num2;
		} else {
			return 0;
		}
	}
}
