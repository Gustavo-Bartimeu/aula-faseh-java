import java.util.Scanner;

public class ConsumoMedio {
    public static void main(String[] args) {
        float distanciaTotal, totalCombustivelGasto, resultado;
        Scanner lerDados = new Scanner(System.in);

        System.out.printf("digite a distacia percorrida :");
        distanciaTotal = lerDados.nextFloat();
        System.out.printf("digite o consumo total de combustivel");
        totalCombustivelGasto = lerDados.nextFloat();
        resultado = distanciaTotal/totalCombustivelGasto;
        System.out.println("o consumo medio do veiculo é:" + resultado + "km/l");

    }
}
