package day27polymorphism;
//Java Runtime Polymorphism Example: Shape
class shape {
	void draw () {
	    System.out.println("drawing...");
	}
}
class Rectangle extends shape {
	void draw () {
		System.out.println("drawing rectangle....");
	}
}
class Circle extends shape {
	void draw () {
		System.out.println("drawing circle....");
	}
}
class Triangle extends shape {
	void draw () {
		System.out.println("drawing triangle");
	}
}
public class RunPolymorphism1 {
public static void main (String args[]) {
	shape s1;
	s1=new Rectangle();
	s1.draw();
	s1=new Circle();
	s1.draw();
	s1=new Triangle();
	s1.draw();
}
	
}
