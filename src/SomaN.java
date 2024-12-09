import java.util.Scanner;

public class SomaN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\tDigite que número deseja somar: ");
        int entrada = sc.nextInt();

        System.out.println("\tQuantas vezes você deseja somar o número " +entrada +" : ");
        int quantidade = sc.nextInt();

        int resultado = 0;
        for (int i = 0; i < quantidade; i++) {
            resultado += entrada;
        }

        System.out.println("\tA sua soma é: " +resultado);
        sc.close();
    }
}
