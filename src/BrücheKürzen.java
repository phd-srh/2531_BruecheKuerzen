import java.util.Scanner;

public class BrücheKürzen {
    public static void main(String[] args) {
        Scanner eingabe = new Scanner( System.in );
        System.out.print("Zähler: ");
        int zähler = eingabe.nextInt();
        System.out.print("Nenner: ");
        int nenner = eingabe.nextInt();

        System.out.println("Der Bruch lautet: " + zähler + "/" + nenner);

        // 1) ggT finden (gemeinser Teiler der beiden Zahlen Zähler und Nenner = Euklid)
        int a = zähler;
        int b = nenner;
        while (a != b) {
            if (a > b) {
                a = a - b;
            }
            else {
                b = b - a;
            }
        }
        int teiler = a;

        // 2) Zähler und Nenner durch den ggT teilen
        zähler = zähler / teiler;
        nenner = nenner / teiler;
        System.out.println("Der gekürzte Bruch lautet: " + zähler + "/" + nenner);
    }
}
