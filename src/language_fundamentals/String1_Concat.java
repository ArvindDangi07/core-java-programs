package language_fundamentals;

public class String1_Concat {

    public static void main(String[] args) {
        int x = 5;
        System.out.println(x+x+"java");   // 10java
        System.out.println(10+20+"java"); // 30java
        System.out.println("java"+30+20); // java3020
        System.out.println(10+"java"+20); // 10java20

    }
}

/*

String Concatenation
_____________________________

* '+' operator perform like both addition and string concatenation.
* works from left to right .
* If one operand is a string, then the operation becomes concatenation.
* so once a string is encountered, all subsequent operations are treated as string concatenation.


*/