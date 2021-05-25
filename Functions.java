package java_basics;

public class Functions {
    public static void main(String[] args){

        sparta();
        adding(5,5);
        swapFunction(3,2);
        //area(2,3);
        //area(3);
    }
    //function without a parameter
    public static void sparta(){
        System.out.println("Hello this is a function named sparta");
    }
    //function with adding of two numbers paramters
    public static void adding(int num1,int num2){
        System.out.println(num1+num2);
    }
    //function with return values
    public int add(int x,int y){
        int result = x+y;
        return result;
    }
    //swapping values function 
    public static void swapFunction(int a,int b){
        System.out.println("The numbers before swapping, a:"+a+" "+"b:"+b);
        int c = a;
        a = b;
        b = c;
        System.out.println("The numbers after swapping, a:"+a+" "+"b:"+b);
    }
    /*method over-loading in functions having the same name but different parameters
    public static int area(int n1,int n2){
        System.out.println(n1*n2);
    }
    public static float area(int n){
        System.out.println(3.14f*n*n);
    }*/
    int val1 = 10;

    int val2 = 20;

    int max = val1 >= val2 ? val1 : val2;
    
    
}
