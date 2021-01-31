
public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle(10,"orange");
  
        System.out.println(c1);
        System.out.println(c1.getRadius());
        c1.setRadius(100);

        System.out.println(c1.getRadius());
        
        System.out.println(c1.getArea());
     }
}
