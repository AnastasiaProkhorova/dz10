import java.util.Scanner;

public class Vosem {
    static void vtoroi() {
        Scanner in = new Scanner(System.in);
        System.out.println("введите числа");
        String y = in.next();
        int i = new Integer(y);
        int min2 = i, min = min2;
        while (true) {
            try {
                i = new Integer(y);
            } catch (NumberFormatException e) {
                break;
            }
            if (i<min){
                min2 = min;
                min = i;
            } else if(min<i && i<min2)
                min2 = i;
            y = in.next();
        }
        System.out.println("Второе по величине число: "+min2);
    }
}
