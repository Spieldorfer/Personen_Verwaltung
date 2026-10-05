import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] schuelerListe = new Student[10]; // Array für max 10 Schüler
        int anzahlSchueler = 0;
        boolean running = true;

        while (running) {
            System.out.println("\n--- Schülerverwaltung ---");
            System.out.println("1. Schüler anlegen");
            System.out.println("2. Schülerliste anzeigen");
            System.out.println("3. Beenden");
            System.out.print("Wähle eine Option: ");

            int wahl = scanner.nextInt();
            scanner.nextLine(); // Scanner Bug (Zeilenumbruch) abfangen

            switch (wahl) {
                case 1:
                    System.out.println("Hier wird später ein Schüler angelegt.");
                    break;
                case 2:
                    System.out.println("Hier wird später die Liste angezeigt.");
                    break;
                case 3:
                    running = false;
                    System.out.println("Programm wird beendet.");
                    break;
                default:
                    System.out.println("Ungültige Eingabe!");
            }
        }
    }
}