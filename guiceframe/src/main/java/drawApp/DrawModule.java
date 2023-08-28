package drawApp;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import com.google.inject.matcher.Matchers;

import drawApp.annotaion.ColorValue;
import drawApp.annotaion.EdgeValue;
import drawApp.annotaion.LogTracker;

public class DrawModule extends AbstractModule{
	
	   // @Override
       protected void configure() {
    	   bind(DrawShape.class).to(DrawSquare.class).in(Singleton.class);
    	   bind(String.class).annotatedWith(ColorValue.class).toInstance("Red");
    	   bind(Integer.class).annotatedWith(EdgeValue.class).toInstance(40);
    	   //bind(SendRequest.class).to(SendRequestSubClass.class);//Type A is Concrete Class and bind subclass implementatio
           bindInterceptor(Matchers.any(),Matchers.annotatedWith(LogTracker.class),new InterceptorFun());
           bind(SendRequest.class).in(Singleton.class);
       }
}
