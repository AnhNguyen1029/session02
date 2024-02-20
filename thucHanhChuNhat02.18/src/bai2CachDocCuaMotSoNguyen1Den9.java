import java.util.Scanner;

public class bai2CachDocCuaMotSoNguyen1Den9 {
    public static void main(String[] args) {
        System.out.println("Nhap mot so nguyen tu 1 den 9 de biet cach doc so nay");
        Scanner scanner = new Scanner(System.in);
        int num;
        num = scanner.nextInt();
        switch (num){
            case 1:
                System.out.println("Một");
                break;
            case 2:
                System.out.println("Hai");
                break;
            case 3:
                System.out.println("Ba");
                break;
            case 4:
                System.out.println("Bốn");
                break;
            case 5:
                System.out.println("Năm");
                break;
            case 6:
                System.out.println("Sáu");
                break;
            case 7:
                System.out.println("Bảy");
                break;
            case 8:
                System.out.println("Tám");
                break;
            case 9:
                System.out.println("Chín");
                break;
            default:
                System.out.println("Số bạn nhập không hợp lệ (không nằm từ 1 đến9)");
        }

    }
}
