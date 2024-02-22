public class Demo1 {
    public static void main(String[] args) {
        // 3 sinh viên 1 vs chứa 3 đầu điểm

        double[] sv1 = {8,5,7};
        double[] sv2 = {9,9,9};
        double[] sv3 = {5,5,5};
        double[][] svs = {sv1,sv2,sv3};//double svs là mảng và con của nó cũng là mảng nên là sau[] thêm 1 [] nữa
        for (int i = 0; i < svs.length; i++) {
            for (int j = 0; j < svs[i].length; j++) {
                System.out.print(" "+svs[i][j]);
            }
            System.out.println(" ");
        }
    }
}
