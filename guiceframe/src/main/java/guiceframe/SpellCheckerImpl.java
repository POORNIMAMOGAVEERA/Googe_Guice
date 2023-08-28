package guiceframe;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class SpellCheckerImpl implements SpellChecker {
	 private String language;
	 
	@Inject
	public SpellCheckerImpl(@Named("Lang") String language) {
		super();
		this.language = language;
	}


	//@Override
	public void checkSpelling() {
		System.out.println("Inside checkSpelling of "+ language);
	}
  
}
