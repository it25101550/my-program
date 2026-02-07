import java.util.Scanner;
public class Question05 {

   
    public static int add(int a, int b) {
        return a + b;
    }

  
    public static int multiply(int a, int b) {
        return a * b;
    }

    
    public static int square(int a) {
        return a * a;
    }

    public static void main(String[] args) {

       
        int part1 = add(multiply(3, 4), multiply(5, 7));
        int result1 = square(part1);

       
        int part2 = square(add(4, 7));
        int part3 = square(add(8, 3));
        int result2 = add(part2, part3);

        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
    }
}