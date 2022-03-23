package nyugtaprojektek;
/* Probléma:
a 3. tétel árát 650-ről átírtuk 1320-ra.
Így szinte minden változott, mindenhez hozzá kell nyúlni
Refaktorizálás:
anmit egynél többször használunk, 
azt kiszervezzük változóba és erre hivatkozunk
*/
public class Nyugta2 {

    public static void main(String[] args) {
        
        int tetel1 = 350, tetel2 = 90, tetel3 = 1320;
        int osszesen = tetel1 + tetel2 + tetel3;
        int kedvMertek = 10;
        int kedvezmeny = osszesen / kedvMertek;
        String huf = "Ft";
        int fizetendo = osszesen - kedvezmeny;
        double euro = fizetendo / 350.0;
        
        csillagok();
        System.out.println("     Nyugta 2");
        csillagok();
    
        System.out.printf("Tétel 1: %7d %2s\n", tetel1, huf);
        System.out.printf("Tétel 1: %7d %2s\n", tetel2, huf);
        System.out.printf("Tétel 3: %7d %2s\n", tetel3, huf);

        duplaVonal();
        
        System.out.printf("Összesen:   %d %s\n", osszesen, huf);
        
        String szaggatottVonal = "-------------------";
        System.out.println(szaggatottVonal);
        
        System.out.printf("Kedvezmény:  %d %s\n", kedvezmeny, huf);
        
        System.out.printf("(%d%%)\n", kedvMertek);
        
        duplaVonal();
        
        System.out.printf("Fizetendő:  %d %s\n", fizetendo, huf);
        huf = "\u20ac";//EZ NEM JÓ!!!!
        System.out.printf("         %f %s\n", euro, huf);
        
        System.out.println(szaggatottVonal+"\n");
        
        String rovidVonal = "_______";
        System.out.print("\n"+rovidVonal);
        String rovidVonalValaszto = "      ";
        System.out.print(rovidVonalValaszto);
        rovidVonal();
        
        System.out.print(" Dátum");
        
        System.out.print(rovidVonalValaszto);
        
        System.out.println("   Név");
        
         csillagok();
        
        System.out.println("        CÉG");
        
         csillagok();
    
    }
    private static void csillagok() {
         System.out.println("******************");
        
    }
      private static void rovidVonal() {
         System.out.println("_______");
        
    }
        private static void duplaVonal() {
         System.out.println("==================");
        
    }

}
