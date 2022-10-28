import javax.swing.JOptionPane;

public class array03 {
    public static void main(String[] args) {

        int[] numero = new int[5];

        for (int i = 0; i < numero.length; i++) {
            String temp = JOptionPane.showInputDialog("Digite um número:");
            numero[i] = Integer.parseInt(temp);
        }
        //numero[0] = 3;
        //numero[1] = 2;
        //numero[2] = 1;
        String numeroDig = "";
        for (int i : numero) {
         //   System.out.println(i);
         //numeroDig += ", "+i; equivalente
         numeroDig += i+" ";
        }
        JOptionPane.showMessageDialog(null, numeroDig);
    }
}
