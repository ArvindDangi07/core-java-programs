package package_modifier;

public class Source_File_Struct {

}
 class A {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
}

class B extends A {
    void show() {
        System.out.println("Hello");
    }
}
