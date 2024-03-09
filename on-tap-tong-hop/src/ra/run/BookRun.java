package ra.run;

import ra.impl.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("===============MENU=================\n" +
                    "1 .Nhập thông tin sách\n" +
                    "2 .Hiển thị thông tin sách\n" +
                    "3 .Cập nhật thông tin sách theo mã sách\n" +
                    "4 .Xóa sách theo mã sách\n" +
                    "5 .Sắp xếp sách theo giá bán tăng dần\n" +
                    "6 .Thống kê sách theo khoảng giá (a-b nhập từ bàn phím)\n" +
                    "7 .Tìm kiếm sách theo tên tác giả\n" +
                    "8. Thoát");
            System.out.println("Mời chọn ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    BookService.inputData();
                    break;
                case 2:
                    BookService.showList();
                    break;
                case 3:
                    BookService.updateBookById();
                    break;
                case 4:
                    BookService.deleteBookById();
                    break;
                case 5:
                    BookService.sortPriceASC();
                    break;
                case 6:
                    BookService.search();

            }
        } while (true);


    }


}