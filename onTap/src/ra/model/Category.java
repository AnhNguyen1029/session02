package ra.model;

import java.util.Scanner;

public class Category {
        private int catalogId ;
        private String catalogName;
        private String descriptions;


    public Category() {
    }

    public Category(int catalogId, String catalogName, String descriptions) {
        this.catalogId = catalogId;
        this.catalogName = catalogName;
        this.descriptions = descriptions;
    }

    public int getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(int catalogId) {
        this.catalogId = catalogId;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    @Override
    public String toString() {
        return "Category{" +
                "catalogId=" + catalogId +
                ", catalogName='" + catalogName + '\'' +
                ", descriptions='" + descriptions + '\'' +
                '}';
    }

    public void inputDataCategory(Scanner scanner){
        System.out.println("Mời bạn nhập ID danh mục");
        catalogId = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời bạn nhập tên danh mục");
        catalogName = scanner.nextLine();
        System.out.println("mời bạn nhập nội dung phần mô tả");
        descriptions = scanner.nextLine();
        System.out.println("---");
    }

    public void outputDataCategory(){
        System.out.println("Category ID : "+catalogId+"\n"+
                "Category name : "+catalogName+"\n"+
                "descriptions : "+descriptions+"\n"+
                "**-**"
        );
    }
}
