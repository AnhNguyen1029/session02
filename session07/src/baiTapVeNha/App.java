package baiTapVeNha;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        PesonAccount personAccount = new PesonAccount(01, "Doraemon", 10000, 100);
        SavingAccount savingAccount = new SavingAccount(02, "Nobita", 5000, 6, 6);
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Moi ban chon loai giao dich");
            System.out.println("1. Hien thi thong tin tai khoan.");
            System.out.println("2. Rut tien.");
            System.out.println("3. Nap tien.");
            System.out.println("4. Hien thi thong tin tai khoan tiet kiem.");
            System.out.println("5. Kiem tra lai suat theo ky han");
            System.out.println("6. Thoat.");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Thông tin tài khoản: " + personAccount);
                    break;

                case 2:
                    personAccount.withDraw();
                    break;

                case 3:
                    personAccount.deposite();
                    break;

                case 4:
                    System.out.println("Thông tin tài khoản của bạn là : " + savingAccount);
                    break;

                case 5:
                    System.out.println(savingAccount.checkInterest());
                    break;

                case 6:
                    System.exit(0);
                    break;

                default:
                    System.err.println("Không hợp lệ mời bạn nhập lại");
            }
        } while (true);

    }
}
