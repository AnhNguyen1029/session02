import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Mời bạn nhập 2 số nguyên bất kỳ");
        System.out.println("Số thứ nhất:");
        int num1;
        int num2;
        num1 = scanner.nextInt();
        System.out.println("Số thứ hai:");
        num2 = scanner.nextInt();
        do {
        System.out.println("**CACULATOR**");
        System.out.println("1. Tổng 2 số");
        System.out.println("2. Hiệu 2 số");
        System.out.println("3. Tích 2 số");
        System.out.println("4. Thương 2 số");
        System.out.println("5. Số dư trong phép chia 2 số");
        System.out.println("6. Ước chung lớn nhất");
        System.out.println("7. Bội chung nhỏ nhất");
        System.out.println("8. Thoát");
        System.out.println("Chọn chức năng bất kỳ bằng cách nhập các số từ 1~8");
        int choice = scanner.nextInt();
        switch ( choice ){
            case 1:
                System.out.println("Tổng 2 số là : "+(num1+num2));
                break;
            case 2:
                if (num1 > num2){
                    System.out.println("Hiệu 2 số là : "+(num1-num2));
                }else {
                    System.out.println("Hiệu 2 số là : "+(num2-num1));
                }
                break;
            case 3:
                System.out.println("Tích 2 số là : "+(num1*num2));
                break;
            case 4:
                if (num1 >= num2 && num2 !=0){
                    System.out.println("Thương 2 số là : "+(num1/num2));
                }else if(num2 > num1 && num1 !=0){
                    System.out.println("Thương 2 số là : "+(num2/num1));
                }
                break;
            case 5:
                if (num1 >= num2 && num2 !=0){
                    System.out.println("Số dư trong phép chia 2 số là : "+(num1%num2));
                }else if(num2 > num1 && num1 !=0){
                    System.out.println("Số dư trong phép chia 2 số là : "+(num2%num1));
                }
                break;
            case 6:
                if (num1 ==0 || num2 ==0){
                    System.out.println("Ước chung lớn Nhất là : "+(num1+num2));
                }else {
                    int minNumber ;
                    minNumber = num1 < num2 ? num1 : num2 ;
                    for (int i = minNumber; i >= 1 ; i--) {
                        if (num1 % i ==0 && num2 % i ==0){
                            System.out.println("Ước chung lớn Nhất là : "+i);
                            break;
                        }
                    }
                }
                break;
            case 7:
                if (num1 ==0 || num2 ==0){
                    System.out.println("bội chung nhỏ Nhất là : "+0);
                }else {
                    int MaxNumber = num1 <= num2 ? num1 : num2 ;
                    while (true){
                        if (MaxNumber % num1 ==0 && MaxNumber % num2 ==0){
                            System.out.println("bội chung nhỏ Nhất là : "+MaxNumber);
                            break;
                        }
                        ++MaxNumber;
                    }
                }
                break;
            case 8:
                System.exit(0);
            default:
                System.out.println("lựa chọn của bạn không hợp lệ, mời bạn chọn lại");
        }
        }while (true);
    }
}
