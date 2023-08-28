package guiceframe;

import com.google.inject.name.Named;

public class ConstrructorSpellCheckImpl implements SpellChecker{

	private String dbUrl;
	
//	public ConstrructorSpellCheckImpl() {}
	
	public ConstrructorSpellCheckImpl(@Named("JDBC") String dbUrl) {
		this.dbUrl =dbUrl;
	}
	
	public void checkSpelling() {
		// TODO Auto-generated method stub
		System.out.println("Inside CheckSpelling");
		System.out.println(dbUrl);
	}

}
