import java.time.LocalDate;
import java.time.Year;

public class EsercizioQuattro {
    public static void main(String[] args) {
        final LocalDate dataNascita= LocalDate.of(1997,2,03);
        Year annoCorrente = Year.now();

        int annoNas= dataNascita.getYear();
        int annoCorr=annoCorrente.getValue();
        int diff=annoCorr - annoNas;

        String perseguibile =(diff >= 18) ? "Maggiorenne": "Minorenne";
        System.out.println(dataNascita + " "  + annoCorrente);
        System.out.println("Alessandro ha " + diff + " anni, ed è " + perseguibile);
    }
}
