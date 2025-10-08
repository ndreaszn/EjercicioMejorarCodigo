import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random(); // generates random number

        int v = 30, m = 30, d = 5, x = 0;
        boolean a = true;

        while (a) { // loops if a = true
            int o = s.nextInt();

            if (o == 0) break; // stops loop if user inputs "0"

            if (o == 1) { // if user inputs "1"
                v -= 3 + r.nextInt(5); // v = 30 - 3 -> v = 27 + random number
                x += 5 + r.nextInt(7); // x = 0 + 5 -> x = 5 + random number
                if (x >= 50 && x % 50 < 10) d += 2; // if x is greater or equal than 50 and also
            }

            if (o == 2) { // if user inputs "2"
                v += 10; // v = 30 + 10 -> v = 40 + random number
                if (v > m) v = m; // if the value of v is bigger than m, set v equal to m
            }

            if (o == 3) v = m; // if user inputs "3", make v equal to m

            if (o == 4) { // if user inputs "4"
                x += 5 + r.nextInt(7); // x = 0 + 5 -> x = 5 + random number
                d += x / 100; // d + x = 5 -> d = 5 / 100
            }

            if (v <= 0) a = false; // if v becomes smaller or equal than 0, stop the code
        }


}
}
