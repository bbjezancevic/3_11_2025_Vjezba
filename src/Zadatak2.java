import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite string koji zelite okrenuti: ");
        String zapis = sc.nextLine();
        String[] obrnutiZapis = zapis.split("\\s");
        int brojRijeci = obrnutiZapis.length;
        for (int i = (brojRijeci - 1); i >= 0; i--) {
            System.out.print(obrnutiZapis[i] + " ");
        }

    }
}
