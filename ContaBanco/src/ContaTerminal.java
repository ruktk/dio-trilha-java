import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        Locale locale = Locale.ENGLISH;
        scanner.useLocale(locale);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Digite o número da conta: ");
        numero = scanner.nextInt();
        System.out.println("Digite a agência: ");
        agencia = scanner.next();
        System.out.println("Digite o nome do cliente: ");
        scanner.nextLine();
        nomeCliente = scanner.nextLine();
        System.out.println("Digite o saldo: ");
        saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
        scanner.close();
    }
}
