public class Demo3 {
    public static void main(String[] args) {
        //khai báo biến mảng (2 cách)
        //khai báo mảng dữ liệu lưu trữ tên của 5 nyc
        //dataType[] ArrayName = new dataType[];
        String[] nycs = new String[5];
        //truy cập vào phần tử mảng
        nycs[0] = "Hoa";
        nycs[1] = "Hương";
        nycs[2] = "Ngọc";
        nycs[3] = "Trang";
        nycs[4] = "Thảo";
        System.out.println("Người yêu cũ thứ 3 là "+nycs[2]);

        //Hiển th dnah sách người yêu cũ
        for (int i = 0; i < nycs.length; i++) {
            System.out.println(nycs[i]);
        }
//        nycs[5] = "Ánh"; nycs[5] chỉ có 5 phần tử nên ko thể đưa phần tử thứu 6 vào đc
        //khai báo mang lưu trữ tên của 2 nym;
        String[] nyms = {"Ngọc","Hân"};


    }
}
