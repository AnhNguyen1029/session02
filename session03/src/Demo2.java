import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        do {


        Scanner scanner=new Scanner(System.in);
        System.out.println("======menu======");
        System.out.println("1. Thịt gà");
        System.out.println("2. THịt bò");
        System.out.println("3. Thịt lợn");
        System.out.println("4. Thịt cho");
        System.out.println("5. Thoát");
        System.out.println("Mời bạn chọn món ăn");
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                System.out.println("Mời bạn ăn thịt gà");
                break;
            case 2:
                System.out.println("Mời bạn ăn thịt bò");
                break;
            case 3:
                System.out.println("Mời bạn ăn thịt lợn");
                break;
            case 4:
                System.out.println("Mời bạn ăn thịt cho");
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("Sai lựa chọn");
        }
        }while (true);
    }
}
