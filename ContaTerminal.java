import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
	public static void main(String[] args) throws Exception {
		//TODO:Conhecer e importar a classe Scanner
		
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		int numero;
		String agencia;
		String nomeCliente;
		double saldo;
		
		//Exibir a mensagem para o nosso usuário
		
		System.out.println("Olá, Bem-Vindo(a) ao BankJF o seu banco favorito.");
		System.out.println("=================================================");
		
		//Obter pela scanner os valores digitados no terminal
		System.out.println("Para começar, Digite o número da Conta: (Ex. XXXX)");
		numero = scanner.nextInt();
		
		System.out.println("Digite o número da Agência: (Ex. XXX-X)");
		agencia = scanner.next();
		
		System.out.println("Digite seu Nome: ");
		nomeCliente = scanner.next();
		
		System.out.println("Digite o Saldo da Conta: ");
		saldo = scanner.nextDouble();
		
		//Exibir a mensagens criadas na conta
		System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque!");
	}
}
