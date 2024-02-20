import java.util.Scanner;

public class bai6INTamGiacSao {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num;
        System.out.println("Vui lòng nhập số dòng tam giác sao cần thiết");
        num = scanner.nextInt();
        for (int i = 1; i <= num ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
