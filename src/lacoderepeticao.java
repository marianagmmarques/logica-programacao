public class lacoderepeticao {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int contar = 0; //i indice
        
        while (contar <= 10) {
            System.out.println(contar+" < Dentro do loop While");
            contar++; // Igual contar = contar + 1;
        }
        System.out.println("-----------------");
        do {
            contar--; // Igual contar = contar - 1;
            System.out.println(contar+" < Dentro do loop WHILE");
        } while (contar >= 1);
        System.out.println("-----------------");
        //Número Ímpar
        for (int i = 1; i <= 20; i+=2) {
            System.out.println(i);
        }
        System.out.println("-----------------");
        //Número Ímpar
        for (int i = 0; i <= 20; i+=2) {
            System.out.println(i);
        }
    }
}
