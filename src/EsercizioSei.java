import java.time.LocalDate;
import java.time.Year;

public class EsercizioSei {
    public static void main(String[] args) {
        final LocalDate dataNascita = LocalDate.of(1997, 2, 03);
        Year annoCorrente = Year.now();

        int annoNas= dataNascita.getYear();
        int annoCorr=annoCorrente.getValue();
        int diff=annoCorr - annoNas;

        String pari= ((diff + 1) % 2 == 0) ? "Il numero è pari":"Il numero è dispari";
        System.out.println(pari);

    }
}
