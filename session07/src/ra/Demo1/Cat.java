package ra.Demo1;

public class Cat extends Animal{
    //extends là thừa hưởng thuộc tính của thằng Animal
    private String color;

    public Cat() {
        super();

    }

    public Cat(String name, String type, String color) {
        super(name, type);
        this.color = color;
    }

    public void batChuot(){
        System.out.println("Mèo đã bắt được chuột");
        super.eat();
    }
}
