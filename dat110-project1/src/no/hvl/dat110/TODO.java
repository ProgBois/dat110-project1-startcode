package no.hvl.dat110;

public class TODO {

	public static String method() {
		//kommentar12
<<<<<<< HEAD
		//GainzCity
		// plz funk
=======
		//Hallaao
>>>>>>> branch 'master' of https://github.com/ProgBois/dat110-project1-startcode.git
		String methodName = Thread.currentThread().getStackTrace()[2].getMethodName();
		
		return "Metoden " + methodName + " er ikke implementert";
	}
	
	
	public static String construtor(String className) {
				
	   return "Konstruktøren for klassen " + className + " er ikke implementert";
		
	}

}
