import java.util.Scanner;

public class bai4KetQuaCuaPhepNhanTu1Den20 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập số bất kỳ để tính phép nhân từ 1 đến 20");
        int num;
        num = scanner.nextInt();
        for (int i = 1; i <= 20 ; i++) {
            System.out.println(num+" X "+i+" = "+num*i);
        }
    }
}
