package drawApp;


import org.slf4j.Logger;

import com.google.inject.Inject;
import com.google.inject.Singleton;

//@Singleton
public class SendRequest {
	@Inject
    DrawShape d;
   private Logger logger;
//   @Inject
//   SendRequest(DrawShape d){
//	   this.d = d;
//   }
//   @Inject
//    public void setSendRequest(DrawShape d) {
//    	this.d = d;
//    }
   public void makeRequest(){
	   d.draw();
	  // logger.info("Log is Inbuilt");
   }
   
   public DrawShape getDrawShape() {
	   return d;
   }
}
