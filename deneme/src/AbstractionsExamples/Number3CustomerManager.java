package AbstractionsExamples;

public class Number3CustomerManager {
	//getCustomers metotunun icindeki BaseDatabaseManager extends edilen siniflarin 
		//referansini tutar. Dolayisiyla main3 ana classinda CustomerManagerin metotu
		//cagrildigi zaman icinde OracleDatabaseManager veya SqlServerManager 
		//new lenerek cagirabiliriz.
	
	public void getCustomers(Number3BaseDatabaseManager baseDatabaseManager) {
		baseDatabaseManager.getData();
	
	}
	

}
