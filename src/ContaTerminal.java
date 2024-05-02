import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nomeCliente = leitura.nextLine();
        System.out.println("Digite o número da conta: ");
        int conta = leitura.nextInt();
        System.out.println("Digite o número da agência (xxx-x): ");
        String agencia = leitura.next();
        System.out.println("Digite o seu saldo: ");
        float saldo = leitura.nextFloat();

        System.out.println("**************************");
        System.out.println("Olá " +nomeCliente+" ," +
                " obrigado por criar uma conta em nosso banco, sua agência é "+agencia+" " +
                ", conta "+conta+ " e seu saldo "+saldo+ " já está disponível para saque");
    }
}