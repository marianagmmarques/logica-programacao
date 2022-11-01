public class ExemploMetodos00 {
    //public static void main(String[] args) {
    //    //System.out.println("Teste".equals("TESTE"));
    //    //System.out.println("Teste".equals("Teste"));
    //    boasVindas();
    //    boasVindas();
    //    boasVindas();
    //    boasVindas();
    //    boasVindas();
    //    boasVindas();
    //}

    // Static é um método que pertence a classe
    // Static não exije a obrigação de declarar o objeto para usar

    static void boasVindas(){
        System.out.println("Seja bem vindo!");
    }

    static void ateLogo(){
        System.out.println("Volte sempre!");
    }

    static void somarNumeros (int[] numeros){
        int total = 0;
        for (int n : numeros) {
            total += n;
        }
        System.out.println(total);
    }

    static int maior (int[] numeros){
        int maior = -9999999;
        for (int n : numeros) {
            if(n > maior){
                maior = n;
            } 
        }
        return maior;
    }

    static int menor (int[] numeros){
        int menor = 9999999;
        for (int n : numeros) {
            if(n < menor){
                menor = n;
            } 
        }
        return menor;
    }
}
