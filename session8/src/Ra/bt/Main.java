package Ra.bt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập chiều dài hình chữ nhật :");
        double dai = scanner.nextDouble();
        rectangle.setWidth(dai);
        System.out.println("nhập chiều rộng hình chữ nhật :");
        double rong = scanner.nextDouble();
        rectangle.setHeight(rong);
        Circle circle = new Circle();
        System.out.println("nhập bán kính hình tròn :");
        double banKinh = scanner.nextDouble();
        circle.setRadius(banKinh);
        rectangle.getArea();
        circle.getArea();
    }
}
