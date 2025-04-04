import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, digite o número da conta: ");
        int conta = sc.nextInt();
        sc.nextLine();

        System.out.print("Agora, digite o número da agência: ");
        String agencia = sc.nextLine();

        System.out.print("Agora, digite seu nome: ");
        String nomeCliente = sc.nextLine();

        System.out.print("E por último, digite seu saldo: ");
        double saldo = sc.nextDouble();

        System.out.println("Olá, " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + ", conta " + conta + " e seu saldo de R$" + saldo + " já está disponível para saque.");

    }
}
