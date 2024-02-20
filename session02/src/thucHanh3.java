import java.util.Scanner;

public class thucHanh3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        float diemTB;
        System.out.println("Moi ban nhap diem Tb de biet trinh cua ban");
        diemTB = scanner.nextFloat();
        if (diemTB > 8){
            System.out.println("Ban la hoc sinh Gioi");
        } else if (diemTB > 7) {
            System.out.println("Ban la hoc sinh Kha");
        } else if (diemTB > 5) {
            System.out.println("Ban la hoc sinh Trung Binh");
        }else {
            System.out.println("Ban la hoc sinh Yeu");
        }
    }
}
