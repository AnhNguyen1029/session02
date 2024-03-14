package ra.run;

import ra.service.ProductService;

import java.util.Scanner;

public class ProductManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
        System.out.println("********************PRODUCT-MANAGEMENT********************\n" +
                "1. Nhập số sản sản phẩm và nhập thông tin sản phẩm [5 điểm]\n" +
                "2. Hiển thị thông tin các sản phẩm [5 điểm]\n" +
                "3. Sắp xếp sản phẩm theo giá giảm dần [5 điểm]\n" +
                "4. Xóa sản phẩm theo mã [5 điểm]\n" +
                "5. Tìm kiếm sách theo tên sách [10 điểm]\n" +
                "6. Thay đổi thông tin của sách theo mã sách [10 điểm]\n" +
                "7. Quay lại");
            System.out.println("Mời bạn chọn từ 1~7");
            int choiceProduct = Integer.parseInt(scanner.nextLine());
            switch (choiceProduct){
                case 1:
                    ProductService.inputDataProduct();
                    break;
                case 2:
                    ProductService.showListProduct();
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:


            }
        }while (true);
    }
}
