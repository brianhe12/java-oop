public class Cylinder extends Circle{
    private double height;

    public Cylinder() {
        super();
        height = 1.0;
    }

    public Cylinder(double height) {
        super();
        this.height = height;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }
    
    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return super.getArea()*height;
    }

    // Override getArea, now to call parent's getArea we need to use super keyword    
    @Override
    public double getArea() {
        System.out.println("Using Cylinder's getArea");
        return 2*3.14*getRadius()*getHeight() + (2*super.getArea());
    }

    @Override
    public String toString() {      // in Cylinder class
    return "Cylinder: subclass of " + super.toString()  // use Circle's toString()
            + " height=" + height;
    }
}
