import java.util.Scanner;

public class ExercicioVetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5]; // Isso cria um vetor de 5 posições, chamado numeros, que guarda valores inteiros
        int soma = 0; // Isso cria uma variável chamada soma e inicializa ela com zero. Ela vai guardar o total da soma dos números que o usuário digitar.

        System.out.println("Insira cinco números inteiros: ");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
            soma += numeros[i]; // somando os números
        }
        System.out.println("\nNúmeros digitados:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posição [" + i + "]:" + numeros[i]);
        }
        System.out.println("\nA soma dos números é: " + soma);
        sc.close();
    }
}
