public class ifelse {
     /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        boolean x = true;
        //Pode executar sozinho ou com senão
        if(x){
            System.out.println("Só executa se verdadeiro.");
        } 
        if(x == false){
            System.out.println("Só executa se verdadeiro.");
        } else {
            System.out.println("Só executa se falso.");
        }
        int c = 2;
        if(c == 2){
            System.out.println("Dois");
        }else if(c == 4){
            System.out.println("Quatro");
        }else{
            System.out.println("Nenhum dos dois.");
        }

        if(c == 2){
            System.out.println("C = 2");
        }
        if(c == 2){
            System.out.println("Irá retornar 2");
        }

        String key = "/";
        switch (key) {
            case "+":
                System.out.println("Somar");
                break;
            case "-":
                System.out.println("Subtrair");
                break;
            case "*":
                System.out.println("Multiplicar");
                break;
            case "/":
                System.out.println("Dividir");
                break;
            default:
                System.out.println("Tipo de operação não identificada.");
                break;
        }
    }
}
