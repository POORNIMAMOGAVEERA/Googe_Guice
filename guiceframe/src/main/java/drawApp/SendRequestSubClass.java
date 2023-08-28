package drawApp;

import org.slf4j.Logger;

import com.google.inject.Inject;

public class SendRequestSubClass extends SendRequest{


//	@Inject
//	SendRequestSubClass(DrawShape d) {
//		super(d);
//		// TODO Auto-generated constructor stub
//	}
   
	@Override
	public void makeRequest() {
		System.out.println("Delegating call to draw method");
		d.draw();
	}
}
