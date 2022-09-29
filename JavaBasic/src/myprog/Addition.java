package myprog;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		int a,b,sum; 
    Scanner sc = new Scanner (System.in);
    System.out.println("enter 1st num:");
    a= sc.nextInt();
    System.out.println("enter 2nd num:");
    b= sc.nextInt();
    sc.close();
    sum=a+b;
    System.out.println("sum of those num:"+sum);
	}

}
