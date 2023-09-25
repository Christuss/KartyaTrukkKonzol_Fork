
package nezet;

import java.util.Scanner;
import modell.Pakli;

public class Kartyatrukk {
    private Scanner sc = new Scanner(System.in);
    private Pakli palki;

    public Kartyatrukk(){
        this.indit();
    }
    
    /**
     *
     */
    public void indit() {
        palki = new Pakli();
        this.palki.feltolt();
        for (int i = 0; i < 3; i++) {
            System.out.println(this.palki.kirak());
            int oszlop = melyik();
            this.palki.kever(oszlop);
        }
        System.out.println(this.palki.ezVolt());
    }
    public int melyik() {
        boolean jo;
        int oszlop;
        do {
            System.out.print("melyik oszlop (1-3): ");
            oszlop = sc.nextInt();
            jo = oszlop >= 1 && oszlop <= 3;
        } while (!jo);
        return oszlop;
    }
}
