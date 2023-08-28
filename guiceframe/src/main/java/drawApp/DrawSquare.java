package drawApp;

import com.google.inject.Inject;

import drawApp.DrawShape;
import drawApp.annotaion.ColorValue;
import drawApp.annotaion.EdgeValue;
import drawApp.annotaion.LogTracker;

public class DrawSquare implements DrawShape{
 
	private String color="Blue";
	private Integer edge;
	
	@Inject
	public DrawSquare(@ColorValue String color,@EdgeValue Integer edge) {
		super();
		this.color = color;
		this.edge = edge;
	}
	public DrawSquare() {}
	@Inject(optional=true)
	public void setColor(@ColorValue String color) {
		this.color = color;
	}
   
	@LogTracker
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing square !"+color+" and edge"+ edge);
	}
}
