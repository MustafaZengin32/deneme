package Interface;

public interface Number5I08_InterfaceStaticVeDefaultMethods {

	void method1();
    void method2();
    
    public default void method3(){
        System.out.println("interface icindeki body'li default method");
    }

    public static void method4(){
        System.out.println("Interface icindeki body'li static method");
    }
}
