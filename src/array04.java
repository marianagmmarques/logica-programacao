import java.util.ArrayList;

import javax.swing.JOptionPane;

public class array04 {
    // Desafio incluir a opção alterar!
    public static void main(String[] args) {
        //ArrayList é uma classe java mais flexivel para manipular uma lista.
        ArrayList<String> lista = new ArrayList<String>();
        int seleciona = 0;
    Object[] opcoes = {"Incluir", "Listar", "Alterar", "Apagar" /*"Finalizar"*/};

        do {
            //try{ // Tratando exceções 
            seleciona = JOptionPane.showOptionDialog(null, "O que Deseja?", "Exemplo", 
            JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, opcoes, opcoes[0]);
            //Incluir
            if (seleciona == 0) { //opcao[Selciona].equals("Incluir")
                String item = JOptionPane.showInputDialog("Digite:");
                if (item != null) {
                    lista.add(item); //Guarda o que foi digitado   
                }
            }

            //Listar
            if (seleciona == 1) {
                String msg = "";

                for (String item : lista) {
                    msg += item + "\n";
                }
                if (msg.equals("")) {
                    msg = "\"Lista sem registro\"";
                }

                JOptionPane.showConfirmDialog(null, msg);
            }

            //Alterar
            if (seleciona == 2 /*&& lista.size() > 0*/) {
                if (lista.size() > 0) {

                    Object[] listaAlt = new Object[lista.size()];
                
                for (int i = 0; i < listaAlt.length; i++) {
                    listaAlt[i] = lista.get(i);
                }

                Object itemSelecionado = JOptionPane.showInputDialog(null, "Selecione o item a ser alterado", 
                "Alterar", JOptionPane.INFORMATION_MESSAGE, null, listaAlt, listaAlt[0]);

                String itemAlt = JOptionPane.showInputDialog("Digite:");

                for (int i = 0; i < listaAlt.length; i++) {
                        if(itemSelecionado != null && itemSelecionado.equals(lista.get(i)))
                            lista.set(i, itemAlt);
                        }   

            } else {
                JOptionPane.showMessageDialog(null, "Não possível fazer alteração nenhum item na lista.");
            }
        }
            //Apagar
            if (seleciona == 3 && lista.size() > 0) {
                Object[] listaItem = new Object[lista.size()];

                for (int i = 0; i < listaItem.length; i++) {
                    listaItem[i] = lista.get(i);
                }
                Object itemSelecionado = JOptionPane.showInputDialog(null, "Selecione o item a apagar", 
                "Apagar", JOptionPane.INFORMATION_MESSAGE, null, listaItem, listaItem[0]);

                
                //System.out.println(itemSelecionado.toString());
                for (int i = 0; i < lista.size(); i++) {
                    if (itemSelecionado != null && itemSelecionado.equals(lista.get(i))) {

                        int confirmacao = JOptionPane.showConfirmDialog(null, 
                        String.format("Tem certeza que quer apagar o item %s ", lista.get(i)));
                        if (confirmacao == 0) {
                            lista.remove(i);
                        }
                        
                    }
                }
            }
        //}
            //catch(Exception e){ // Tratando exceções apresentando mensagem de erro para não interromper o sistema abruptamente (Alterar e Apagar sem dados para tratar)
            //    // e.printStackTrace(); //Plota o erro
            //    JOptionPane.showMessageDialog(null, "Não há dados cadastrados!");
            //}
        //Finalizar
        } while (/*seleciona != 4 && */seleciona != -1);

    }
}
