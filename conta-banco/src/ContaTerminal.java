import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Ele vai solicitar que o usuário coloque o número da agência
        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        // Ele vai solicitar para o usuário colocar o número da conta
        System.out.print("Por favor, coloque o número da conta: ");
        int numero = scanner.nextInt();

        // Consumir a quebra de linha pendente
        scanner.nextLine();

        // Ele vai solicitar que o usuário coloque o nome do cliente ou do dono da conta
        System.out.print("Por favor, coloque o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        // Ele vai solicitar que o usuário coloque o saldo da conta
        System.out.print("Por favor, coloque o saldo da conta: ");
        double saldo = scanner.nextDouble();

        // Vai fechar o scanner
        scanner.close();

        // Ele vai exibir uma mensagem informando todos os dados inseridos
        System.out.println("Olá, " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para seu saque.");
    }
}
