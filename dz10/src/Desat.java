import java.util.Scanner;

//Напишите программу, вводящую последовательность
// целых чисел, и печатающую максимальную длину монотонного участка ее элементов.
public class Desat {
    static void MaxLength() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите числа");
        int x = in.nextInt();
        System.out.println("максимальная длина монотонного участка: 1");
        int i, counter = 1, max = 1;
        String y = in.next();
        i = new Integer(y);
        while (true) {
            try {
                i = new Integer(y);
            } catch (NumberFormatException e) {
                break;
            }
            while (i > x) {
                counter++;
                if (counter > max) {
                    max = counter;
                }
                System.out.println("максимальная длина монотонного участка: " + max);
                x = i;
                y = in.next();
                i = new Integer(y);
            }
            counter = 1;
            while (i < x) {
                counter++;
                if (counter > max) {
                    max = counter;
                }
                System.out.println("максимальная длина монотонного участка: " + max);
                x = i;
                y = in.next();
                i = new Integer(y);
            }
            counter = 1;
            System.out.println("максимальная длина монотонного участка: " + max);
            x = i;
            y = in.next();
        }
        System.out.println(max);
    }
}
