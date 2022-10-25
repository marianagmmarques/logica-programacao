public class array02 {
    public static void main(String[] args) {
        // {"A","B","C","D"} Posição [0] {"E","F","G","H"} posição [1] {"I","J","K","N"} posição [2] > [Próximo colchete é do elemento desejado dentro da posição]
        String[][] lista = {{"A","B","C","D"}, {"E","F","G","H"}, {"I","J","K","N"}};
        System.out.println(lista[2][3]);
    }
}
