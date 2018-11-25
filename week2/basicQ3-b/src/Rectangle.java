public class Rectangle extends Shape {

   protected double length, width;
   protected Point topLeft;

   public Rectangle() {
      this(0, 0, 0, 0);
   }

   public Rectangle( double topX, double topY, double length, double width) {
      super("Rectangle");
      setTopLeft(new Point(topX, topY));
      setLength(length);
      setWidth(width);
   }

   public Point getTopLeft() { return topLeft; }

   public void setTopLeft( Point p ) { topLeft = p; }

   public void setLength( double l ) { length = l; }

   public double getLength() { return length; }

   public void setWidth( double w) { width = w; }

   public double getWidth() { return width; }

   public double getArea() { return width * length; }

   public String toString() {
	   return "TopLeft = " + topLeft + "; Length = " + length +
	   		  "; Width = " + width;
   }

}