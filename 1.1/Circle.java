/**
 * The Circle class models a circle with a radius and color.
 */
public class Circle {  // Save as "Circle.java"
   // private instance variable, not accessible from outside this class
   private double radius;
   private String color;
   
   // Constructors (overloaded)
   /** Constructs a Circle instance with default value for radius and color */
   public Circle() {  // 1st (default) constructor
      this.radius = 1.0;
      this.color = "red";
   }
   
   /** Constructs a Circle instance with the given radius and default color */
   public Circle(double radius) {  // 2nd constructor
      this.radius = radius;
      this.color = "red";
   }

   public Circle(double radius, String color){
       this.radius = radius;
       this.color = color;
   }
   
   /** Returns the radius */
   public double getRadius() {
     return radius; 
   }
   
   /** Returns the area of this Circle instance */
   public double getArea() {
      return radius*radius*Math.PI;
   }

   /** Returns the color of the Circle */
   public String getColor(){
       return color;
   }

   /** Set Radius */
   public void setRadius(double radius){
      this.radius = radius;
   }

   /** Set Color */
   public void setColor(String color){
      this.color = color;
   }

   /** Return a self-descriptive string of this instance in the form of Circle[radius=?,color=?] */
   public String toString() {
      return "Circle[radius=" + radius + " color=" + color + "]";
   }
}