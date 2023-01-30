package AbstractionsExamples;

public class Number2Main {
	
	public static void main(String [] args) {
	
		Number2Worker worker=new Number2Worker();
		
		worker.isim="Ali";
		worker.soyIsim="Can";
		
		worker.saatUcreti=worker.saatUcreti();
		worker.aylikCalismaSuresi=worker.aylikCalismaSuresi();
		worker.maas=worker.maas(worker.maas, worker.aylikCalismaSuresi);
		System.out.println(worker); 
		
		 
		
	}

}
