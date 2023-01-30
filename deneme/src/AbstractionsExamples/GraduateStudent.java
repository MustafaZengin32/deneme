package AbstractionsExamples;

public class GraduateStudent extends Student {
	
	private String advisor;
	private String thesis;
	
	
	
	public GraduateStudent(String name, int no, int year, double date, String major, String advisor, String thesis) {
		super(name, no, year, date, major);
		this.advisor = advisor;
		this.thesis = thesis;
	}


	@Override
	public void register() {
		System.out.println("Ogrenci eklendi");
		
	}
	
	@Override
	public void study() {
		// TODO Auto-generated method stub
		super.study();
	}
	
	public void writeThesis() {
		// TODO Auto-generated method stub

	}
	public void meetWithAdvisor() {
		// TODO Auto-generated method stub

	}
	
	
	
	

}
