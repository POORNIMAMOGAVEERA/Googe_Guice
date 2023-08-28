package guiceframe;

import com.google.inject.Inject;

public class WinWordSpellCheckImpl extends SpellCheckerImpl {

	@Inject
	 public WinWordSpellCheckImpl(String language) {
		super(language);
		// TODO Auto-generated constructor stub
	}

	@Override
	   public void checkSpelling() {
	      System.out.println("Inside WinWordSpellCheckerImpl.checkSpelling." );
	   } 
}
