import java.util.Scanner;
public class NotasDosAlunos {

    public static void main(String[] args) {
        float nota1, nota2, nota3, resultado;
        Scanner lerDados = new Scanner(System.in);
        System.out.printf("Digite a primeira nota: ");
        nota1 = lerDados.nextFloat();
        System.out.printf("Digite a segunda nota: ");
        nota2 = lerDados.nextFloat();
        System.out.printf("Digite a terceira nota: ");
        nota3 = lerDados.nextFloat();

        resultado = (nota1+nota2+nota3)/3;

        if(resultado>=7.0f & resultado<=10.0f){
            System.out.println("Você foi aprovado com a média: "+ resultado);
        }
        else if (resultado<=5.0f & resultado>=0.0f){
            System.out.println("Você foi reprovado com a média: "+ resultado);
        }
        else if( resultado > 5.0f & resultado < 7.0f){
            System.out.println("Você está em recuperaçao com a média: "+ resultado);
        }else {
            System.out.println("Dados invalidos");
        }
    }
}