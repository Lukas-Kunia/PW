import java.util.Scanner;

public class ExemploSimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome> ");
        String nome = sc.nextLine();
        System.out.println("Olá, " + nome + "! Bem-vindo ao Java.");
        sc.close();
    }
}