import java.util.Scanner;

public class DolarReal {
    public static void main(String[] args) {
        float dolar, real, cotacao;
        Scanner lerDados = new Scanner(System.in);

        System.out.printf("Digite a quantidade de dolares para converter: ");
        dolar = lerDados.nextFloat();
        System.out.printf("Digit a cotação do dolar do dia: ");
        cotacao = lerDados.nextFloat();

        real = dolar*cotacao;

        System.out.println("Valor da conversão de dolar $ "
                + String.format("%.2f", dolar)
                + " para real R$ " + String.format("%.2f", real) );

    }
}