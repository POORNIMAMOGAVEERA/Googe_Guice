package drawApp;

import com.google.inject.ImplementedBy;

@ImplementedBy(DrawSquare.class)
public interface DrawShape {
      void draw();
}
