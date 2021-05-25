package java_basics;

public class Operators {
    public static void main(String[] args){
        //arithmetic operators +,-,*,/
        int x = 10;
        int y = 20;
        //addition
        System.out.println(x+y);
        //subtract
        System.out.println(y-x);
        //multiply
        System.out.println(x*y);
        //divide
        System.out.println(y/x);

        //relational operators <,>,<=,>=,==
        int xa = 10;
        int yb = 20;
        System.out.println(xa<yb);
        System.out.println(xa>yb);
        System.out.println(xa>=yb);
        System.out.println(xa<=yb);
        System.out.println(xa==yb);

        //logical operators AND(&&) , OR(||)
        boolean a = true;
        boolean b = false;
        System.out.println(a&&b);
        System.out.println(b&&a);
        System.out.println(a||b);
        System.out.println(b||a);
    }
}
