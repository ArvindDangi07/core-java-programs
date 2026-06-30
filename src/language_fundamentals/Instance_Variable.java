package language_fundamentals;

import javax.crypto.spec.PSource;

public class Instance_Variable {
    int x;
    public static void main(String[] args) {
       // System.out.println(x);
        Instance_Variable obj = new Instance_Variable();
        System.out.println(obj.x);
    }
    public void m1(){
        System.out.println(x);
    }
}


/*
*  Instance variable is also called object level variable and attributes.
* it declares inside the class directly not in method , constructor.
* value of instance variable is different for each object vary from object to object.
* stored in Heap memory area.
* we cant access from static area directly but through object reference.
* we can access directly from instance area.
* not need to initialize jvm provide default values.
* Instance variable created at object creation and destroy at object destruction.

*
* */