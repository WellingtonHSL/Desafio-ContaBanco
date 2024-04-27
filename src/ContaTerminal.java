import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta:");
        int numero = sc.nextInt();
        System.out.println("Por favor, agora digite o número da Agência:");
        sc.nextLine();
        String agencia = sc.nextLine();
        System.out.println("Por favor, digite seu nome:");
        String nomeConta = sc.nextLine();
        System.out.println("Por favor, digite o valor do depósito inicial:");
        double saldo = sc.nextDouble();

        System.out.println("Olá "+nomeConta+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+String.format("%.2f", saldo)+" já está disponível para saque.");
        sc.close();
    }
}