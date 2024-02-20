import java.util.Scanner;

public class bai5KiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number;
        System.out.println("Hãy nhập một số bất kỳ để kiểm tra xem có phải số nguyên tố hay không");
        number = scanner.nextInt();
        int check = 0;
        for (int i = 1; i <= number; i++) {
            if(number % i == 0){
                check++;
            }
        }
        if (check == 2){
            System.out.println("Số bạn nhập là số nguyên tố");
        }else {
            System.out.println("Số bạn nhập không phải số nguyên tố");
        }
    }
}
