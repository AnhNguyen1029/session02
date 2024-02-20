import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        //Nhap vao so tu 2 - 8
        //dua ra man hinh thu tuong ung bang chu, vi du nhap so 2 ==> hom nay la thu 2
        Scanner scanner=new Scanner(System.in);
        int num;
        System.out.println("Nhap vao so tu 2-8");
        num = scanner.nextInt();
        switch (num){
            case 2:
                System.out.println("hom nay la thu hai");
                break;
            case 3:
                System.out.println("hom nay la thu ba");
                break;
            case 4:
                System.out.println("hom nay la thu tu");
                break;
            case 5:
                System.out.println("hom nay la thu nam");
                break;
            case 6:
                System.out.println("hom nay la thu sau");
                break;
            case 7:
                System.out.println("hom nay la thu bay");
                break;
            case 8:
                System.out.println("hom nay la chu nhat");
                break;
            default:
                System.out.println("sai dinh dang");
        }
    }
}
