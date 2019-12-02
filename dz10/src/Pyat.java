import java.util.Scanner;

public class Pyat {
    static void Maxn() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите числа");
        int x = in.nextInt();
        String y = in.next();
        int ID = 1;
        int ID1 = 1;
        int ID2 = 0;
        int Max1 = x;
        int Max2;
        while (true) {
            ID++;
            try {
                Max2 = new Integer(y);
            } catch (NumberFormatException e) {
                break; }
            if (Max2 > Max1){
                Max1 = Max2;
                ID1 = ID;
                ID2 = ID;
            } else if (Max2 == Max1){
                ID2 = ID;
            }
            y = in.next();
        }
         if ((ID1==ID2)){
            System.out.println("Только одно максимальное значение");
        } else {
            System.out.println("Номер первого максимального элемента: " + ID1 + "\n" + "Номер последнего максимального элемента: " + ID2);
        }
    }
}