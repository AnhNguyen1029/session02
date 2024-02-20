import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number;
        System.out.println("nhập một số bất kỳ để xem có chia hết cho 3 và 5 hay không");
        number = scanner.nextInt();
        if (number %3 == 0 && number %5 == 0){
            System.out.println("Số bạn nhập là số chia hết cho 3 và 5");
        }else {
            System.out.println("Số bạn nhập không chia hết cho 3 và 5");
        }
    }
}
