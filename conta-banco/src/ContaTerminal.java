import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in); 

        System.out.println("Por favor, digite o número da Agência !");
        int numero = entrada.nextInt();
        
        System.out.println("Por favor, digite o código da Agência !");
        String codigo = entrada.next();

        System.out.println("Por favor, informe o nome do cliente !");
        String nome = entrada.next();

        System.out.println("Por favor, informe o sobrenome do cliente !");
        String sobrenome = entrada.next();

        System.out.println("Por favor, digite o saldo da conta !");
        double saldo = entrada.nextDouble();

        System.out.println("Olá " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é " + codigo +", conta " + numero +  " e seu saldo " + saldo + " já está disponível para saque.");
        
    }
}
