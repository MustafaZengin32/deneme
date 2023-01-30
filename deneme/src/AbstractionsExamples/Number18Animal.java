package AbstractionsExamples;

public abstract class Number18Animal {
	
    String Name = " ";

    Number18Animal(String name) {
        this.Name = name;
    }

    
    public void Information(String detail) {
        System.out.println("The details of " + this.Name + " is: " + detail);
    }

   
    abstract public void legs();
    abstract public void eyes();
}



