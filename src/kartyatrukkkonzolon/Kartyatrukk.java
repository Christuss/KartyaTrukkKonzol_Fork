
package kartyatrukkkonzolon;

import java.util.Scanner;

public class Kartyatrukk {
    private Scanner sc = new Scanner(System.in);

    public Kartyatrukk() {
    }
    
    public void indit() {
        
    }
    public void melyik() {
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
