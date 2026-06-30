package language_fundamentals;

public class Static_Variable {

    static int x= 80;
    public static void main(String[] args) {
        System.out.println(x);
        System.out.println(Static_Variable.x);
        Static_Variable obj = new Static_Variable();
        System.out.println(obj.x);


    }

    public  static void m2(){
        System.out.println(x);
    }

}

/*
*  the value of static varible not vary from object to object . such type of variable declare using static modifier.
*   it creates during class loading. and destroys during class unloading.
* declare directly inside the class but outside the any method , block and constructor.
* store in memory area.
* default values assign by JVM not need to initialize.
* it can acess from both static and instance areas.
* it can access either be object reference or class name; recommended class name.
* known as class level variables or fields;
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
* */