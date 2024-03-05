package Ra.bt;

public class Circle extends Shape{
    private double radius;

    public Circle() {
        super();
    }

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void getArea() {
        System.out.println("diện tích hình tròn = " + 3.14*radius*radius);
    }

}
