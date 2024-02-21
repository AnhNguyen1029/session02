import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] number = new int[5];
        System.out.println("Mời bạn nhập 5 số nguyên bất kỳ để tạo giá trị của mảng:");
        number[0] = scanner.nextInt();
        number[1] = scanner.nextInt();
        number[2] = scanner.nextInt();
        number[3] = scanner.nextInt();
        number[4] = scanner.nextInt();
        for (int i = 0; i < 5; i++) {
            System.out.println("các giá trị thứ "+(i+1)+" của mảng là : "+ number[i]);
        }
    }
}
