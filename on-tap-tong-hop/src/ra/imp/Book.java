package ra.impl;

import ra.itf.IBook;

import java.util.Scanner;

public class Book implements IBook {
    private String bookId;
    private String bookName;
    private double importPrice;
    private double exportPrice;
    private String author;
    private String description;

    public Book() {
    }

    public Book(String bookId, String bookName, double importPrice, double exportPrice, String author, String description) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.author = author;
        this.description = description;
    }

    @Override
    public void inputData(Scanner scanner) {
        System.out.println("Nhập mã sách ");
        bookId = scanner.nextLine();
        System.out.println("Nhập vào tên sách ");
        bookName = scanner.nextLine();
        System.out.println("Nhập vào giá nhập ");
        importPrice = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập vào giá bán ");
        exportPrice = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập vào tác giả");
        author = scanner.nextLine();
        System.out.println("Nhập vào mô tả sách ");
        description = scanner.nextLine();

    }

    @Override
    public void displayData() {
        System.out.println("Mã sách : "+bookId);
        System.out.println("Tên sách : "+bookName);
        System.out.println("Giá nhập : "+importPrice);
        System.out.println("Giá bán : "+exportPrice);
        System.out.println("Tác giả : "+author);
        System.out.println("Mô tả : "+description);
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public double getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(double importPrice) {
        this.importPrice = importPrice;
    }

    public double getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(double exportPrice) {
        this.exportPrice = exportPrice;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}