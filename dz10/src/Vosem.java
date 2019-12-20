import java.util.Scanner;
//Напишите программу, вводящую последовательность целых чисел,
//и печатающую второй по величине ее элемент и No, если такого элемента нет.
public class Vosem {
    static void vtoroi() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите числа");
        String y = in.next();
        int i = new Integer(y);
        int max = i, max2 = 0;
        while (true) {
            try {
                i = new Integer(y);
            } catch (NumberFormatException e) {
                break;
            }
            if (i > max) {
                max2 = max;
                max = i;
            } else if (max > i && i > max2) {
                max2 = i;
            }
            System.out.println("Второе по величине число: " + max2);
            y = in.next();
        }
        System.out.println(max2);
    }
}
