package java_basics;

public class Arrays {
    public static void main(String[] args){
        //simple array
        char[] x = new char[5];
        x[0] = 'a';
        x[1] = 'b';
        x[2] = 'c';
        x[3] = 'd';
        x[4] = 'e';
        //To print everything in one line
        System.out.println(x);
        //To print each one of them line by line
        for(int i = 0; i<5; i++){
            System.out.println(x[i]);
        }
        //Array using a for loop
        int[] a = new int[10];
        for(int i = 0; i<10; i++){
            a[i]=i;
        }
        for(int i = 0; i<10; i++){
            System.out.println(a[i]);
        }
        //adding 2 arrays
        int[] b = new int[5];
        int[] c = new int[5];
        int[] d = new int[5];
        int num = 5;
        //putting valuas in array b
        for(int i=0; i<5; i++){
            b[i]=i;
        }
        //putting values in array c
        for(int i=0; i<5; i++){
            c[i]=num;
            //for number 5-9
            num++;
        }
        //printing array b
        System.out.print("Values of array b:");    
        for(int i=0; i<5; i++){
            System.out.print(b[i]+" ");
        }
        //printing array c
        System.out.print("\nvalues of array c:");
        for(int i=0; i<5; i++){
            System.out.print(c[i]+" ");
        }
        //adding arrays
        for(int i=0; i<5; i++){
            d[i] = b[i] + c[i];
        }
        //printing array d
        System.out.print("\nValues of array d:");
        for(int i=0; i<5; i++){
            System.out.print(d[i]+" ");
        }
        //multidimensional array
        //System.out.print("\nThis is a multidimensional array: ");
        int [][] s = new int[3][3];
        int numb = 0;
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                s[i][j]=numb;
                numb++;
            }
        }
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(s[i][j]+" ");
            }
            System.out.println();
        }

    }
}
