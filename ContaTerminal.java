import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in).useLocale(Locale.US);
    System.out.println("Informe o número da conta:");
    int conta = sc.nextInt();

    System.out.println("Informe a agência:");
    String agencia = sc.next();

    System.out.println("Informe o saldo:");
    double saldo = sc.nextDouble();

    System.out.println("Informe o nome do cliente:");
    String nome = sc.nextLine();

    System.out.println("Olá " + nome + " obrigada por criar sua conta em nosso banco. Sua agencia é " + agencia
        + ", conta 123" + conta + " e seu saldo R$ " + saldo + "já está disponível para saque.");

  }
}
