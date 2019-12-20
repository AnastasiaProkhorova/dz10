import java.util.Scanner;

//Напишите программу, вводящую последовательность
//целых чисел, и печатающую количество вхождений в нее фрагмента 1, 2, 1, 2, 1, 2.
public class Trinazat {
    static void n121212() {
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
                if (counter%2 == 0 && i == 1) {
                    counter++;
                } else if (counter%2 == 1 && i == 2){
                    counter++;
                } else {
                    break;
                }
                if (counter == 6) {
                    break;
                }
                System.out.println("количество вхождений в нее фрагмента 1, 2, 1, 2, 1, 2: " + all);
                y = in.next();
            }
            if (counter == 6) {
                all++;
                counter = 0;
            } else { counter = 0; }
            if ( i != 1 ){
                System.out.println("количество вхождений в нее фрагмента 1, 2, 1, 2, 1, 2: " + all);
                y = in.next();
            }
        }
        System.out.println(all);
    }
}
