import java.util.Scanner;

public class baiMau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số La Mã: ");
        String romanNumeral = scanner.nextLine();

        // Ví dụ: input XIX
        // IX = 9,VIII,IX,X,
        int result = 0;
        int prevValue = 0;

        for (int i = romanNumeral.length() - 1; i >= 0; i--) {
            char c = romanNumeral.charAt(i);
            int value = getValue(c);

            if (value < prevValue) {
                result -= value;
            } else {
                result += value;
            }
            prevValue = value;
        }

        System.out.println("Số nguyên tương ứng: " + result);
    }

    public static int getValue(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0; // Trong trường hợp ký tự không hợp lệ
        }
    }
}