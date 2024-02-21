import java.util.Scanner;

public class bai7TaoMenuNhap3So {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập 3 số nguyên");
        System.out.println("Số thứ nhất:");
        int num1 = scanner.nextInt();
        System.out.println("Số thứ hai:");
        int num2 = scanner.nextInt();
        System.out.println("Số thứ ba:");
        int num3 = scanner.nextInt();
        do {
            System.out.println("===========menu==========");
            System.out.println("1. Tổng ba số nguyên");
            System.out.println("2. Trung bình cộng của ba số nguyên");
            System.out.println("3. Số lớn nhất và số nhỏ nhất trong ba số đó");
            System.out.println("4. Thoát");
            System.out.println("lựa chọn của bạn:");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Tổng ba số nguyên là : " + num1 + num2 + num3);
                    break;
                case 2:
                    System.out.println("Trung bình cộng của ba số nguyên là : " + (num1 + num2 + num3) / 3);
                    break;
                case 3:
                    if (num1 >= num2 && num1 >= num3)
                        System.out.println("Số lớn nhất trong ba số là : " + num1);

                    else if (num2 >= num1 && num2 >= num3)
                        System.out.println("Số lớn nhất trong ba số là : " + num2);
                    else
                        System.out.println("Số lớn nhất trong ba số là : " + num3);

                    if (num1 <= num2 && num1 <= num3)
                        System.out.println("Số nhỏ nhất trong ba số là : " + num1);

                    else if (num2 <= num1 && num2 <= num3)
                        System.out.println("Số nhỏ nhất trong ba số là : " + num2);
                    else
                        System.out.println("Số nhỏ nhất trong ba số là : " + num3);

                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn của bạn không hợp lệ");
            }
            System.out.println("//////~~~~~/////~~~~~//////~~~~~/////");
        } while (true);

    }
}
