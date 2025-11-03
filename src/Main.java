import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite string za provjeru: ");
        String znakovi = sc.nextLine().toLowerCase();
        int brojSlova = 0, brojBrojeva = 0, brojZnakova = 0;

        for (int i = 0; i < znakovi.length(); i++) {
            if (znakovi.charAt(i) >= 'a' && znakovi.charAt(i) <= 'z') {
                brojSlova++;
            } else if (znakovi.charAt(i) >= '0' && znakovi.charAt(i) <= '9') {
                brojBrojeva++;
            } else {
                brojZnakova++;
            }
        }

        System.out.printf("Slova: %d%n", brojSlova);
        System.out.printf("Brojevi: %d%n", brojBrojeva);
        System.out.printf("Ostali znakovi: %d%n", brojZnakova);
    }
}