import java.util.Scanner;
//Напишите программу, вводящую последовательность
//целых чисел, и печатающую количество ее максимальных элементов.
public class Odin {
    static void kmax() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите последовательность чисел");
        int max = Integer.MIN_VALUE;
        int kolvo = 1;
        try{
            while (true) {
                int x = in.nextInt();
                if (x > max) {
                    max = x;
                    kolvo = 1;
                } else if (x == max)
                    kolvo++;
                System.out.println("количестко максимальных: " + kolvo);
            }
        }
        catch(NumberFormatException e) {
            ;
        }
    }
}

