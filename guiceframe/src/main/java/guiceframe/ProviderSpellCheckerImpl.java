package guiceframe;

import com.google.inject.Provider;

public class ProviderSpellCheckerImpl implements Provider<SpellChecker>{

	public SpellChecker get() {
		// TODO Auto-generated method stub
		 String dbUrl = "jdbc:mysql://localhost:5326/emp";
	      String user = "user";
	      int timeout = 100;

	      SpellChecker SpellChecker = new SpellCheckerComplexImpl(dbUrl, user, timeout);
	      return SpellChecker;
	}

}
