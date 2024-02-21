import java.util.Scanner;

public class text {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Mời bạn nhập 2 số nguyên bất kỳ");
        System.out.println("Số thứ nhất:");
        int num1;
        int num2;
        num1 = scanner.nextInt();
        System.out.println("Số thứ hai:");
        num2 = scanner.nextInt();
        System.out.println("xong");
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
    }
}
