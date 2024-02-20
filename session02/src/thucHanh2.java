import java.util.Scanner;

public class thucHanh2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int soNguyen;
        System.out.println("Moi ban nhap so de kiem tra co chia het cho 3 va 5 hay khong");
        soNguyen = scanner.nextInt();
        if (soNguyen %3 ==0 && soNguyen %5 == 0){
            System.out.println("So ban nhap chia het cho 3 va 5");
        }else {
            System.out.println("So ban nhap khong chia het cho 3 va 5");
        }
    }
}
