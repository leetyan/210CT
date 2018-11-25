public class TestArea {
   public static void main(String[] args) {

      Circle circle;

      circle = new Circle( 30, 10, 4.5 );

      System.out.print(circle.getName() +": " + circle.toString());
      System.out.println("; Area = " + circle.getArea());

   }
}
