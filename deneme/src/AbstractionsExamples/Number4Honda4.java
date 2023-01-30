package AbstractionsExamples;


	class Number4Honda4 extends Number4Bike{

		@Override
		void run() {
			System.out.println("running safely");
		}
		
		public static void main(String args[]){  
			
			//Number4Bike obj=new Number4Bike();//cannot instantiate
			Number4Bike obj=new  Number4Honda4 ();
			obj.run();
		}
		
		
	}


