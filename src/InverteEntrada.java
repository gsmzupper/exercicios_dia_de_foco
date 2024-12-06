import java.util.Scanner;

public class InverteEntrada {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true) {

            System.out.println("\tDigite o valor que você deseja inverter. Ou digite (sair) para encerrar o programa.");
            String entrada = sc.nextLine();

            if (entrada.equalsIgnoreCase("sair")) {
                System.out.println("\tAté a próxima! ");
                break;
            } else {
                if (entrada.equalsIgnoreCase("0")) {
                    System.out.println("\tDigite um valor maior que (0)");
                } else {
                    String saida = new StringBuilder(entrada).reverse().toString();
                    System.out.println("\tO número que você digitou invertido fica assim: " + saida);
                }
            }
        }
        sc.close();
    }
}
