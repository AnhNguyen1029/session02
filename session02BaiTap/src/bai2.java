import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num;
        System.out.println("mời bạn nhập một số từ 0 => 9 để biết cách đọc số");
        num = scanner.nextInt();
        switch (num){
            case 0:
                System.out.println("số không");
                break;
            case 1:
                System.out.println("số một");
                break;
            case 2:
                System.out.println("số hai");
                break;
            case 3:
                System.out.println("số ba");
                break;
            case 4:
                System.out.println("số bốn");
                break;
            case 5:
                System.out.println("số năm");
                break;
            case 6:
                System.out.println("số sáu");
                break;
            case 7:
                System.out.println("số bảy");
                break;
            case 8:
                System.out.println("số tám");
                break;
            case 9:
                System.out.println("số chín");
                break;
            default:
                System.out.println("Số bạn nhập nằm ngoài từ 0 đến 9");
        }
    }
}
