import java.util.Scanner;

public class bai7TimSoFibonacciThuN {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int f0 = 0 ;
        int f1 = 1 ;
        int fN = 0 ;
        int num ;
        System.out.println("Bạn cần tìm số Fibonacci thứ bao nhiêu ?");
        num = scanner.nextInt();
//        System.out.print(f0+" "+f1);
        for (int i = 2; i < num ; i++) {
            fN = f0 + f1 ;
//            System.out.print(" "+fN);
            f0 = f1 ;
            f1 = fN ;
        }
        System.out.println("Số Fabonacci thứ "+num+" là : "+fN);
    }
}
