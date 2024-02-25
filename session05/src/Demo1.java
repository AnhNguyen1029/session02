public class Demo1 {
    public static void main(String[] args) {
        String fullName = "Trần Thị Hiên";
        System.out.println(fullName.length());//độ dài chuỗi tính từ 1,2,3~...

        System.out.println(fullName.charAt(1));//xuất ra ký tự tại vị trí 1 ( tính từ 0,1,2~...)
        System.out.println(fullName.concat(" xinh gái"));// nối chuỗi
        System.out.println(fullName);
        System.out.println(fullName.toUpperCase());//VIẾT HOA
        String msv = " B2001 ";
        // thì chỉ được 5 ký tự
        msv.trim();//loại b dấu cách 2 đầu
        System.out.println(msv.trim().length());
        String address = "Trần Thị Hiên";

        if (fullName.equalsIgnoreCase(address)) {//equals so sánh bằng giữa 2 đối tượng(so sánh tuyệt đối) trả về boolean true false
            System.out.println("Bằng nhau");
        } else {
            System.out.println("ko bằng");
        }
        address = "Trần Thị Hiên";
        System.out.println(fullName.compareTo(address));//.compareTo so sánh 2 chuỗi (lớn hơn là số dương/ bằng thì 0/ nhở hơn thì trả về âm
        fullName = "Nguyễn Văn Ánh";
        System.out.println(fullName.contains("Ánh"));

        String[] sv = {"cat", "dog", "pig", "vk"};

        //tìm xem mảng sv có dog hay không?
        boolean check = false;
        for (String item : sv) {
            if (item.equals("dog")) {
                check = true;
                break;
            }
        }
        if (check) {
            System.out.println("có con dog");
        } else {
            System.out.println("ko có dog");
        }

        fullName = "Nguyễn Văn A B2011";
        //System.out.println(fullName.indexOf("A"));//trả về chỉ số tr trong chuỗi
        System.out.println(fullName.replace("A", "B"));//thay thế chữ ...
        System.out.println(fullName.startsWith("Nguyễn"));//kieemr tra xem chữ đầu tiên có phải là .. không

        String nyc = "Huyền,Trang,Nhung,Hương";
        String[] arr = nyc.split(",");
        for (String item : arr) {//arr.for là ra
            System.out.println(item);//item là từng phần tử thứ i giống for i
        }
        //.substring(,) là cắt chuooix từ n(n,m) đến m

    }
}
