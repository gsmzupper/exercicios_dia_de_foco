import java.util.Scanner;

public class MultiploDeUmNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\tDigite um número inteiro! ");
        int numero = sc.nextInt();

        System.out.println("\tDigite qual é o limite das multiplicações. ");
        int limite = sc.nextInt();

        System.out.printf("\tOs multiplos de %d até %d é : ", numero, limite);
        for (int i = 1; i * numero <= limite; i++) {
            System.out.print(i * numero +" ");
        }
        sc.close();
    }
}
