package ra.service;

import ra.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService implements IGenericService{

    public static final List<Product> Listproduct = new ArrayList<>();
    public static final Scanner scanner = new Scanner(System.in);

    public ProductService() {
    }
    public static void inputDataProduct(){
        System.out.println("Nhập số lượng sả phẩm muốn thêm mới");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            Product product = new Product();
            product.inputDataProduct(scanner);
            Listproduct.add(product);
        }
    }
    public static void showListProduct(){
        System.out.println("Danh sách sản phẩm : ");
        for (Product product : Listproduct) {
            product.outputDataProduct();
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
