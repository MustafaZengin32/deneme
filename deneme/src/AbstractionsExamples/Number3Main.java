package AbstractionsExamples;

public class Number3Main {

	public static void main(String[] args) {
		
		Number3CustomerManager customerManager = new Number3CustomerManager();
		customerManager.getCustomers(new Number3OracleDatabaseManager());
		customerManager.getCustomers(new Number3SqlServerDatabaseManager());
		
		
		//Aslinda asagidaki islemler yerine yukaridaki ayni
		//Number3BaseDatabaseManager databaseManager= new Number3OracleDatabaseManager();
		
		//Number3BaseDatabaseManager databaseManager2= new Number3SqlServerDatabaseManager();
		
		//databaseManager.getData();
		//databaseManager2.getData();
		
		
		
}
}
