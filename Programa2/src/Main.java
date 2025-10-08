import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    /*

    number guesser. gives you hints if you're close to the number or not

     */

    int x = (int)(Math.random() * 10 + 1); // Math.random returns a value greater or equal to 0.0 but less than 1.0
    int y = 0;
    while (y != x) { // if y isn't the same value as x, code won't stop
        y = s.nextInt(); // user inputs any number
        if (y == x) // if y is the same as x, print "i" (code will stop)
            System.out.println("you got it! | " + "x = " + x);
        else if (y > x) // if y is greater than x, print "e"
            System.out.println("less");
        else // anything else (if y is smaller than x for example), print a
            System.out.println("higher");
    }
}}