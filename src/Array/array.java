package Array;
public class array {
    /**
     * @param args
     */
    public static void main(String[] args) {
        String[] pessoas = {"Chaves","Seu Madruga","Dona Florinda","Kiko","Chiquinha"};
        System.out.println(pessoas.length);

        for (int i = 0; i < pessoas.length; i++) {
            System.out.println(pessoas[i]);
        }
        System.out.println("-----------------");

        pessoas[0] = "Professor Girafales";
        //Utilizado com ARRAYS foreach
        for (String pessoa : pessoas) {
            System.out.println(pessoa);
        }
    }
}
