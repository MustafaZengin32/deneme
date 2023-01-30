package Interface;

public interface Number3I03_InterfaceChildOfinterface extends Number3I01_Interface {

	void method1();
	
	// interface bir child parent interface'deki
    // abstract methodu override edebilir ama
    // ikisinin de body'si olmadigindan
    // bu islemin bir anlami yoktur
	
	 int method4();
	 boolean method5();
	
}
