import java.util.Scanner;
//Напишите программу, вводящую последовательность целых чисел, и печатающую номера
//первого и последнего ее максимальных элементов.
public class Pyat {
    static void Maxn() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите числа");
        int Max1 = in.nextInt();
        int Max2 = in.nextInt();
        String y = in.next();
        int ID = 1;
        int ID1 = 1;
        int ID2 = 1;
        int nov;
        while (true) {
            ID++;
            try {
                nov = new Integer(y);
            } catch (NumberFormatException e) {
                break; }
            if ((nov > Max1)&&(nov > Max2)){
                Max1 = Max2;
                ID1 = ID2;
                ID2 = ID;
            } else if (Max2 == Max1){
                ID2 = ID;
            }else if (Max2 < Max1){
                ID2 = ID;
            }
            System.out.println("номер первого максимального числа: " + ID1 + ", номер второго максимального числа: " + ID2);
            y = in.next();
        }
        if ((ID1 == 1) && (ID2 == 1) || (ID2 < ID1)){
            System.out.println("друг, ты не прав");
        } else {
            System.out.println("номер первого максимального числа: " + ID1 + ",номер второго максимального числа2: " + ID2);
        }
    }
}