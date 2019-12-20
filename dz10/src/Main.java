import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Odin a = new Odin();
        Tri c = new Tri();
        Chetire d = new Chetire();
        Pyat e = new Pyat();
        Shest f = new Shest();
        Sem g = new Sem();
        Vosem h = new Vosem();
        Desat r = new Desat();
        Odinnadzat b = new Odinnadzat();
        Dvenazat oh = new Dvenazat();
        Trinazat tr = new Trinazat();
        System.out.println("введи 1 для задачи 7.133");
        System.out.println("введи 3 для задачи 7.135");
        System.out.println("введи 4 для задачи 7.136");
        System.out.println("введи 5 для задачи 7.137");
        System.out.println("введи 6 для задачи 7.138");
        System.out.println("введи 7 для задачи 7.139");
        System.out.println("введи 8 для задачи 7.140");
        System.out.println("введи 10 для задачи 7.142");
        System.out.println("введи 11 для задачи 7.143");
        System.out.println("введи 12 для задачи 7.144");
        System.out.println("введи 13 для задачи 7.145");
        Scanner in = new Scanner(System.in);
        int v = in.nextInt();
        if (v==1){
            a.kmax();
        }else if (v==3) {
            c.Sr();
        }else if (v==4) {
            d.odinakovo();
        }else if (v==5) {
            e.Maxn();
        }else if (v==6) {
            f.nol();
        }else if (v==7) {
            g.bolshe();
        }else if (v==8) {
            h.vtoroi();
        }else if (v==10) {
            r.MaxLength();
        }else if (v==11) {
            b.Grops();
        }else if (v==12) {
            oh.n123456();
        }else if (v==13) {
            tr.n121212();
        }
    }
}