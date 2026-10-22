package src;

public class Produkt {import java.math.BigDecimal;

    public class Produkt {
        String nazev;
        BigDecimal cena;
        int pocet;

        public Produkt(String nazev, BigDecimal cena, int pocet) {
            this.nazev = nazev;
            this.cena = cena;
            this.pocet = pocet;
        }

        public BigDecimal celkovaCena() {
            return cena.multiply(BigDecimal.valueOf(pocet));
        }
    }
}
