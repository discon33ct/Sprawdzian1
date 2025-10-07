import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz imię i nazwisko");
        String name = scanner.nextLine();
        System.out.println("Podaj wiek");
        int age = scanner.nextInt();
        System.out.println("Witaj " + name + ". Za " + (18 - age) + " lata będę miał 18 lat!");
//        Na branchu o nazwie 'task' w następnej linii pobierz od użytkownika i wydrukuj pierwszą rzecz, jaką chce robić po uzyskaniu pełnoletności


    }
}
