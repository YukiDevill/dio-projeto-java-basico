import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite os números da sua conta:");
        int numero = scanner.nextInt();
        System.out.println("Digite os números da sua agência, contendo traço:");
        String agencia = scanner.next();
        System.out.println("Digite seu 1º nome:");
        String nome = scanner.next();
        System.out.println("Digite seu último nome:");
        String sobrenome = scanner.next();
        System.out.println("Digite seu saldo:");
        double saldo = scanner.nextDouble();


        System.out.println("Olá "+nome+" "+sobrenome+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponivél para saque.");


    }
}
