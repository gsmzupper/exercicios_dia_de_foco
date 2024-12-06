import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número que deseja ver a sequência de Fibonacci: ");
        int fibonacci = sc.nextInt();

        int primeiro = 0, segundo = 1;

        if (fibonacci <= 0) {
            System.out.println("O número tem que ser maior que 0.");
        } else {
            System.out.print("Esta é a sequência: ");
            for (int i = 0; i < fibonacci; i++) {
                System.out.print(primeiro + " ");
                int proximo = primeiro + segundo;
                primeiro = segundo;
                segundo = proximo;
            }
            System.out.println();
        }
        sc.close();
    }
}