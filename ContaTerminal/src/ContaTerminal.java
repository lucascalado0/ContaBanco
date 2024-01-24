import java.util.Scanner; //importa classe scanner que permite interação com um usuário

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in); //declarando a classe scanner

        int NumeroConta; //variavel inteira
        String Agencia, NomeCliente = "Lucas Vinicius Vieira Calado"; //variáveis do tipo string
        double Saldo = 1000.00; //variável para números com casas decimais

        System.out.println("Iniciando atendimento: "); // imprimindo início do progroma

        System.out.println("Por favor, informe o número da sua Conta : "); // Texto solicitando a entrada do número da conta
        NumeroConta = scanner.nextInt(); //scanner que permite ao usuário informar o número da sua conta

        System.out.println("Por favor informe, informe o número da sua Agência: "); //Texto solicitando a entrada do número de agência
        Agencia = scanner.next(); //scanner que permite ao usuário informar o número da sua agência

        System.out.println("_______________________________________________\n"); 

        System.out.println("Olá ".concat(NomeCliente) + ",\nObrigado por ter uma conta em nosso banco.\nAgência: " + Agencia + "\nConta: " + NumeroConta + "\nSaldo: " + Saldo + ".\nSaldo disponível para saque." ); //Texto concatenando as informações recebidas e as variáveis já declaradas

        
        
    }
}
