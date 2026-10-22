package src;

public class Uctenka {import java.util.ArrayList;
import java.util.List;
import java.math.BigDecimal;

    public class Uctenka {
        List<Produkt> produkty = new ArrayList<>();

        public void pridejProdukt(Produkt produkt) {
            if (produkt == null) {
                throw new IllegalArgumentException("Neplatny produkt");
            }
            produkty.add(produkt);
        }

        public BigDecimal celkem() {
            BigDecimal suma = BigDecimal.ZERO;

            for (Produkt p : produkty) {
                suma = suma.add(p.celkovaCena());
            }

            return suma;
        }

        public void tiskni(String nazev, String adresa) {
            System.out.println("============================");
            System.out.println("        " + nazev);
            System.out.println("        " + adresa);
            System.out.println("============================");

            for (Produkt p : produkty) {
                System.out.printf(
                        "%s %d x %.2f Kc%n",
                        p.nazev, p.pocet, p.cena
                );
                System.out.printf(
                        "            %.2f Kc%n",
                        p.celkovaCena()
                );
            }

            System.out.println("----------------------------");
            System.out.printf("CELKEM: %.2f Kc%n", celkem());
            System.out.println("============================");
            System.out.println("Dekujeme za nakup!");
        }
    }
}
