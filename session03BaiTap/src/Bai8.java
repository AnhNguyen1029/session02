import java.sql.SQLOutput;
import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n;
        System.out.println("Nhập một số tự nhiên bất kỳ để thực hiện chức năng trong menu PRACTICE");
        n = scanner.nextInt();
        do {
        System.out.println("**PRACTICE**");
        System.out.println("1. In dãy số chia hết cho 2 và giảm dần (n >= số >= 2)");
        System.out.println("2. In các số nhỏ hơn n và tính tổng");
        System.out.println("3. In ra các ước số chẵn của n");
        System.out.println("4. In ra các ước số lẻ và số lượng các ước lẻ của n");
        System.out.println("5. In ra ước số lẻ lớn nhất của n");
        System.out.println("6. Thoát");
        System.out.println("Mời bạn chọn chức năng bằng cách nhập số từ 1~6");
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                System.out.println("Dãy số chia hết cho 2 và giảm dần là :");
                for (int i = n; i >=2 ; i--) {
                    if (i %2 == 0){
                        System.out.print(" "+i);
                    }
                }
                System.out.println(" ");
                break;
            case 2:
                System.out.println("Dãy số nhỏ hơn "+n+" là :");
                int sum = 0;
                for (int i = 0; i < n; i++) {
                    System.out.print(" "+i);
                    sum += i;
                }
                System.out.println(" ");
                System.out.println("Tổng của dãy số là :"+sum);
                break;
            case 3:
                if(n %2 != 0){
                    System.out.println(n+" không có ước số chẵn");
                }else {
                    System.out.print("Các ước số chẵn của " + n + " là :");
                    for (int i = 1; i <= n; i++) {
                        if (n % i == 0 && i % 2 == 0) {
                            System.out.println(" " + i);
                        }
                    }
                    System.out.println(" ");
                }
                break;
            case 4:
                System.out.print("Các ước số lẽ của " +n+ " là :");
                int count = 0 ;
                for (int i = 1; i <= n; i++) {
                    if (n % i ==0 && i %2 != 0){
                        System.out.print(" "+i);
                        count++;
                    }
                }
                System.out.println(" ");
                System.out.println("Số lượng các ước lẻ của "+n+" là : "+count);
                break;
            case 5:
                System.out.print("Các ước số lẽ lớn nhất của " +n+ " là :");
                for (int i = n; i > 0; i--) {
                    if (n % i == 0 && i % 2 != 0) {
                        System.out.print(" " + i);
                        break;
                    }
                }
                System.out.println(" ");
                break;
            case 6:
                System.exit(0);
            default:
                System.out.println("Bạn nhập không hợp lệ, Mời bạn nhập lại");
        }
        }while (true);
    }
}
