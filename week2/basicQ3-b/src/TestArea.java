public class TestArea {
   public static void main(String[] args) {
      Rectangle rectangle;
      rectangle = new Rectangle( 9.5, 4, 16, 14 );
      System.out.print(rectangle.getName() + ": " + rectangle.toString()+"; Area = " + rectangle.getArea());
   }
}
