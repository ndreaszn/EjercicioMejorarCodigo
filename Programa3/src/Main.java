import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        /*

        starting off, this code prints "1 2 3 4 5" which is asking us to choose a number.
        each number subtracts a different amount from the variable g.

         */

        int g = 50; // d
        /*
        int h = 0; // e
        int a = 0;
        int b = 0; // o
        int c = 0;
         */

        System.out.println("1 - Product 1 (10€)");
        System.out.println("2 - Product 2 (7€)");
        System.out.println("3 - Product 3 (20€)");
        System.out.println("4 - Balance");
        System.out.println("5 - Exit");
        boolean x = true;
        while (x) { // loops the following code since x = true (code never stops basically because there's nothing ending it)
            System.out.println("Choose from 1-5:");
            int n = s.nextInt(); // user inputs n's value
            if (n == 1) { // if user inputs "1"
                if (g > 10) {  // if g is bigger than 10
                    g = g - 10; // subtracts -10 from g
                    /*
                    h = h + 5; // adds +5 to h
                    a = a + 1; // adds +1 to a
                    */
                } else { // never runs if g is greater than 10, UNLESS you input "1" enough times to run the previous code (which permanently subtracts -10 from g) until g < 10
                    System.out.println("Not enough money!");
                }
            } else if (n == 2) { // if user inputs "2"
                if (g > 7) { // if g is bigger than 7
                    g = g - 7; // subtracts -7 from g
                    /*
                    h = h + 3; // adds +3 to h
                    b = b + 1; // adds +1 to b
                    */
                } else { // if g is smaller than 7, print "x"
                    System.out.println("Not enough money!");
                }
            } else if (n == 3) { // if user inputs "3"
                if (g > 20) { // if g is bigger than 20
                    g = g - 20; // subtracts -20 from g
                    /*
                    h = h + 10; // adds +10 to h
                    c = c + 1; // adds +1 to c
                    */
                } else { // if g is smaller than 20, print "x"
                    System.out.println("Not enough money!");
                }
            } else if (n == 4) { // if user inputs "4", it prints out the value of each variable
                System.out.println("Money left: " + g + "€");
                /*
                System.out.println(h);
                System.out.println(a);
                System.out.println(b);
                System.out.println(c);
                */
            } else if (n == 5) { // if user inputs "5", x becomes false which stops the loop and causes the code to end
                x = false; // if x is true, the loop will keep going
            }
            if (g < 0) { // "if (g < 0)" doesn't really do anything since g < 0 will always be false, there's no code that allows us to subtract g enough times to reach a negative number
                System.out.println("end");
                x = false;
            }
        }
    }
}
