package ra.demo1;

public class Test {
    public static void main(String[] args) {
        Session<String,Integer> session = new Session("age",1);
        Session<String,String> session1 = new Session("name","NG VAN");
        System.out.println(session1);
        System.out.println(session);
    }
}
