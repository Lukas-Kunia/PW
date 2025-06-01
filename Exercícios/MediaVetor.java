import java.util.Scanner;

public class MediaVetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] notas = new double[3];
        double soma = 0;

        System.out.println("Digite as 3 notas: ");

        for (int i = 0; i < 3; i++) {
            System.out.printf("Notas %d: ", i + 1);
            notas[i] = sc.nextDouble();
            soma += notas[i];
        }
        double media = soma / 3;
        System.out.printf("Sua média foi: %.2f\n", media);
        if (media >= 7) {
            System.out.println("Aprovado");
        } else if (media >= 5 && media < 7) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
        sc.close();
    }
}
