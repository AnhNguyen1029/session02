import java.util.Scanner;

public class bai8TinhGiaThuaMotSoNguyenDuong {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num;
        System.out.println("nhập số nguyên dương cần tính giai thừa");
        num = scanner.nextInt();
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println("Giai thừa của "+num+" là : "+factorial);
    }
}
