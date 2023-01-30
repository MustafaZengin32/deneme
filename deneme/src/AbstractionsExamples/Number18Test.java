package AbstractionsExamples;

public class Number18Test {

	public static void main(String[] args) {
		
		Number18Animal object1 = new Number18Camel("Camel");
        object1.Information("Camels are found in desert.");
        object1.legs();
        object1.eyes();

        System.out.println();

        Number18Animal object2 = new Number18Pigeon("Pigeon");
        object2.Information("Pigeons are intelligent animals.");
        object2.legs();
        object2.eyes();

        System.out.println();

        Number18Animal object3 = new Number18Ant("Ant");
        object3.Information("there are over 12,000 ant species worldwide.");
        object3.legs();
        object3.eyes();

		
		
	}

}
