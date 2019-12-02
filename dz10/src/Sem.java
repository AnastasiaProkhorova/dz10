import java.util.Scanner;

public class Sem {
    static void bolshe() {
        Scanner in = new Scanner(System.in);
        System.out.println("введите числа");
        int counter = 0;
        int x = in.nextInt();
        String y = in.next();
        int i;
        while (true) {
            try {
                i = new Integer(y);
            } catch (NumberFormatException e) {
                break;
            }
            if (i > x) {
                counter++;
            }
            x = i;
            y = in.next();
        }
        System.out.println(counter);
    }
}
