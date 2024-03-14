package qltv;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Category implements IEtity{
    private String id;
    private String name;
    private String status;

    public Category() {
    }

    public Category(String id, String name, String status) {
        this.id = id;
        this.name = name;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String isStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("mời bạn nhập id");
        id = scanner.nextLine();
        System.out.println("Mời bạn nhập tên thể loại");
        name = scanner.nextLine();
        Pattern nameRegex = Pattern.compile("[a-zA-Z0-9 ]{1,}");
        Matcher nameCheck = nameRegex.matcher(name);
        System.out.println("Mời bạn nhập trạng thái bằng cách nhập true/false");
        status = scanner.nextLine();
        Pattern stastusRegex = Pattern.compile("(true|false)");
        Matcher statusCheck = stastusRegex.matcher(status);

    }

    @Override
    public void onput() {
        IEtity.super.onput();
        System.out.println("Mã thể loại sách là :"+id);
        System.out.println("tên thể loại sách là :"+ name);

    }
}
