import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numeroConta;
        String agencia, nomeCliente;
        float saldo;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o nome do cliente: ");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o número da conta: ");
        numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o número da agencia: ");
        agencia = scanner.next();

        System.out.println("Por favor, digite o saldo da conta: ");
        saldo = scanner.nextFloat();

        System.out.printf("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.\n\n");
    }
}
