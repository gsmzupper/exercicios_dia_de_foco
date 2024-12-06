import java.util.Scanner;

public class BinarioParaDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\tDigite o valor binário que deseja converter para decimal. ");
        String binario = sc.nextLine();

        if (binario.equalsIgnoreCase("0")) {
            System.out.println("\tO valor binário que você digitou em decimal é: " +binario);
        } else {
            int decimal = Integer.parseInt(binario, 2);
            System.out.println("\tO valor que você digitou em binário convertido para decimal é: " +decimal);
        }
        sc.close();
    }
}
