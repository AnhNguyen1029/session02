package ra.service;

import ra.model.Category;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CatalogService implements IGenericService{
    private static final List<Category> listCategory = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public CatalogService() {

    }
    public static void inputdataCategory(){
        System.out.println("Nhập vào số lượng danh mục muốn thêm mới");
                    int n = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < n; i++) {
                        Category category = new Category();
                        category.inputDataCategory(scanner);
                        listCategory.add(category);
                    }
    }

    public static void showListCategory(){
        System.out.println("Danh sách");
        for (Category category : listCategory) {
            category.outputDataCategory();
        }
    }

    public static void updateDataCategoryById(){
        System.out.println("Mời bạn nhập mã ID cần cập nhật");
        int catalogId = Integer.parseInt(scanner.nextLine());
        boolean checkUpdateDataCategory = false;
        for (Category category : listCategory){
            if (category.getCatalogId() == catalogId){
                category.outputDataCategory();
                System.out.println("Nhập thông tin mới");
                System.out.println("Nhập vào tên danh mục");
                category.setCatalogName(scanner.nextLine());
                checkUpdateDataCategory = true ;
                break;
            }
        }
        if (checkUpdateDataCategory){
            System.out.println("Làm gì có cái ID đó:");
        }
    }
    @Override
    public List getAll() {
        return null;
    }

    @Override
    public void save(Object o) {

    }

    @Override
    public Object findById(Object o) {
        return null;
    }

    @Override
    public void delete(Object o) {

    }
}
