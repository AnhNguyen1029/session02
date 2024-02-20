import java.util.Scanner;

public class bai1TongCacSoNguyenDuong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so nguyen duong bat ky de tinh tong tu 1 den so do");
        int num;
        int sum = 1 ;
        num = scanner.nextInt();
        for (int i = 0; i <= num ; i++) {
            sum += i;
        }
        System.out.println("tong tu mot den "+num+" la : "+sum);
    }
}
