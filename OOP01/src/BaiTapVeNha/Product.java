package BaiTapVeNha;

import java.util.Scanner;

public class Product {
    private String productCode;
    private String productName;
    private int productSellPrice;
    private int productImportPrice;

    public Product() {

    }

    public Product(String productCode, String productName, int productSellPrice, int productImportPrice) {
        this.productCode = productCode;
        this.productName = productName;
        this.productSellPrice = productSellPrice;
        this.productImportPrice = productImportPrice;
    }
    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductSellPrice() {
        return productSellPrice;
    }

    public void setProductSellPrice(int productSellPrice) {
        this.productSellPrice = productSellPrice;
    }

    public int getProductImportPrice() {
        return productImportPrice;
    }

    public void setProductImportPrice(int productImportPrice) {
        this.productImportPrice = productImportPrice;
    }

    public void inputData(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập mã sản phẩm");
        productCode = scanner.nextLine();
        System.out.println("Mời bạn nhập tên sản phẩm");
        productName = scanner.nextLine();
        System.out.println("Mời bạn nhập giá bán sản phẩm");
        productSellPrice = scanner.nextInt();
        System.out.println("Mời bạn nhập giá nhập sản phẩm");
        productImportPrice = scanner.nextInt();
    }
    public void showInfo(){
        System.out.println("Mã sản phẩm là : "+productCode);
        System.out.println("Tên sản phẩm là : "+productName);
        System.out.println("Giá sản phẩm là : "+productSellPrice);
        System.out.println("Giá nhập Sản phẩm là :"+productImportPrice);
    }
    public void interest(){
        System.out.println("Lãi xuất khi bán một sản phẩm là : "+(productSellPrice-productImportPrice));
    }
}
