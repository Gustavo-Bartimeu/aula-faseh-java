import java.util.Scanner;

public class CustoDoVeiculo {
    public static void main(String[] args) {
        float valorDeFabrica, valorConsumidorFinal;
        Scanner lerDados = new Scanner(System.in);

        System.out.printf("Digite o custo de fabricação do veículo: ");
        valorDeFabrica = lerDados.nextFloat();
        valorConsumidorFinal = (valorDeFabrica * 0.28f) + (valorDeFabrica + 0.45f) + valorDeFabrica;

        System.out.println("O custo da fabrica para o carro é : " + valorDeFabrica);
        System.out.println("Valor final Somados os impostos e comissão da conssessionária é: "+ valorConsumidorFinal);

    }

}

