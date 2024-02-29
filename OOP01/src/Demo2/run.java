package Demo2;

import java.util.Scanner;

public class run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        cat cat1 = new cat();
        String cat1Name = scanner.nextLine();
        cat1.setCatName(cat1Name);
        cat1.showInfo();
        cat cat2 = new cat("Tom",100,"xám");
        cat2.showInfo();
        System.out.println("cat 2 name la :"+cat2.getCatName());
    }
}
