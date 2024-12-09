import java.util.Scanner;

public class Palindromo {
    public static boolean ehPalindromo(int numero) {
        String valor = String.valueOf(numero);
        int tamanho = valor.length();

        for (int i = 0; i < tamanho / 2; i++) {
            if (valor.charAt(i) != valor.charAt(tamanho - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\tDigite um número e descubra se ele é um palíndromo ou não: \n"
                    + "\tOu digite um valor negativo para sair: ");

            int entrada = sc.nextInt();
            if (entrada < 0) {
                System.out.println("\tAté a próxima!");
                break;
            } else {
                System.out.println(ehPalindromo(entrada));
            }
        }
        sc.close();
    }
}
