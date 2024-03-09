package ra.run;

import ra.impl.Book;

import java.util.*;

public class BookService {
    private static final List<Book> list = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);
    public BookService() {

    }

    public static void inputData(){
        System.out.println("Nhập vào số lượng sách muốn thêm mới ");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            Book book = new Book();
            book.inputData(scanner);
            list.add(book);
        }
    }
    public static void showList(){
        System.out.println("Danh sách");
        for (Book book : list) {
            book.displayData();
            System.out.println("-------------------------------");
        }
    }

    public static void updateBookById(){
        System.out.println("Nhập vào mã cần sủa");
        String bookId = scanner.nextLine();
        boolean check = false;
        Book book = findBookById(bookId);
        if (book != null){
            book.displayData();
            System.out.println("Nhập thông tin mới");
            System.out.println("Nhập vào tên sách ");
            book.setBookName(scanner.nextLine());
            System.out.println("Nhập vào giá sách nhập ");
            book.setImportPrice(Double.parseDouble(scanner.nextLine()));
            System.out.println("Cập nhật thành công");
        } else {
            System.out.println("Không tìm thấy Sách có mã là "+bookId);
        }
    }

    public static void deleteBookById(){
        System.out.println("Nhập vào mã cần xóa");
        String bookId = scanner.nextLine();
        Book book = findBookById(bookId);
        if(book == null){
            System.out.println("Không tìm thấy Sách có mã là "+bookId);
        } else {
            list.remove(book);
            System.out.println("Xóa thành công");
        }
    }
    public static Book findBookById(String bookId){
        for (Book book : list) {
            if(book.getBookId().equals(bookId)){
                return book;
            }
        }
        return null;
    }
    public static void sortPriceASC(){

//        for (int i = 0; i < list.size()-1; i++) {
//            for (int j = 0; j < list.size() - i -1; j++) {
//                if (list.get(j).getExportPrice() > list.get(j+1).getExportPrice()){
//                    Book book = new Book();
//                    book = list.get(j);
//                    list.set(j,list.get(j+1));
//                    list.set(j+1,book);
//                }
//            }
//        }
//
//        showList();
        list.sort(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return (int) (o2.getExportPrice() - o1.getExportPrice());
            }
        });
        showList();
    }

    public static void search(){
        System.out.println("Nhập vào tên tác giả");
        String author = scanner.nextLine();
        for (Book book : list) {
            if(book.getAuthor().toLowerCase().contains(author.toLowerCase())){
                book.displayData();
            }
        }
    }
}