class Person{
    String name = "Payal";
    void display(){
    System.out.println("Parent class");
}
}

class child extends Person{
    String name = "Name2";
    void show(){
        super.display();
        System.out.println(name);
        System.out.println(super.name);
    }
}

public class Main1{
    public static void main(String[] args){
        child c1 = new child();
        c1.show();
    }
}