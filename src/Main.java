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
        Scanner coRobic = new Scanner(System.in);
        System.out.println("co chcesz robić po uzyskaniu pełnoletnosci");
        int info = coRobic.nextInt();
        System.out.println(coRobic);

        System.out.println("kompilator służy do pisania programów w danym języku programowania kompiluje on kod tak aby coś powstało");
        System.out.println("1- ctrl + c 2- ");
//        Wydrukuj informację do czego służy kompilator.
//        Wydrukuj informację jakich skrótów użyjesz do zduplikowania fragmentu kodu oraz zaimportowania biblioteki.

//        Po zakończeniu działań w klasie Main i RubInfo dołącz brancha 'task' do 'master' i zaktualizuj GitHuba

    }
}
