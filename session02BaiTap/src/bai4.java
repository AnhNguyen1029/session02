import java.sql.SQLOutput;
import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num1;
        int num2;
        int tongNum = 0 ;
        System.out.println("Nhập một khoảng số tự nhiên bất kỳ để tính tổng các số chẵn trong đó");
        System.out.println("Số bắt đầu:");
        num1 = scanner.nextInt();
        System.out.println("Số kết thúc:");
        num2 = scanner.nextInt();
        for (int i = num1 ; i <= num2 ; i++){
            if (i %2 ==0){
                tongNum += i ;
            }
        }
        System.out.println("Tổng các số chẵn trong khoảng từ "+num1+" đến "+num2+" là : "+tongNum);

    }
}
