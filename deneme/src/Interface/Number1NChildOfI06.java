package Interface;

public class Number1NChildOfI06 implements Number1I06_Interface {

	public Number1NChildOfI06() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
        Number1I06_Interface.method3();
        Number1I06_Interface a=new Number1NChildOfI06();
        
        
        Number1NChildOfI06 obj = new Number1NChildOfI06();
        obj.method2();
    }

}
