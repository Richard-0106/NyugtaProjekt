package nyugtaprojektek;

public class Nyugta1 {

    public static void main(String[] args) {
        int T1=350;
        int T2=90;
        int T3=650;
        int ossz=T1+T2+T3;
        
        csillag();
        System.out.println("     Nyugta 1");
        csillag();
        System.out.printf("Tétel 1: %5d Ft",T1);
        System.out.printf("\nTétel 2: %5d Ft",T2);
        System.out.printf("\nTétel 3: %5d Ft\n",T3);
        duplaVonal();
        System.out.printf("Összesen:  %d Ft\n",ossz);
        vonal();
        System.out.println("Kedvezmény: 109 Ft");
        System.out.println("(10%)");
        duplaVonal();
        System.out.println("Fizetendő:  981 Ft");
        vonal();
        System.out.println("");
        System.out.print("_______");
        System.out.print("   ");
        System.out.println("_______");
        System.out.print(" Dátum");
        System.out.print("   ");
        System.out.println("   Név");
        csillag();
        System.out.println("        CÉG");
        csillag();
    }

    private static void vonal() {
        System.out.println("------------------");
    }

    private static void duplaVonal() {
        System.out.println("==================");
    }

    private static void csillag() {
        System.out.println("******************");
    }
    
}
