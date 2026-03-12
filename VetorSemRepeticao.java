import java.util.Scanner;

public class VetorSemRepetidos {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];

        for (int i = 0; i < 10; i++) {

            boolean repetido;

            do {
                repetido = false;

                System.out.print("Digite o número para a posição " + i + ": ");
                vetor[i] = scanner.nextInt();

                for (int j = 0; j < i; j++) {
                    if (vetor[i] == vetor[j]) {
                        repetido = true;
                        System.out.println("Número repetido! Digite um valor diferente.");
                        break;
                    }
                }

            } while (repetido);
        }

        System.out.println("\nNúmeros digitados:");

        for (int i = 0; i < 10; i++) {
            System.out.print(vetor[i] + " ");
        }

        scanner.close();
    }
}

