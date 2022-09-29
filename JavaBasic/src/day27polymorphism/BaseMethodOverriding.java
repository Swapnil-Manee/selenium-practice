package day27polymorphism;
class Base {
	void show () {
		System.out.println("Base is done");
	}
}
class Top extends Base{
	@Override
	void show () {
		super.show();  // it is used to run super class
		System.out.println("Top is remaning");
	}
}
public class BaseMethodOverriding {
public static void main (String[] args) {
	Base r1=new Top();
	r1.show();
	
}
}
// in inheritance we always make sub class obj 