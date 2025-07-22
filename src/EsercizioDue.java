import java.util.Scanner;

public class EsercizioDue {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Inserisci la tua età: ");
        short eta = in.nextShort();

        long timestamp = System.currentTimeMillis() / 1000;

        System.out.print("Reddito medio: ");
        double reddito = in.nextDouble();
        in.nextLine();

        System.out.print("Inserire nome: ");
        String nome = in.nextLine();
        System.out.println("Inserire cognome: ");
        String cognome = in.nextLine();

        boolean maggiorenne = false;

        if (eta >= 18)
            maggiorenne = true;

        System.out.print(maggiorenne);

        char iniziale = cognome.charAt(0);




    }
}
