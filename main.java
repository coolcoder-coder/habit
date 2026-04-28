import java.util.Scanner;
class parent{
    String name = "Payal"
    void display{
        System.out.print("Parents class");
    }

}
class child extends parent{
    String name = "Name1";
    void display(){
    System.out.println(name);
    System.out.println(super.name);
    }
}
public class Main{
    public static void main(String [] args){
        child c = new child();
        c.display1();
    }
}