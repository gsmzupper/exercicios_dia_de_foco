import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\tDigite um número e descubra se ele é primo. Ou digite um número negativo para sair.");
            int valor = sc.nextInt();

            if (valor < 0) {
                System.out.println("\tAté a próxima!");
                break;
            } else {
                boolean ePrimo = true;
                if (valor <= 1) {
                    ePrimo = false;
                } else {
                    for (int i = 2; i < Math.sqrt(valor); i++) {
                        if (valor % i == 0) {
                            ePrimo = false;
                            break;
                        }
                    }
                }
                if (ePrimo) {
                } else {
                    System.out.println(ePrimo);
                    System.out.println(ePrimo);
                }
            }
        }
        sc.close();
    }
}
