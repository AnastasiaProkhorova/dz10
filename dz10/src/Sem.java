import java.util.Scanner;
//Напишите программу, вводящую последовательность
//целых чисел, и печатающую число элементов, больших предыдущего
//(первый элемент последовательности тоже считается таким).
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
            System.out.println("число элементов, больших предыдущего: "+counter);
            x = i;
            y = in.next();
        }
        System.out.println(counter);
    }
}
