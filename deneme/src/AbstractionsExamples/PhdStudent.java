package AbstractionsExamples;

public class PhdStudent extends GraduateStudent {
	
//	public PhdStudent(String name, int no, int year, double date, String major, String advisor, String thesis) {
//		super(name, no, year, date, major, advisor, thesis);
//		// TODO Auto-generated constructor stub
//	}

	
	
	public PhdStudent(String name, int no, int year, double date, String major, String advisor, String thesis,
			boolean qualityExamTaken) {
		super(name, no, year, date, major, advisor, thesis);
		this.qualityExamTaken = qualityExamTaken;
	}



	boolean qualityExamTaken;
	
	@Override
	public void register() {
		// TODO Auto-generated method stub
		super.register();
	}
	
	@Override
	public void study() {
		// TODO Auto-generated method stub
		super.study();
	}
	
	@Override
	public void writeThesis() {
		// TODO Auto-generated method stub
		super.writeThesis();
	}
	
	@Override
	public void meetWithAdvisor() {
		// TODO Auto-generated method stub
		super.meetWithAdvisor();
	}
	
	private void writePaper() {
		// TODO Auto-generated method stub

	}
	
	


}

