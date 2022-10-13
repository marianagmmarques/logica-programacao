import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        //Introdução
        System.out.println("Calculadora");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        //Escolhendo a operação e lendo a opção escolhida
        System.out.println("Escolha uma operação: ");
        String operador = ler.nextLine();
        //Digitando primeiro número
        System.out.println("Digite o número 1: ");
        int n1 = ler.nextInt();
        //Digitando segundo número
        System.out.println("Digite o número 2: ");
        int n2 = ler.nextInt();
        //Atribuindo nulo ao resultado
        int resultado = 0;
        //Realizando os cálculos que foi escolhido
        switch (operador) {
            case "1":
               resultado = n1 + n2;
                break;
            case "2":
                resultado = n1 - n2;
                break;
            case "3":
                resultado = n1 * n2;
                break;
            case "4":
                resultado = n1 / n2;
                break;
            default:
                System.out.println("Tipo de operação não identificada.");
                break;
        }
        // Apresentando o resultado final
        System.out.println("Resultado: "+resultado);
        ler.close();
    }
}
