import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\tDigite o número base para calcular o expoente. ");
        double base = sc.nextDouble();

        System.out.println("\tDigite o expoente. ");
        int expoente = sc.nextInt();

        double resultado = 1.0;
        for (int i = 0; i < expoente; i++) {
            resultado *= base;
        }

        System.out.printf("\tO %.2f ele vado ao expoente %d é : %.2f. ", base, expoente, resultado);
        sc.close();
    }
}
