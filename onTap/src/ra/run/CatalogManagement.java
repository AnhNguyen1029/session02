package ra.run;

import ra.model.Category;
import ra.service.CatalogService;

import javax.xml.catalog.Catalog;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CatalogManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        List<Category> categoryList = new ArrayList<>();
        do {
            System.out.println("********************CATALOG-MANAGEMENT********************\n" +
                    "1. Nhập số danh mục thêm mới và nhập thông tin cho từng danh mục [5 điểm]\n" +
                    "2. Hiển thị thông tin tất cả các danh mục [5 điểm]\n" +
                    "3. Sửa tên danh mục theo mã danh mục [5 điểm]\n" +
                    "4. Quay lại");
            System.out.println("MỜI BẠN CHỌN TỪ 1~4:");
            int choiceCatalog = Integer.parseInt(scanner.nextLine());
            switch (choiceCatalog){
                case 1:
                    CatalogService.inputdataCategory();
                    break;
                case 2:
                    CatalogService.showListCategory();
                    break;
                case 3:
                    CatalogService.updateDataCategoryById();
                    break;
                case 4:


            }
        }while (true);
    }

}
