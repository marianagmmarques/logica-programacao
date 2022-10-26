import java.util.ArrayList;

import javax.swing.JOptionPane;

public class array04 {
    // Desafio incluir a opção alterar!
    public static void main(String[] args) {
        //ArrayList é uma classe java mais flexivel para manipular uma lista.
        ArrayList<String> lista = new ArrayList<String>();
        int seleciona = 0;
        Object[] opcoes = {"Incluir", "Listar", "Apagar", "Finalizar"};

        do {
            seleciona = JOptionPane.showOptionDialog(null, "O que Deseja?", "Exemplo", 
            JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, opcoes, opcoes[0]);

            if (seleciona == 0) { //opcao[Selciona].equals("Incluir")
                String item = JOptionPane.showInputDialog("Digite:");
                lista.add(item); //Guarda o que foi digitado
            }

            if (seleciona == 1) {
                String msg = "";

                for (String item : lista) {
                    msg += item + "\n";
                }
                JOptionPane.showConfirmDialog(null, msg);
            }  

            if (seleciona == 2) {
                Object[] listaItem = new Object[lista.size()];

                for (int i = 0; i < listaItem.length; i++) {
                    listaItem[i] = lista.get(i);
                }
                Object itemSelecionado = JOptionPane.showInputDialog(null, "Selecione o item a apagar", 
                "Apagar", JOptionPane.INFORMATION_MESSAGE, null, listaItem, listaItem[0]);
                //System.out.println(itemSelecionado.toString());
                for (int i = 0; i < lista.size(); i++) {
                    if (itemSelecionado.toString().equals(lista.get(i))) {
                        lista.remove(i);
                    }
                }
            }
        } while (seleciona != 3);

    }
}
