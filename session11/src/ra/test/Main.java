package ra.test;

import ra.demo1.Utill;

public class Main {
    public static void main(String[] args) throws Exception {
        Utill utill = new Utill();
        try {
            String[] arr = utill.convertStringToArray("a:b:c,a");
            for (String item : arr) {
                System.out.println(item);
            }
        }catch (Exception exception){
        }
    }
}
