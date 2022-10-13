import java.util.Scanner;

public class multiplicacao {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        //Vai permitir escanear a entrada do usuário utilizado apenas uma vez
        Scanner ler = new Scanner(System.in);

            System.out.println("Multiplicação!");
            //Digitar um número 1
            System.out.println("Digite o número 1: ");
            //Ler o número 1
            int n1 = ler.nextInt();
            //Digitar um número 1
            System.out.println("Digite o número 2: ");
            //Ler o número 2
            int n2 = ler.nextInt();
            //Fazer a soma
            int multiplica = n1 * n2;
            //Escrever o resultad
            System.out.println("O resultado da soma é: "+multiplica);
            ler.close();
    }
}
