package qltv;

import java.util.Scanner;

public class Book implements IEtity{
    private String id;
    private String title;
    private String author;
    private String publisher;
    private int year;
    private String description;
    private int categoryId;

    public Book() {}

    public Book(String id, String title, String author, String publisher, int year, String description, int categoryId) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.description = description;
        this.categoryId = categoryId;
    }

    // Getter and Setter methods

    @Override
    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("ID sách (bắt đầu bằng 'B', độ dài ít nhất 4 kí tự): ");
        this.id = scanner.next();
        while (!this.id.startsWith("B") || this.id.length() != 4) {
            System.out.println("ID của ban phải bắt đầu bằng 'B' và có 4 kí tự.");
            System.out.print("mời nhập lại: ");
            this.id = scanner.next();
        }
        scanner.nextLine(); // Consume newline character

        System.out.print("tiêu đề (6-50 kí tự): ");
        this.title = scanner.nextLine();

        System.out.print("Tên tác giả: ");
        this.author = scanner.nextLine();

        System.out.print("nhà xuất bản: ");
        this.publisher = scanner.nextLine();

        System.out.print("năm xuất bản (1970 đến nay): ");
        this.year = scanner.nextInt();

        scanner.nextLine(); // Consume newline character

        System.out.print("Mô tả sách: ");
        this.description = scanner.nextLine();

        System.out.print("mã thể loại: ");
        this.categoryId = scanner.nextInt();
    }

    @Override
    public void output() {
        System.out.println("Book ID: " + id);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisher);
        System.out.println("Publication Year: " + year);
        System.out.println("Description: " + description);
        System.out.println("Category ID: " + categoryId);
    }
}