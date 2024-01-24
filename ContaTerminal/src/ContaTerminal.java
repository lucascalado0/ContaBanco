import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        int NumeroConta;
        String Agencia, NomeCliente = "Lucas Vinicius Vieira Calado";
        double Saldo = 1000.00;

        System.out.println("Iniciando atendimento: ");

        System.out.println("Por favor, informe o número da sua Conta : ");
        NumeroConta = scanner.nextInt();

        System.out.println("Por favor informe, informe o número da sua Agência: ");
        Agencia = scanner.next();

        System.out.println("_______________________________________________\n");

        System.out.println("Olá ".concat(NomeCliente) + ",\nobrigado por ter uma conta em nosso banco,\nAgência: " + Agencia + "\nConta: " + NumeroConta + "\nSaldo: " + Saldo + ".\nSaldo disponível para saque." );

        
        
    }
}
