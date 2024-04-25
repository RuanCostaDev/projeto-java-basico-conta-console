import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCLiente;
        double saldo;

        System.out.println("Digite o numero da conta:");
        numero = Integer.parseInt(scanner.nextLine());

        System.out.println("Digite o numero da agência:");
        agencia = scanner.nextLine();

        System.out.println("Digite o nome do cliente:");
        nomeCLiente = scanner.nextLine();

        System.out.println("Digite o saldo da conta:");
        saldo = Double.parseDouble(scanner.nextLine());
        
        scanner.close();

        System.out.println("Olá " + nomeCLiente +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + 
        ",conta " + numero + " e seu saldo de " + saldo + " já está disponível para saque");

    }
}
