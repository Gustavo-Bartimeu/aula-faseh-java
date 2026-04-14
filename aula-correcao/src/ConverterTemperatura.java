import java.util.Scanner;

public class ConverterTemperatura {
    public static void main(String[] args) {
        int celcius, fahrenheit;
        Scanner lerDados = new Scanner(System.in);
        System.out.printf("digite a temperatura em celcius");
        celcius = lerDados.nextInt();
        fahrenheit = ((9*celcius)+160)/5;
        System.out.println("O grau" + celcius + "celsius em fahrenheit é "  + fahrenheit +"º" );

    }
}
