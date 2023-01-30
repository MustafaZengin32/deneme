package AbstractionsExamples;

public class Number1Main {
	public static void main(String [] args) {
	    Number1Animal mydog=new Number1Dog();
		mydog.animalSound();
		mydog.sleep();
		mydog.hareket();
		System.out.println();
		
		Number1Cat mycat= new Number1Cat();
		mycat.animalSound();
		mycat.sleep();
		mycat.hareket();
		System.out.println();
//		
		Number1Snake mysnake= new Number1Snake();
		mysnake.animalSound();
		mysnake.hareket();
		mysnake.sleep();
		System.out.println();
		
		
		
		
		//Number1Animal myanimal=new Number1Animal();//Cannot instantiate the type Number1Animal 
		
  	}

}
