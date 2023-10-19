/*
Twoim zadaniem jest stworzenie klasy Konto, która będzie reprezentować indywidualne konto w banku. Klasa powinna posiadać następujące elementy:

Atrybuty:
numerRachunku (String): Numer rachunku bankowego, który identyfikuje konkretne konto w systemie bankowym.
stanKonta (double): Aktualny stan konta.
debet (boolean): Informacja, czy na koncie można wchodzić na debet (true) lub nie (false).
Do każdego z pól utwórz gettery i settery.

Metody:
wplacSrodki(double kwota): Metoda ta pozwala na wpłacenie określonej kwoty na konto bankowe. Kwota zostaje dodana do stanu konta.
wyplacSrodki(double kwota): Metoda ta umożliwia wypłacenie określonej kwoty z konta bankowego. Jeśli na koncie można wchodzić na debet (pole debet ustawione na true), to stan konta może być ujemny po tej operacji. W przeciwnym razie wyświetl odpowiedni komunikat, że operacja nie jest możliwa.
sprawdzStanKonta(): Metoda ta zwraca bieżący stan konta.


Utwórz instancję klasy Konto na podstawie informacji wprowadzonych przez użytkownika w konsoli, takich jak numer rachunku, początkowy stan konta oraz informacja czy na koncie można wchodzić na debet.

Wykonaj kilka operacji, takich jak wpłaty i wypłaty środków, korzystając z odpowiednich metod.

Wyświetl stan konta przed i po wykonaniu operacji, a także numer rachunku.

Dodatkowo, przetestuj działanie innych metod.
 */
package bank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wybor = scanner.nextInt();
    Konto konto = new Konto();
    }
    public static void stanKonta(){
        System.out.println("Stan Twojego konta to:" + konto.get ;);
    }

}

