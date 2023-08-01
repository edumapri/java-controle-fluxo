import java.util.Scanner;

public class TesteTry2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int idade;

        try{
            System.out.println("Qual é a sua idade?");
            idade = scan.nextInt();
            System.out.println("Sua idade é " + idade);
        }catch(Exception erro){
            System.out.println("Idade inválida!");
        }finally {
            System.out.println("Programa finalizado!");
        }
    }
}
