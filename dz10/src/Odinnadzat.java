import java.util.Scanner;
//Напишите программу, вводящую последовательность
//из нулей и единиц, печатающую число групп из единиц, разделенных нулями.
public class Odinnadzat {
    static void Grops() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите числа");
        int counter = 0;
        int x = in.nextInt();
        String y = in.next();
        int i;
        i = new Integer(y);
        if (x > i) {
            counter++;
        }
        while (x == 1 && i == 1) {
            try {
                i = new Integer(y);
            } catch (NumberFormatException e) { break; }
            if (i == 0 || i == 1) {
                counter = 1;
            } else {  break;  }
            System.out.println("число групп из единиц: " + counter);
            x = i;
            y = in.next();
        }
        while (true) {
            try {
                i = new Integer(y);
            } catch (NumberFormatException e) {
                break;
            }
            if (i == 0 || i == 1) {
                if (x == 0 && i == 1) {
                    counter++;
                }
            } else { break; }
            System.out.println("число групп из единиц:" + counter);
            x = i;
            y = in.next();
        }
        System.out.println(counter);
    }
}
