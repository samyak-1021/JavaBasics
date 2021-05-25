//if and else if statements in java
package java_basics;

public class Ifelseifstatement { 
public static void main(String[] args) {     
    int marks = 70;
    if(marks<50){
        System.out.println("Fail");
    }
    else if(marks>=90 && marks<100){
        System.out.println("A Grade");
    }
    else if(marks>=80 && marks<90){
        System.out.println("B Grade");
    }
    else if(marks>=70 && marks<80){
        System.out.println("C Grade");
    }
    else if(marks>=60 && marks<70){
        System.out.println("D Grade");
    }
    else if(marks>=50 && marks<60){
        System.out.println("E Grade");
    }
    else{
        System.out.println("Your marks are invalid!");
    }
//checking for negative value
    int num = -10;
    if(num>0){
        System.out.println("It is a positive value");
    }
    else if(num<0){
        System.out.println("It is a negative value");
    }
    else{
        System.out.println("The value is 0");
    }
}
}