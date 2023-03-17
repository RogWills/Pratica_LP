package br.com.newton;

import java.util.Scanner;
import javax.swing.JOptionPane;
import br.com.newton.Hamburguer;
import br.com.newton.Pizza;

public class RestauranteMain {

    String pedido="", nome;
    Double valor;

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null,"Bem vindo ao Restaurante Newton");

        String pedido = JOptionPane.showInputDialog("Selecione seu pedido: \n 1. Hamburger \n 2. Pizza \n 3. Sair");
        if (pedido.equals("1")) {
            Hamburguer h = new Hamburguer();
            h.nome = (JOptionPane.showInputDialog(null, "Qual o nome do hamburguer ?"));
            h.valor = Double.parseDouble(JOptionPane.showInputDialog(null, "valor do " + h.nome + " ?"));
            String artesanaldigitada = (JOptionPane.showInputDialog(null, "voce quer o artesanal ? \n 1. Sim \n 2. Não "));
            boolean artesanalParaCalculo;

            if (artesanaldigitada.equals("1")){
                artesanalParaCalculo = true;
            }
            else {
                artesanalParaCalculo = false;
            }
            Double valortotal = h.calcularvalor(artesanalParaCalculo);

            JOptionPane.showMessageDialog(null,"Valor do pedido e : R$ "+ valortotal ,"Pedido resumo",JOptionPane.INFORMATION_MESSAGE );
        }
    }
}
