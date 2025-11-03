import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite string koji zelite okrenuti: ");
        String zapis = sc.nextLine();
        String[] privremeniZapis = zapis.split("\\s");
        int brojRijeci = privremeniZapis.length;

        for (int i = 0; i < brojRijeci / 2; i++) {
            String s = privremeniZapis[i];
            privremeniZapis[i] = privremeniZapis[brojRijeci - 1 - i];
            privremeniZapis[brojRijeci - 1 - i] = s;
        }

        String obrnutiZapis = String.join(" ", privremeniZapis).replaceAll("\\s+", " ");

        System.out.println(obrnutiZapis);
    }
}
