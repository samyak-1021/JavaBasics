package java_basics;

public class Forloop {
    public static void main(String[] args){
        for(int i = 0; i<5; i++){
            System.out.println(i);
        }
        for(int i = 0; i<=10; i = i+3){
            System.out.println(i);
        }
        //nested for loop
        int n = 5;
        for(int i = 0; i<n; i++)
        {
            for(int j = 0; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
