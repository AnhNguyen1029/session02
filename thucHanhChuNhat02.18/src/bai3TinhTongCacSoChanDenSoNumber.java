import java.util.Scanner;

public class bai3TinhTongCacSoChanDenSoNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Hãy nhập số bất kỳ để tính tổng các số chẵn từ 0 đến nó");
        int num;
        num = scanner.nextInt();
        int sum = 0 ;
        for (int i = 0; i <= num ; i++) {
            if (i %2 ==0){
                sum += i;
            }
        }
        System.out.println("Tổng các số chẵn từ 0 đến "+num+"là :"+sum);
    }
}
