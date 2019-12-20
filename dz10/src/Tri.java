import java.util.Scanner;
//Напишите программу, вводящую последовательность вещественных чисел,
//и печатающую среднее арифметическое ее элементов
//(для непустой последовательности).
public class Tri {
    static void Sr() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите числа");
        double all = 1;
        String x = in.next();
        int i = new Integer(x);
        double averge = i;
        double sum = i;
        while (true){
            x  = in.next();
            all++;
            try {
                i = new Integer(x);
            } catch (NumberFormatException e) {
                break; }
            sum+=i;
            averge = sum/all;
            System.out.println("Среднее арифметическое равно "+ averge);
        }
        System.out.println(averge);
    }
}
