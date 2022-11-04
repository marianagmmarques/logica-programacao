package ExemploMetodos;

public class ExemploMetodos01 {
    public static void main(String[] args) {
        ExemploMetodos00.boasVindas();
        ExemploMetodos00.ateLogo();
        int[] numeros = {1,2,3,4};
        ExemploMetodos00.somarNumeros(numeros);
        numeros[0] = 5;
        numeros[1] = 21;
        numeros[2] = 3;
        ExemploMetodos00.somarNumeros(numeros);
        int[] numeros3 = {3,3,5};
        ExemploMetodos00.somarNumeros(numeros3);
        int[] aleatorio = {3,24,5,11,345,67,4,7,99,8};
        System.out.println(ExemploMetodos00.maior(aleatorio));
        System.out.println(ExemploMetodos00.menor(aleatorio));
    }
}
