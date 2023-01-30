package AbstractionsExamples;

public abstract class Student {
	
	private String name;
    private int no;
    private int year;
    private double date;
    private String major;
    
	public Student(String name, int no, int year, double date, String major) {
		super();
		this.name = name;
		this.no = no;
		this.year = year;
		this.date = date;
		this.major = major;
	}
    
	 public abstract void register();
	 
	 public void study() {
			
		}

	@Override
	public String toString() {
		return "Student [name=" + name + ", no=" + no + ", year=" + year + ", date=" + date + ", major=" + major + "]";
	}
	 
	 
	 
	}


