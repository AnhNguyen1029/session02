package Ra.bt;

public class Rectangle extends Shape{
    private double height;
    private double width;

    public Rectangle() {
        super();
    }

    public Rectangle(String color, double height, double width) {
        super(color);
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public void getArea() {
        System.out.println("diện tích tình chữ Nhật = "+ height*width);
    }
}
