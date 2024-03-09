import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        ===========MENU==========
//        1. Nhập vào giá trị các phần tử mảng
//        2. In ra các phần tử mảng
//        3. Hiển thị dưới dạng ma trận
//        4. In ra đường chéo chính
//        5. In ra Đường chéo phụ
//        6. In ra đường biên
//        7. Thoát chường trình
        System.out.println("Mời bạn nhập số hàng và số cột của mảng muốn tạo");
        System.out.println("Số hàng :");
        int row = scanner.nextInt();
        System.out.println("Số cột :");
        int col = scanner.nextInt();
        int[][] matrix = new int[row][col];
        do {


            System.out.println("===========MENU==========");
            System.out.println("1. Nhập vào giá trị các phần tử mảng");
            System.out.println("2. In ra các phần tử mảng");
            System.out.println("3. Hiển thị dưới dạng ma trận");
            System.out.println("4. In ra đường chéo chính");
            System.out.println("5. In ra Đường chéo phụ");
            System.out.println("6. In ra đường biên");
            System.out.println("7. Thoát chường trình");
            System.out.println("Mời bạn chọn bằng cách nhập số từ 1~7!");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhập vào các giá trị phần tử của mảng ");
                    for (int i = 0; i < matrix.length; i++) {
                        for (int j = 0; j < matrix[i].length; j++) {
                            System.out.printf("arr[%d][%d]=", i, j);
                            matrix[i][j] = scanner.nextInt();
                        }
                    }
                    break;
                case 2:
                    System.out.println("Các phần tử của mảng là :");
                    for (int i = 0; i < matrix.length; i++) {
                        for (int j = 0; j < matrix[i].length; j++) {
                            System.out.println(matrix[i][j]);
                        }
                    }
                    break;
                case 3:
                    System.out.println("các phần tử của mảng dưới dạng ma trận là:");
                    for (int i = 0; i < matrix.length; i++) {
                        for (int j = 0; j < matrix[i].length; j++) {
                            System.out.print(matrix[i][j]+"  ");
                        }
                        System.out.println(" ");
                        System.out.println(" ");
                    }
                    break;
                case 4:
                    System.out.println("Các giá trị trên đường chéo chính là :");
                    for (int i = 0; i < matrix.length; i++) {
                        for (int j = 0; j < matrix[i].length; j++) {
                            if (i == j) {
                                System.out.println(matrix[i][j]+"  ");
                            }else {
                                System.out.print("  ");
                            }
                        }
                        System.out.println(" ");
                        System.out.println(" ");
                    }
                    break;
                case 5:
                    System.out.println("Các giá trị trên đường chéo phụ là :");
                    for (int i = 0; i < matrix.length; i++) {
                        for (int j = 0; j < matrix[i].length; j++) {
                            if ((i + j) == matrix[i].length-1) {
                                System.out.println(matrix[i][j]);
                            }else {
                                System.out.print("  ");
                            }
                        }
                        System.out.println(" ");
                        System.out.println("  ");
                    }
                    break;

                case 6:
                    System.out.println("Các giá trị trên đường biên là :");
                    for (int i = 0; i < matrix.length; i++) {
                        if (i == 0) {
                            for (int j = 0; j < matrix[i].length; j++) {
                                System.out.println(matrix[i][j]);
                            }
                        } else if (i >= 1 && i < matrix.length - 1) {
                            for (int j = 0; j < matrix[i].length; j++) {
                                if (j == 0 || j == matrix[i].length - 1) {
                                    System.out.println(matrix[i][j]);
                                }
                            }
                        } else {
                            for (int j = 0; j < matrix[i].length; j++) {
                                System.out.println(matrix[i][j]);
                            }
                        }


                    }
                    break;
                case 7:
                    System.exit(0);

                default:
                    System.out.println("Số bạn nhập không hợp lệ");
            }
        } while (true);

    }
}
