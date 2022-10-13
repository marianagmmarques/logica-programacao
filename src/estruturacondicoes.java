public class estruturacondicoes {

    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception{
        // Operações de Comparação
        System.out.println("Operações de Comparação");
        int x = 20;
        int y = 10;
        System.out.println(x == y); //false
        System.out.println(x != y); //true
        System.out.println(x > y); //true
        System.out.println(x < y); //false
        System.out.println(x >= y); //true
        System.out.println(x <= y); //false
        System.out.println("-------------------");
        // Operações de Comparação
        System.out.println("Operações Lógicas");
        boolean a = true;
        System.out.println(a && true && 3<8);
        boolean aula;
        boolean diaSemana = true;
        boolean feriado = false;
        aula = diaSemana && !feriado;
        System.out.println(aula);
    }
    
}
