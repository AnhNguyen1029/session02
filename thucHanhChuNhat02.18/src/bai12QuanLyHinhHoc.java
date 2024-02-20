import java.sql.SQLOutput;
import java.util.Scanner;

public class bai12QuanLyHinhHoc {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("mời bạn chọn loại hình học cần quản lý trong hình tròn, hình vuong, hình chữ nhật");
        String hinhHoc;
        hinhHoc = scanner.nextLine();
        switch (hinhHoc){
            case "hình tròn":
                int r;
                System.out.println("Mời bạn nhập bán kính hình tròn để tính chu vi diện tích");
                r = scanner.nextInt();
                System.out.println("chu vi hình tròn là : "+2*3.14*r);
                System.out.println("Diện tích hình tròn là : "+3.14*r*r);
                break;
            case "hình chữ nhật":
                int dai ;
                int rong ;
                System.out.println("mời bạn nhập chiều dài và chiều rộng để tính chu vi diện tích hình chữ Nhật");
                System.out.println("mời bạn nhập chiều dài");
                dai = scanner.nextInt();
                System.out.println("mời bạn nhập chiều rộng");
                rong = scanner.nextInt();
                System.out.println("chu vi hình chữ nhật là : "+( dai + rong )*2);
                System.out.println("diện tích hình chữ nhật là : "+dai*rong);
                break;
            case "hình vuông":
                int canh ;
                System.out.println("mời bạn nhập chiều dài và chiều rộng để tính chu vi diện tích hình chữ Vuông");
                System.out.println("mời bạn nhập chiều dài cạnh");
                canh = scanner.nextInt();
                System.out.println("chu vi hình Vuông là : "+canh*4);
                System.out.println("diện tích hình Vuông là : "+canh*canh);
                break;
            default:
                System.out.println("không hợp lệ");
        }
    }
}
