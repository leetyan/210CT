public class Circle extends Shape {

   protected Point center;
   protected double radius;

   public Circle() {
      this(0, 0, 0);
   }

   public Circle( double centerX, double centerY, double radius ) {
      super("Circle");
      setRadius(radius);
      setCenter(new Point(centerX, centerY));
   }

   public void setRadius( double radius )
      { this.radius = ( radius >= 0 ? radius : 0 ); }

   public double getRadius() { return radius; }

   public void setCenter( Point p )
      { center = p; }

   public Point getCenter() { return center; }

   public double getArea() { return Math.PI * radius * radius; }

   public String toString()
      { return "Center = " + center + "; Radius = " + radius; }

}