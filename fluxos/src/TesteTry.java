import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class TesteTry {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.print("\nDigite o seu nome: ");
            String nome = scanner.next();

            System.out.print("\nDigite o seu sobrenome: ");
            String sobrenome = scanner.next();

            System.out.print("\nDigite a sua idade: ");
            int idade = scanner.nextInt();

            System.out.print("\nDigite a sua altura: ");
            double altura = scanner.nextDouble();

            System.out.println("\nOla, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Tenho " + idade + " anos");
            System.out.println("Minha altura é " + altura + " m");
            scanner.close();
        } catch (InputMismatchException e) {
            System.out.println("Algum dos seguintes dados foi iserido incorretamente: idade, altura?");
        }
    }
}

