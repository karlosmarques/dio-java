import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
       ContaBanco contaBanco = new ContaBanco();

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, diga o seu numero:");
        contaBanco.numero = sc.nextInt();

        System.out.println("Por favor, digite sua agencia:");
        contaBanco.agencia = sc.nextInt();

        System.out.println("Por favor, digite seu nome:");
        contaBanco.nomeClinte = sc.next();

        System.out.println("Por favor, digite seu saldo:");
        contaBanco.saldo = sc.nextInt();

        System.out.println("ola" + contaBanco.nomeClinte + ",  obrigado por criar uma conta em nosso banco, sua agência é" + contaBanco.agencia + ", conta" + contaBanco.numero + "e seu saldo" + contaBanco.saldo + " já está disponível para saque");
        
    }
}
