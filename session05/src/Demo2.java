public class Demo2 {
    public static void main(String[] args) {
        StringBuilder stringbuilder = new StringBuilder("Nguyễn Văn A");
//        System.out.println(stringbuilder.append(" ok"));
        stringbuilder.insert(10,"quoc");
        System.out.println(stringbuilder);
        String fullName = stringbuilder.toString();
        System.out.println(fullName.concat(" KO"));
        System.out.println(fullName);
        System.out.println(stringbuilder.reverse());

        StringBuffer stringBuffer = new StringBuffer("Nguyễn Văn C");
        System.out.println(stringBuffer);
    }
}
