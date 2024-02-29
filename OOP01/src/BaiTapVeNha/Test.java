package BaiTapVeNha;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product product = new Product();
        do {
            System.out.println("=============MEnu===========");
            System.out.println("1. Nhập vào thông tin sản phẩm");
            System.out.println("2. Hiển thị thông tin sản phẩm");
            System.out.println("3. Hiển thị lãi xuất sản phẩm");
            System.out.println("4. thoát");
            System.out.println("Mời bạn chọn từ 1~4");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    product.inputData();
                    break;
                case 2:
                    product.showInfo();
                    break;
                case 3:
                    product.interest();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Bạn nhập không hợp lệ, Mời bạn nhập lại");
            }
        } while (true);
    }

}
