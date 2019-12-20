import java.util.Scanner;
//Напишите программу, вводящую последовательность
//целых чисел, и печатающую количество вхождений в нее фрагмента 1, 2, 3, 4, 5, 6.
public class Dvenazat {
    static void n123456() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите числа");
        int counter = 0;
        int all = 0;
        String y = in.next();
        int i;
        while (true) {
            try {
                i = new Integer(y);
            } catch (NumberFormatException e) {
                break;
            }
            for (int j = 0; j < 6; j++){
                i = new Integer(y);
                if (i == (j+1)){
                    counter++;
                } else {
                    break;
                }
                if (counter == 6) {
                    break;
                }
                System.out.println("количество вхождений в нее фрагмента 1, 2, 3, 4, 5, 6: " + all);
                y = in.next();
            }
            if (counter == 6) {
                all++;
                counter = 0;
            } else { counter = 0; }
            if ( i != 1 ){
                System.out.println("количество вхождений в нее фрагмента 1, 2, 3, 4, 5, 6: " + all);
                y = in.next();
            }
        }
        System.out.println(all);
    }
}
