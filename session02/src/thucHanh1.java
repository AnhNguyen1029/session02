import java.util.Scanner;

public class thucHanh1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
         int soNguyen;
        System.out.println("Moi ban nhap so nguyen");
        soNguyen = scanner.nextInt();
        if ( soNguyen%2 == 0 ){
            System.out.println("So ban nhap la so Chan");
        }else {
            System.out.println("So ban nhap la so le");
        }

    }
}
