package drawApp;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class GuiceDemo {
   private static final String SQUARE_REQ = "SQUARE";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        senRequest(SQUARE_REQ );
	}
	private static void senRequest(String squareReq) {
		// TODO Auto-generated method stub
		if(squareReq.equals(SQUARE_REQ)) {
			/* DrawShape d = new DrawSquare();*/
			Injector inject = Guice.createInjector(new DrawModule());
//			DrawShape d = inject.getInstance(DrawShape.class);//TypeA is an interface and we must have a binding present for it
//			//SendRequest request= new SendRequest(d);
			SendRequest request1 = inject.getInstance(SendRequest.class);//Type A is Concrete Class and bind to none
			request1.makeRequest();
			SendRequest request2 = inject.getInstance(SendRequest.class);//Type A is Concrete Class and bind to none
			request2.makeRequest();
			System.out.println((request1.getDrawShape()==request2.getDrawShape())?"To objects are equal":"To objects are not equal");
			System.out.println((request1==request2)?"Requests are equal":"Requests are not equal");
		       
		}
	}

}
