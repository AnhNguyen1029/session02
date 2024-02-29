package Demo2;

public class cat {
    //trường
    private String catName;
    private int age;
    private String color;

    public cat() {
    }

    public cat(String catName, int age, String color) {
        this.catName = catName;
        this.age = age;
        this.color = color;
    }

    //phương thức in thông tin con mèo
    public void showInfo(){
        System.out.println("Tôi tên là : "+catName);
        System.out.println("Tôi có màu : "+color);
        System.out.println("Năm nay tôi :"+age+" tuổi");
    }

    public void setCatName(String catName){
        this.catName = catName ;
    }

    public String getCatName(){
        return catName;
    }
}
