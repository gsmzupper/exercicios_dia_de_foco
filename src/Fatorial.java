import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\tDigite um número e descubra o seu fatorial.");
        int entrada = sc.nextInt();

        long fatorial = 1;
        int i = 1;

        while (i <= entrada) {
            fatorial *= i;
            i++;
        }

        System.out.println("\tO fatorial de " +entrada + " é: " +fatorial);
        sc.close();
    }
}
