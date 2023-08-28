package guiceframe;

import org.slf4j.Logger;

import com.google.inject.Inject;

public class InbuiltLog {
	private Logger logger;

	   @Inject
	   public InbuiltLog( Logger logger) {
	      this.logger = logger;
	   }

	   public void makeSpellCheck(){
	      logger.info("In TextEditor.makeSpellCheck() method");
	   } 
}
