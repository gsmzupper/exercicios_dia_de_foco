import java.util.Scanner;

public class CalculaCaracteres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\tDigite um número e descubra quantos caracteres ele possui. \n"
                    +"\tOu digite um número negativo para encerrar o programa.");
            int entrada = sc.nextInt();

            if (entrada < 0) {
                System.out.println("\tAté a próxima! ");
                break;
            }
                String converteValor = String.valueOf(entrada);
                int tamanho = converteValor.length();
String menssagem = tamanho == 1 ? "\tO número que você digitou possui " +tamanho +" caractere" : "\tO número que você digitou possui " +tamanho +" caracteres";
System.out.println(menssagem);
        }

        sc.close();
    }
}
