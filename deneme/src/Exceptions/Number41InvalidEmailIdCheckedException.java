package Exceptions;

public class Number41InvalidEmailIdCheckedException extends Exception {

	private static final long serialVersionUID = 1L; 
	// Java exception'larin tekrarsiz olmasini saglamak icin her exception'a unique bir kod verir

	Number41InvalidEmailIdCheckedException(String message){
		super(message);
	}


}
