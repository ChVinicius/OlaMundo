import java.util.Scanner;

public class Welcome {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Olá mundo " + nome);


        }

    }
