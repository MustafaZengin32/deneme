package AbstractionsExamples;

public class UnderGraduateStudent extends Student {
	private String minor;

	public UnderGraduateStudent(String name, int no, int year, double date, String major, String minor) {
		super(name, no, year, date, major);
		this.minor = minor;
	}

	@Override
	public void register() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void study() {
		// TODO Auto-generated method stub
		super.study();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
	
	
	
	


}
