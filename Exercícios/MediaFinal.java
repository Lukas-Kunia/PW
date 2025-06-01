import java.util.Scanner;

public class MediaFinal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite as 3 notas!: ");
        System.out.println("Informe nota 1: ");
        double nota1 = sc.nextDouble();
        System.out.println("Informe nota 2: ");
        double nota2 = sc.nextDouble();
        System.out.println("Informe nota 3: ");
        double nota3 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("Sua média foi: %.2f\n", media);

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
