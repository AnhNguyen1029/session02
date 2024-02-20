import java.util.Scanner;

public class Demo5 {
    public static void main(String[] args) {
        //Nhap vao 1 ky tu de kiem tra xem ky tu do la Nguyen am hay phu am (English)
        //nguyen am : ueoai
        //phu am: la cac chu con lai
        Scanner scanner=new Scanner(System.in);
        String kyTu;
        System.out.println("Nhap 1 ky tu de kiem tra co phai nguyen am hay khong");
        kyTu = scanner.nextLine();
        /*
        switch (kyTu){
            case "u":
                System.out.println("Ky tu ban nhap la nguyen am");
                break;
            case "e":
                System.out.println("Ky tu ban nhap la nguyen am");
                break;
            case "o":
                System.out.println("Ky tu ban nhap la nguyen am");
                break;
            case "a":
                System.out.println("Ky tu ban nhap la nguyen am");
                break;
            case "i":
                System.out.println("Ky tu ban nhap la nguyen am");
                break;
            default:
                System.out.println("Ky tu ban nhap la phu am");
        }

         */
        switch (kyTu) {
            case "u", "e", "o", "a", "i":
                System.out.println("Ky tu ban nhap la nguyen am");
                break;
            default:
                System.out.println("Ky tu ban nhap la phu am");
        }
        /*
        if (kyTu == "a" : 0){
            System.out.println("Ky tu ban nhap la nguyen am");
        } else if (kyTu == "u") {
            System.out.println("Ky tu ban nhap la nguyen am");
        } else if (kyTu == "e") {
            System.out.println("Ky tu ban nhap la nguyen am");
        } else if (kyTu == "o") {
            System.out.println("Ky tu ban nhap la nguyen am");
        } else if (kyTu == "i") {
            System.out.println("Ky tu ban nhap la nguyen am");
        }else {
            System.out.println("Ky tu ban nhap la phu am");
        }

         */
    }
}
