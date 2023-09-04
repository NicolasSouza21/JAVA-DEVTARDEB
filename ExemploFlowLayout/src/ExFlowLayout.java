import javax.swing.*;
import java.awt.*;


public class ExFlowLayout {
    public ExFlowLayout(){
        JFrame janela = new JFrame("Janela Principal");
        //mudar o layout padrao
        FlowLayout flow = new FlowLayout();
        janela.setLayout(flow); // mudei o layout
        //adicionar componente no layout
        janela.add(new JLabel("Informe o valor:"));
        JTextField input1 = new JTextField(25);   
        janela.add(input1);
        JButton botao1 = new JButton("Enviar");
        janela.add(botao1);
        janela.pack();
        janela.setDefaultCloseOperation(2);
        janela.setVisible(true);


    }
    
}
