package AbstractionsExamples;

public class Number2Worker extends Number2Accounting {

	@Override
	protected int saatUcreti() {
		
		return 10;
	}

	@Override
	protected int aylikCalismaSuresi() {
		
		return 140;
	}

	@Override
	public String toString() {
		return "Number2Worker [saatUcreti=" + saatUcreti + ", aylikCalismaSuresi=" + aylikCalismaSuresi + ", maas="
				+ maas + ", isim=" + isim + ", soyIsim=" + soyIsim + ", tcNo=" + tcNo + ", personelNo=" + personelNo
				+ ", saatUcreti()=" + saatUcreti() + ", aylikCalismaSuresi()=" + aylikCalismaSuresi()
				+ ", personelNo()=" + personelNo() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	
	 

}
