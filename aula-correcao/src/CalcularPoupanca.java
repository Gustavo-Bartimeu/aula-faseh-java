import java.util.Scanner;

public class CalcularPoupanca {
    public static void main(String[] args) {
        float deposito, rendimentoMensal;
        Scanner lerDados = new Scanner(System.in);
        System.out.printf("Digite o valor do depósito: ");
        deposito = lerDados.nextFloat();
        rendimentoMensal = (deposito * 0.07f) + deposito;

        System.out.println("O valor depositado após um mês com rendimento 0,70% é: " + rendimentoMensal);
    }
}
