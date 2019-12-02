import java.util.Scanner;

public class Shest {
    static void nol() {
        Scanner in = new Scanner(System.in);
        System.out.println("введите числа");
        String y = in.next();
        int Zero;
        int ZeroID = 0;
        int ID = 1;
        boolean g = true;
        boolean g2 = true;
        while (g == true) {
            try {
                Zero = new Integer(y);
            } catch (NumberFormatException e) {
                break; }
            while (g2 == true){
                try {
                    Zero = new Integer(y);
                } catch (NumberFormatException e) {
                    break; }
                if (Zero == 0){
                    ZeroID = ID;
                    System.out.println("номер первого элемента равного нулю: " + ZeroID);
                    g2 = false;
                    break; }
                y = in.next();
                ID++;
            }
            if (ZeroID == 0){
                System.out.println(0);}
            y = in.next();
        }
    }
}
