package Interface;

public interface Number1I06_Interface {

	void method1();

    default void method2() {
        System.out.println("interface default method");
    }

    static void method3() {
        System.out.println("interface static method");
    }
}
