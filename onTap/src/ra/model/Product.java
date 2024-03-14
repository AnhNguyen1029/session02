package ra.model;

import java.util.Scanner;

public class Product {
    private String productId;
    private String productName;
    private double productPrice;
    private String description;
    private int stock ;
    private String catalog;
    private boolean status = true;
    public void inputDataProduct(Scanner scanner){
        System.out.println("Mời bạn nhập ID của sản phầm");
        productId = scanner.nextLine();
        System.out.println("Mời bạn nhập tên của sản phầm");
        productName = scanner.nextLine();
        System.out.println("Mời bạn nhập giá sản phẩm");
        productPrice = Double.parseDouble(scanner.nextLine());
        System.out.println("Mời bạn nhập mô tả sản phẩm");
        description = scanner.nextLine();
        System.out.println("Mời bạn nhập số lượng trong kho hàng");
        stock = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời bạn nhập danh mục");
        catalog = scanner.nextLine();
        System.out.println("Mời bạn nhập trạng thái");
        status = Boolean.parseBoolean(scanner.nextLine());
    }
    public void outputDataProduct(){
        String trangThai = (status? "bán" : "không bán" );
        System.out.println("productId : "+productId+"\n"+
                "productName : "+productName+"\n"+
                "productPrice : "+productPrice+"\n"+
                "description : "+description+"\n"+
                "stock : "+stock+"\n"+
                "catalog : "+catalog+"\n"+
                "status : "+trangThai+"\n"+
                "**-**"
        );
    }

    public Product() {
    }

    public Product(String productId, String productName, double productPrice, String description, int stock, String catalog, boolean status) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.description = description;
        this.stock = stock;
        this.catalog = catalog;
        this.status = status;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getCatalog() {
        return catalog;
    }

    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", description='" + description + '\'' +
                ", stock=" + stock +
                ", catalog='" + catalog + '\'' +
                ", status=" + status +
                '}';
    }
}
