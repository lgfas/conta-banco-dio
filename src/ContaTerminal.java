import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        //Utilização da classe Scanner para realizar leitura dos dados digitados no terminal
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência: ");        //Mensagem para orientar o usuário
        int numero = scanner.nextInt();                                       //Leitura do dado digitados pelo usuário no terminal, atribuindo-o a uma variável
        scanner.nextLine();                                                   //Consumir linha

        //Repetição do processo para as demais variáveis da conta bancária
        System.out.println("Por favor, digite a Agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo: ");
        double saldo = scanner.nextDouble();

        //Exibir a mensagem conta criada
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " +
                saldo + " já está disponível para saque.");
    }
}
