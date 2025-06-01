import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe as 4 notas!");

        System.out.println("Nota 1: ");
        double nota1 = sc.nextDouble();

        System.out.println("Nota 2: ");
        double nota2 = sc.nextDouble();

        System.out.println("Nota 3: ");
        double nota3 = sc.nextDouble();

        System.out.println("Nota 4: ");
        double nota4 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.printf("Média: %.2f\n", media);

        if (media >= 7) {
            System.out.println("Aprovado");
        } else if (media > 5 && media < 7) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
        sc.close();
    }
}
