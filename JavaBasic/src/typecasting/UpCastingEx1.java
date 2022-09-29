package typecasting;
class Come {  
	   void PrintData() {  
	      System.out.println("method of parent class");  
	   }  
	}  
	  
	class Out extends Come {  
	   void PrintData() {  
	      System.out.println("method of child class");  
	   }  
	}  
public class UpCastingEx1 {

	public static void main(String[] args) {
		Come obj1 = (Come) new Out();  
	      Come obj2 = (Come) new Out();   
	      obj1.PrintData();  
	      obj2.PrintData();  
	}

}
