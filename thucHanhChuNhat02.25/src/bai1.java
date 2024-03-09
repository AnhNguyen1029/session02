import javax.swing.*;
import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
//        Bài 1: Chuyển so La Mã sang int
//        Các chữ số La Mã được thể hiện bằng bảy ký hiệu khác nhau  : I, V, X, L, C và D.M
//        Symbol       Value
//        I              1
//        V             5
//        X             10
//        L             50
//        C             100
//        D             500
//        M             1000
//
//        Ví dụ,  2 được viết dưới II dạng số La Mã, chỉ cần hai số cộng lại với nhau. 12 được viết là  XII, mà đơn giản là X + II. Số 27 được viết là XXVII, tức là XX + V + II.
//
//                Hãy viết chương trình nhập vào 1 số La Mã và chuyển nó thành 1 số nguyên.
//
//        Ví du:
//        XIX = X + (-I) + X= 19
//        IX = -I + X = 9
//        Input: string = "III"   Output: 3
//        Input: string = "LVIII"   Output: 58
//        Input: string = "MCMXCIV"  Output: 1994. Vì M = 1000, CM = 900, XC = 90 and IV = 4
        Scanner scanner = new Scanner(System.in);
        int ketQua = 0;
        System.out.println("Nhập chữ số la mã cần tính:");
        String chuSoLaMa = scanner.nextLine();
        String laMa = chuSoLaMa.toUpperCase();
//        int viTri = 0;

        for (int i = chuSoLaMa.length() - 1; i >= 0; i--) {
            char check = chuSoLaMa.charAt(i);
            if (i == chuSoLaMa.length() - 1) {
                switch (check) {
                    case 'M':
                        ketQua += 1000;
                        break;
                    case 'D':
                        ketQua += 500;
                        break;
                    case 'C':
                        ketQua += 100;
                        break;
                    case 'L':
                        ketQua += 50;
                        break;
                    case 'X':
                        ketQua += 10;
                        break;
                    case 'V':
                        ketQua += 5;
                        break;
                    case 'I':
                        ketQua += 1;
                        break;
                }
            } else {
                if (chuSoLaMa.charAt(i) < chuSoLaMa.charAt(i + 1)) {
                    switch (check) {
                        case 'D':
                            ketQua -= 500;
                            break;
                        case 'C':
                            ketQua -= 100;
                            break;
                        case 'L':
                            ketQua -= 50;
                            break;
                        case 'X':
                            ketQua -= 10;
                            break;
                        case 'V':
                            ketQua -= 5;
                            break;
                        case 'I':
                            ketQua -= 1;
                            break;
                    }
                } else {
                    switch (check) {
                        case 'M':
                            ketQua += 1000;
                            break;
                        case 'D':
                            ketQua += 500;
                            break;
                        case 'C':
                            ketQua += 100;
                            break;
                        case 'L':
                            ketQua += 50;
                            break;
                        case 'X':
                            ketQua += 10;
                            break;
                        case 'V':
                            ketQua += 5;
                            break;
                        case 'I':
                            ketQua += 1;
                            break;
                    }
                }

            }
        }
        System.out.println("Giá tr của số la mã bạn nhập là : "+ketQua);
    }
}
