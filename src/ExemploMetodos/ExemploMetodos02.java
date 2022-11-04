package ExemploMetodos;

public class ExemploMetodos02 {
    public static void main(String[] args) {
        int nFinal = somaRecursiva(15);
        System.out.println(nFinal);
    }

    static int somaRecursiva(int n){
        if (n > 0) {
            return n + somaRecursiva(n - 1);
        } else {
            return 0;
        }
    }
}
