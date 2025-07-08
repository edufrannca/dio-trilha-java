import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // TODO: Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in);

        // Exibir as mensagens para o usuário
        System.out.println("Digite o número da sua agência: ");
        int agencia = scanner.nextInt();

        System.out.println("Digite o número da sua conta: ");
        int numeroDaConta = scanner.nextInt();

        // Consumir a quebra de linha pendente
        scanner.nextLine();

        System.out.println("Digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        // Exibir a mensagem conta criada
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco!");
        System.out.println("Sua agência é: " + agencia);
        System.out.println("Seu número de conta é: " + numeroDaConta);

        scanner.close();
    }
}