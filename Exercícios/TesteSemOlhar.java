import java.util.Scanner;

public class TesteSemOlhar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas notas você quer informar? (Inteiro Positivo) ");
        int tamanho = sc.nextInt();
        double[] notas = new double[tamanho];
        double soma = 0;
        double media;
        for (int i = 0; i < tamanho; i++) {
            System.out.printf("Informe a nota %d: ", i + 1);
            notas[i] = sc.nextDouble();
            soma += notas[i];
        }
        media = soma / tamanho;
        if (media >= 7) {
            System.out.println("Aprovado");
        } else if (media >= 5) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
        System.out.printf("Sua média foi: %.2f\n", media);
        sc.close();
    }
}
