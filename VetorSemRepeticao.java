import java.util.Scanner;

public class VetorSemRepeticao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            int num = sc.nextInt();

            boolean repetido = false;

            for (int j = 0; j < i; j++) {
                if (vetor[j] == num) {
                    repetido = true;
                    break;
                }
            }

            if (repetido) {
                System.out.println("Número repetido! Digite outro.");
                i--;
            } else {
                vetor[i] = num;
            }
        }

        System.out.println("Números digitados:");

        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }

        sc.close();
    }
}
