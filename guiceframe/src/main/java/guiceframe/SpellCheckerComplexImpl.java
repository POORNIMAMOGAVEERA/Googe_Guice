package guiceframe;

import com.google.inject.Inject;

public class SpellCheckerComplexImpl implements SpellChecker {

	 private String dbUrl;
	   private String user;
	   private Integer timeout;

	   @Inject
	   public SpellCheckerComplexImpl(String dbUrl, String user, Integer timeout){
	      this.dbUrl = dbUrl;
	      this.user = user;
	      this.timeout = timeout;
	   } 

	   public void  checkSpelling() { 
	      System.out.println("Inside checkSpelling." );
	      System.out.println(dbUrl);
	      System.out.println(user);
	      System.out.println(timeout);
	   }

}
