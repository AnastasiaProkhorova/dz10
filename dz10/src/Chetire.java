import java.util.Scanner;

public class Chetire {
    static void odinakovo() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите числа");
        int all = 1;
        int counter = 1;
        int x = in.nextInt();
        String y = in.next();
        int i;
        while (true) {
            try {
                i = new Integer(y);
            } catch (NumberFormatException e) {
                break;
            }
            if (x == i) {
                counter++;
            } else {
                counter = 1;
            }
            if (counter > all) {
                all = counter;
            }
            System.out.println("Максимальное количество подряд идущих одинаковых чисел: " + all);
            x = i;
            y = in.next();
        }
        System.out.println(all);
    }
}
