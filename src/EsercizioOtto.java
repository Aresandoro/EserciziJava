public class EsercizioOtto {
    public static void main(String[] args) {
        String var = "Ciao Mondo";

        char carattere = 'o';
        int indice = var.indexOf(carattere);
        System.out.println((indice % 2 == 0) ? "pari": "dispari");
    }
}
